.class public final La/m92;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:J

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BJLa/yje;La/diu0;Z)V
    .locals 0

    .line 15
    iput-byte p1, p0, La/m92;->i:B

    iput-object p5, p0, La/m92;->m:Ljava/lang/Object;

    iput-wide p2, p0, La/m92;->k:J

    iput-boolean p6, p0, La/m92;->l:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/fga0;ZJLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/m92;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/m92;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p2, p0, La/m92;->l:Z

    .line 7
    .line 8
    iput-wide p3, p0, La/m92;->k:J

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/m92;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/m92;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/m92;

    .line 9
    .line 10
    move-object v7, v1

    .line 11
    check-cast v7, La/tzt0;

    .line 12
    .line 13
    iget-boolean v8, p0, La/m92;->l:Z

    .line 14
    .line 15
    const/4 v3, 0x6

    .line 16
    iget-wide v4, p0, La/m92;->k:J

    .line 17
    .line 18
    move-object v6, p1

    .line 19
    invoke-direct/range {v2 .. v8}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_0
    move-object v7, p1

    .line 24
    new-instance v3, La/m92;

    .line 25
    .line 26
    move-object v8, v1

    .line 27
    check-cast v8, La/hxd0;

    .line 28
    .line 29
    iget-boolean v9, p0, La/m92;->l:Z

    .line 30
    .line 31
    const/4 v4, 0x5

    .line 32
    iget-wide v5, p0, La/m92;->k:J

    .line 33
    .line 34
    invoke-direct/range {v3 .. v9}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :pswitch_1
    move-object v7, p1

    .line 39
    new-instance v3, La/m92;

    .line 40
    .line 41
    move-object v4, v1

    .line 42
    check-cast v4, La/fga0;

    .line 43
    .line 44
    iget-boolean v5, p0, La/m92;->l:Z

    .line 45
    .line 46
    move-object v8, v7

    .line 47
    iget-wide v6, p0, La/m92;->k:J

    .line 48
    .line 49
    invoke-direct/range {v3 .. v8}, La/m92;-><init>(La/fga0;ZJLa/yje;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :pswitch_2
    move-object v7, p1

    .line 54
    new-instance v3, La/m92;

    .line 55
    .line 56
    move-object v8, v1

    .line 57
    check-cast v8, La/wk40;

    .line 58
    .line 59
    iget-boolean v9, p0, La/m92;->l:Z

    .line 60
    .line 61
    const/4 v4, 0x3

    .line 62
    iget-wide v5, p0, La/m92;->k:J

    .line 63
    .line 64
    invoke-direct/range {v3 .. v9}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 65
    .line 66
    .line 67
    return-object v3

    .line 68
    :pswitch_3
    move-object v7, p1

    .line 69
    new-instance v3, La/m92;

    .line 70
    .line 71
    move-object v8, v1

    .line 72
    check-cast v8, La/b310;

    .line 73
    .line 74
    iget-boolean v9, p0, La/m92;->l:Z

    .line 75
    .line 76
    const/4 v4, 0x2

    .line 77
    iget-wide v5, p0, La/m92;->k:J

    .line 78
    .line 79
    invoke-direct/range {v3 .. v9}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 80
    .line 81
    .line 82
    return-object v3

    .line 83
    :pswitch_4
    move-object v7, p1

    .line 84
    new-instance v3, La/m92;

    .line 85
    .line 86
    move-object v8, v1

    .line 87
    check-cast v8, La/vqg;

    .line 88
    .line 89
    iget-boolean v9, p0, La/m92;->l:Z

    .line 90
    .line 91
    const/4 v4, 0x1

    .line 92
    iget-wide v5, p0, La/m92;->k:J

    .line 93
    .line 94
    invoke-direct/range {v3 .. v9}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 95
    .line 96
    .line 97
    return-object v3

    .line 98
    :pswitch_5
    move-object v7, p1

    .line 99
    new-instance v3, La/m92;

    .line 100
    .line 101
    move-object v8, v1

    .line 102
    check-cast v8, La/n92;

    .line 103
    .line 104
    iget-boolean v9, p0, La/m92;->l:Z

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    iget-wide v5, p0, La/m92;->k:J

    .line 108
    .line 109
    invoke-direct/range {v3 .. v9}, La/m92;-><init>(BJLa/yje;La/diu0;Z)V

    .line 110
    .line 111
    .line 112
    return-object v3

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v0, p0, La/m92;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/m92;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/m92;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/m92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/m92;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/m92;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/m92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/m92;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/m92;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/m92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/m92;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/m92;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/m92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/m92;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/m92;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/m92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/m92;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/m92;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/m92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    invoke-virtual {p0, p1}, La/m92;->create(La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/m92;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/m92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/m92;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/m92;->m:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, La/tzt0;

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v5, p0, La/m92;->j:Z

    .line 17
    .line 18
    if-eqz v5, :cond_1

    .line 19
    .line 20
    if-ne v5, v4, :cond_0

    .line 21
    .line 22
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catch_0
    move-exception v0

    .line 27
    move-object p0, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :try_start_1
    iget-object v5, v2, La/tzt0;->x:La/hcp0;

    .line 37
    .line 38
    iget-wide v6, p0, La/m92;->k:J

    .line 39
    .line 40
    iget-boolean v8, p0, La/m92;->l:Z

    .line 41
    .line 42
    iput-boolean v4, p0, La/m92;->j:Z

    .line 43
    .line 44
    const-wide/16 v9, 0x28

    .line 45
    .line 46
    const-wide/16 v11, 0x1b

    .line 47
    .line 48
    move-object v13, p0

    .line 49
    invoke-virtual/range {v5 .. v13}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 53
    if-ne p0, v0, :cond_2

    .line 54
    .line 55
    move-object v3, v0

    .line 56
    goto :goto_2

    .line 57
    :goto_0
    iget-object p1, v2, La/tzt0;->y:La/ivn;

    .line 58
    .line 59
    new-instance v0, La/pzt0;

    .line 60
    .line 61
    invoke-direct {v0, v2, v4}, La/pzt0;-><init>(La/tzt0;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p0, v0}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    :goto_2
    return-object v3

    .line 70
    :pswitch_0
    move-object v13, p0

    .line 71
    check-cast v2, La/hxd0;

    .line 72
    .line 73
    sget-object p0, La/wne;->a:La/wne;

    .line 74
    .line 75
    iget-boolean v0, v13, La/m92;->j:Z

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    if-ne v0, v4, :cond_3

    .line 80
    .line 81
    :try_start_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 82
    .line 83
    .line 84
    goto :goto_4

    .line 85
    :catch_1
    move-exception v0

    .line 86
    move-object p0, v0

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :try_start_3
    iget-object v5, v2, La/hxd0;->x:La/hcp0;

    .line 96
    .line 97
    iget-wide v6, v13, La/m92;->k:J

    .line 98
    .line 99
    iget-boolean v8, v13, La/m92;->l:Z

    .line 100
    .line 101
    iput-boolean v4, v13, La/m92;->j:Z

    .line 102
    .line 103
    const-wide/16 v9, 0x28

    .line 104
    .line 105
    const-wide/16 v11, 0xf

    .line 106
    .line 107
    invoke-virtual/range {v5 .. v13}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 111
    if-ne p1, p0, :cond_5

    .line 112
    .line 113
    move-object v3, p0

    .line 114
    goto :goto_5

    .line 115
    :goto_3
    iget-object p1, v2, La/hxd0;->y:La/ivn;

    .line 116
    .line 117
    new-instance v0, La/exd0;

    .line 118
    .line 119
    invoke-direct {v0, v2, v4}, La/exd0;-><init>(La/hxd0;B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p0, v0}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    :goto_5
    return-object v3

    .line 128
    :pswitch_1
    move-object v13, p0

    .line 129
    sget-object p0, La/wne;->a:La/wne;

    .line 130
    .line 131
    iget-boolean v0, v13, La/m92;->j:Z

    .line 132
    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    if-ne v0, v4, :cond_6

    .line 136
    .line 137
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    move-object p1, v3

    .line 145
    goto :goto_6

    .line 146
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    check-cast v2, La/fga0;

    .line 150
    .line 151
    iput-boolean v4, v13, La/m92;->j:Z

    .line 152
    .line 153
    iget-wide v0, v13, La/m92;->k:J

    .line 154
    .line 155
    iget-boolean p1, v13, La/m92;->l:Z

    .line 156
    .line 157
    invoke-virtual {v2, v0, v1, v13, p1}, La/fga0;->a(JLa/zje;Z)Ljava/io/Serializable;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-ne p1, p0, :cond_8

    .line 162
    .line 163
    move-object p1, p0

    .line 164
    :cond_8
    :goto_6
    return-object p1

    .line 165
    :pswitch_2
    move-object v13, p0

    .line 166
    check-cast v2, La/wk40;

    .line 167
    .line 168
    sget-object p0, La/wne;->a:La/wne;

    .line 169
    .line 170
    iget-boolean v0, v13, La/m92;->j:Z

    .line 171
    .line 172
    if-eqz v0, :cond_a

    .line 173
    .line 174
    if-ne v0, v4, :cond_9

    .line 175
    .line 176
    :try_start_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 177
    .line 178
    .line 179
    goto :goto_8

    .line 180
    :catch_2
    move-exception v0

    .line 181
    move-object p0, v0

    .line 182
    goto :goto_7

    .line 183
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :try_start_5
    iget-object v5, v2, La/wk40;->r:La/hcp0;

    .line 191
    .line 192
    iget-wide v6, v13, La/m92;->k:J

    .line 193
    .line 194
    iget-boolean v8, v13, La/m92;->l:Z

    .line 195
    .line 196
    iput-boolean v4, v13, La/m92;->j:Z

    .line 197
    .line 198
    const-wide/16 v9, 0x28

    .line 199
    .line 200
    const-wide/16 v11, 0x24

    .line 201
    .line 202
    invoke-virtual/range {v5 .. v13}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 206
    if-ne p1, p0, :cond_b

    .line 207
    .line 208
    move-object v3, p0

    .line 209
    goto :goto_9

    .line 210
    :goto_7
    iget-object p1, v2, La/wk40;->s:La/ivn;

    .line 211
    .line 212
    new-instance v0, La/sk40;

    .line 213
    .line 214
    invoke-direct {v0, v2, v4}, La/sk40;-><init>(La/wk40;B)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, p0, v0}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 218
    .line 219
    .line 220
    :cond_b
    :goto_8
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    :goto_9
    return-object v3

    .line 223
    :pswitch_3
    move-object v13, p0

    .line 224
    check-cast v2, La/b310;

    .line 225
    .line 226
    sget-object p0, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget-boolean v0, v13, La/m92;->j:Z

    .line 229
    .line 230
    if-eqz v0, :cond_d

    .line 231
    .line 232
    if-ne v0, v4, :cond_c

    .line 233
    .line 234
    :try_start_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 235
    .line 236
    .line 237
    goto :goto_b

    .line 238
    :catch_3
    move-exception v0

    .line 239
    move-object p0, v0

    .line 240
    goto :goto_a

    .line 241
    :cond_c
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    goto :goto_c

    .line 245
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :try_start_7
    iget-object v5, v2, La/b310;->x:La/hcp0;

    .line 249
    .line 250
    iget-wide v6, v13, La/m92;->k:J

    .line 251
    .line 252
    iget-boolean v8, v13, La/m92;->l:Z

    .line 253
    .line 254
    iput-boolean v4, v13, La/m92;->j:Z

    .line 255
    .line 256
    const-wide/16 v9, 0x28

    .line 257
    .line 258
    const-wide/16 v11, 0x2

    .line 259
    .line 260
    invoke-virtual/range {v5 .. v13}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 264
    if-ne p1, p0, :cond_e

    .line 265
    .line 266
    move-object v3, p0

    .line 267
    goto :goto_c

    .line 268
    :goto_a
    iget-object p1, v2, La/b310;->y:La/ivn;

    .line 269
    .line 270
    new-instance v0, La/v210;

    .line 271
    .line 272
    invoke-direct {v0, v2, v4}, La/v210;-><init>(La/b310;B)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, p0, v0}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 276
    .line 277
    .line 278
    :cond_e
    :goto_b
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    :goto_c
    return-object v3

    .line 281
    :pswitch_4
    move-object v13, p0

    .line 282
    check-cast v2, La/vqg;

    .line 283
    .line 284
    sget-object p0, La/wne;->a:La/wne;

    .line 285
    .line 286
    iget-boolean v0, v13, La/m92;->j:Z

    .line 287
    .line 288
    if-eqz v0, :cond_10

    .line 289
    .line 290
    if-ne v0, v4, :cond_f

    .line 291
    .line 292
    :try_start_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 293
    .line 294
    .line 295
    goto :goto_e

    .line 296
    :catch_4
    move-exception v0

    .line 297
    move-object p0, v0

    .line 298
    goto :goto_d

    .line 299
    :cond_f
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    goto :goto_f

    .line 303
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :try_start_9
    iget-object v5, v2, La/vqg;->z:La/hcp0;

    .line 307
    .line 308
    iget-object p1, v2, La/vqg;->b:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 309
    .line 310
    iget-wide v11, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 311
    .line 312
    iget-wide v6, v13, La/m92;->k:J

    .line 313
    .line 314
    iget-boolean v8, v13, La/m92;->l:Z

    .line 315
    .line 316
    iput-boolean v4, v13, La/m92;->j:Z

    .line 317
    .line 318
    const-wide/16 v9, 0x28

    .line 319
    .line 320
    invoke-virtual/range {v5 .. v13}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    .line 324
    if-ne p1, p0, :cond_11

    .line 325
    .line 326
    move-object v3, p0

    .line 327
    goto :goto_f

    .line 328
    :goto_d
    iget-object p1, v2, La/vqg;->A:La/ivn;

    .line 329
    .line 330
    new-instance v0, La/mqg;

    .line 331
    .line 332
    invoke-direct {v0, v2, v4}, La/mqg;-><init>(La/vqg;B)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, p0, v0}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 336
    .line 337
    .line 338
    :cond_11
    :goto_e
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    :goto_f
    return-object v3

    .line 341
    :pswitch_5
    move-object v13, p0

    .line 342
    check-cast v2, La/n92;

    .line 343
    .line 344
    sget-object p0, La/wne;->a:La/wne;

    .line 345
    .line 346
    iget-boolean v0, v13, La/m92;->j:Z

    .line 347
    .line 348
    if-eqz v0, :cond_13

    .line 349
    .line 350
    if-ne v0, v4, :cond_12

    .line 351
    .line 352
    :try_start_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    .line 353
    .line 354
    .line 355
    goto :goto_13

    .line 356
    :catch_5
    move-exception v0

    .line 357
    move-object p0, v0

    .line 358
    goto :goto_12

    .line 359
    :cond_12
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    goto :goto_14

    .line 363
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    move p1, v4

    .line 367
    :try_start_b
    iget-object v4, v2, La/n92;->S:La/hcp0;

    .line 368
    .line 369
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    check-cast v0, La/d92;

    .line 374
    .line 375
    iget-object v0, v0, La/d92;->f:La/yi50;

    .line 376
    .line 377
    instance-of v1, v0, La/xi50;

    .line 378
    .line 379
    if-eqz v1, :cond_14

    .line 380
    .line 381
    move-object v3, v0

    .line 382
    check-cast v3, La/xi50;

    .line 383
    .line 384
    :cond_14
    if-eqz v3, :cond_15

    .line 385
    .line 386
    iget-object v0, v3, La/xi50;->a:La/uf50;

    .line 387
    .line 388
    if-eqz v0, :cond_15

    .line 389
    .line 390
    invoke-interface {v0}, La/uf50;->g()La/xh50;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    if-eqz v0, :cond_15

    .line 395
    .line 396
    iget-wide v0, v0, La/xh50;->e:J

    .line 397
    .line 398
    :goto_10
    move-wide v8, v0

    .line 399
    goto :goto_11

    .line 400
    :cond_15
    const-wide/16 v0, 0x0

    .line 401
    .line 402
    goto :goto_10

    .line 403
    :goto_11
    iget-wide v5, v13, La/m92;->k:J

    .line 404
    .line 405
    iget-boolean v7, v13, La/m92;->l:Z

    .line 406
    .line 407
    iput-boolean p1, v13, La/m92;->j:Z

    .line 408
    .line 409
    const-wide/16 v10, 0x0

    .line 410
    .line 411
    move-object v12, v13

    .line 412
    invoke-virtual/range {v4 .. v12}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p1
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5

    .line 416
    if-ne p1, p0, :cond_16

    .line 417
    .line 418
    move-object v3, p0

    .line 419
    goto :goto_14

    .line 420
    :goto_12
    sget-object p1, La/n92;->h0:Lkotlin/ranges/IntRange;

    .line 421
    .line 422
    iget-object p1, v2, La/n92;->T:La/ivn;

    .line 423
    .line 424
    new-instance v0, La/g92;

    .line 425
    .line 426
    const/4 v1, 0x0

    .line 427
    invoke-direct {v0, v2, v1}, La/g92;-><init>(La/n92;B)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {p1, p0, v0}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 431
    .line 432
    .line 433
    :cond_16
    :goto_13
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    :goto_14
    return-object v3

    .line 436
    nop

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
