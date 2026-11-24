.class public final La/tq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/kmq;

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/jr0;

.field public final synthetic n:J

.field public final synthetic o:Z

.field public final synthetic p:I

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Z

.field public final synthetic u:Z

.field public final synthetic v:Z


# direct methods
.method public synthetic constructor <init>(La/jr0;JZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p13, p0, La/tq0;->i:B

    iput-object p1, p0, La/tq0;->m:La/jr0;

    iput-wide p2, p0, La/tq0;->n:J

    iput-boolean p4, p0, La/tq0;->o:Z

    iput p5, p0, La/tq0;->p:I

    iput-object p6, p0, La/tq0;->q:Ljava/lang/String;

    iput-object p7, p0, La/tq0;->r:Ljava/lang/String;

    iput-object p8, p0, La/tq0;->s:Ljava/lang/String;

    iput-boolean p9, p0, La/tq0;->t:Z

    iput-boolean p10, p0, La/tq0;->u:Z

    iput-boolean p11, p0, La/tq0;->v:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p12}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/tq0;->i:B

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/tq0;

    .line 11
    .line 12
    iget-boolean v14, v0, La/tq0;->v:Z

    .line 13
    .line 14
    const/16 v16, 0x1

    .line 15
    .line 16
    iget-object v4, v0, La/tq0;->m:La/jr0;

    .line 17
    .line 18
    iget-wide v5, v0, La/tq0;->n:J

    .line 19
    .line 20
    iget-boolean v7, v0, La/tq0;->o:Z

    .line 21
    .line 22
    iget v8, v0, La/tq0;->p:I

    .line 23
    .line 24
    iget-object v9, v0, La/tq0;->q:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v10, v0, La/tq0;->r:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v11, v0, La/tq0;->s:Ljava/lang/String;

    .line 29
    .line 30
    iget-boolean v12, v0, La/tq0;->t:Z

    .line 31
    .line 32
    iget-boolean v13, v0, La/tq0;->u:Z

    .line 33
    .line 34
    move-object/from16 v15, p2

    .line 35
    .line 36
    invoke-direct/range {v3 .. v16}, La/tq0;-><init>(La/jr0;JZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLa/yje;B)V

    .line 37
    .line 38
    .line 39
    iput-object v1, v3, La/tq0;->l:Ljava/lang/Object;

    .line 40
    .line 41
    return-object v3

    .line 42
    :pswitch_0
    new-instance v4, La/tq0;

    .line 43
    .line 44
    iget-boolean v15, v0, La/tq0;->v:Z

    .line 45
    .line 46
    const/16 v17, 0x0

    .line 47
    .line 48
    iget-object v5, v0, La/tq0;->m:La/jr0;

    .line 49
    .line 50
    iget-wide v6, v0, La/tq0;->n:J

    .line 51
    .line 52
    iget-boolean v8, v0, La/tq0;->o:Z

    .line 53
    .line 54
    iget v9, v0, La/tq0;->p:I

    .line 55
    .line 56
    iget-object v10, v0, La/tq0;->q:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v11, v0, La/tq0;->r:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v12, v0, La/tq0;->s:Ljava/lang/String;

    .line 61
    .line 62
    iget-boolean v13, v0, La/tq0;->t:Z

    .line 63
    .line 64
    iget-boolean v14, v0, La/tq0;->u:Z

    .line 65
    .line 66
    move-object/from16 v16, p2

    .line 67
    .line 68
    invoke-direct/range {v4 .. v17}, La/tq0;-><init>(La/jr0;JZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLa/yje;B)V

    .line 69
    .line 70
    .line 71
    iput-object v1, v4, La/tq0;->l:Ljava/lang/Object;

    .line 72
    .line 73
    return-object v4

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tq0;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/tq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/tq0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/tq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/tq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/tq0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/tq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    iget-byte v0, v11, La/tq0;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v13, 0x2

    .line 9
    const/4 v14, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v11, La/tq0;->l:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v15, v0

    .line 16
    check-cast v15, La/kmq;

    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-byte v3, v11, La/tq0;->k:B

    .line 21
    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    if-eq v3, v2, :cond_1

    .line 25
    .line 26
    if-ne v3, v13, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_1
    iget-object v15, v11, La/tq0;->j:La/kmq;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v13, v0

    .line 42
    move-object/from16 v0, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v14, v11, La/tq0;->l:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v15, v11, La/tq0;->j:La/kmq;

    .line 51
    .line 52
    iput-byte v2, v11, La/tq0;->k:B

    .line 53
    .line 54
    move-object v1, v0

    .line 55
    iget-object v0, v11, La/tq0;->m:La/jr0;

    .line 56
    .line 57
    move-object v3, v1

    .line 58
    iget-wide v1, v11, La/tq0;->n:J

    .line 59
    .line 60
    move-object v4, v3

    .line 61
    iget-boolean v3, v11, La/tq0;->o:Z

    .line 62
    .line 63
    move-object v5, v4

    .line 64
    iget v4, v11, La/tq0;->p:I

    .line 65
    .line 66
    move-object v6, v5

    .line 67
    const/4 v5, 0x0

    .line 68
    move-object v7, v6

    .line 69
    iget-object v6, v11, La/tq0;->q:Ljava/lang/String;

    .line 70
    .line 71
    move-object v8, v7

    .line 72
    iget-object v7, v11, La/tq0;->r:Ljava/lang/String;

    .line 73
    .line 74
    move-object v9, v8

    .line 75
    iget-object v8, v11, La/tq0;->s:Ljava/lang/String;

    .line 76
    .line 77
    move-object v10, v9

    .line 78
    iget-boolean v9, v11, La/tq0;->t:Z

    .line 79
    .line 80
    move-object v12, v10

    .line 81
    iget-boolean v10, v11, La/tq0;->u:Z

    .line 82
    .line 83
    move-object/from16 v16, v12

    .line 84
    .line 85
    move-object v12, v11

    .line 86
    iget-boolean v11, v12, La/tq0;->v:Z

    .line 87
    .line 88
    move-object/from16 v13, v16

    .line 89
    .line 90
    invoke-virtual/range {v0 .. v12}, La/jr0;->b(JZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLa/zje;)Ljava/io/Serializable;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v11, v12

    .line 95
    if-ne v0, v13, :cond_3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    :goto_0
    iput-object v14, v11, La/tq0;->l:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v14, v11, La/tq0;->j:La/kmq;

    .line 101
    .line 102
    const/4 v1, 0x2

    .line 103
    iput-byte v1, v11, La/tq0;->k:B

    .line 104
    .line 105
    invoke-interface {v15, v0, v11}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-ne v0, v13, :cond_4

    .line 110
    .line 111
    :goto_1
    move-object v14, v13

    .line 112
    goto :goto_3

    .line 113
    :cond_4
    :goto_2
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_3
    return-object v14

    .line 116
    :pswitch_0
    iget-object v0, v11, La/tq0;->l:Ljava/lang/Object;

    .line 117
    .line 118
    move-object v12, v0

    .line 119
    check-cast v12, La/kmq;

    .line 120
    .line 121
    sget-object v13, La/wne;->a:La/wne;

    .line 122
    .line 123
    iget-byte v0, v11, La/tq0;->k:B

    .line 124
    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    if-eq v0, v2, :cond_6

    .line 128
    .line 129
    const/4 v2, 0x2

    .line 130
    if-ne v0, v2, :cond_5

    .line 131
    .line 132
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_6
    iget-object v12, v11, La/tq0;->j:La/kmq;

    .line 141
    .line 142
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    move-object/from16 v0, p1

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iput-object v14, v11, La/tq0;->l:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v12, v11, La/tq0;->j:La/kmq;

    .line 154
    .line 155
    iput-byte v2, v11, La/tq0;->k:B

    .line 156
    .line 157
    iget-object v0, v11, La/tq0;->m:La/jr0;

    .line 158
    .line 159
    iget-wide v1, v11, La/tq0;->n:J

    .line 160
    .line 161
    iget-boolean v3, v11, La/tq0;->o:Z

    .line 162
    .line 163
    iget v4, v11, La/tq0;->p:I

    .line 164
    .line 165
    iget-object v5, v11, La/tq0;->q:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v6, v11, La/tq0;->r:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v7, v11, La/tq0;->s:Ljava/lang/String;

    .line 170
    .line 171
    iget-boolean v8, v11, La/tq0;->t:Z

    .line 172
    .line 173
    iget-boolean v9, v11, La/tq0;->u:Z

    .line 174
    .line 175
    iget-boolean v10, v11, La/tq0;->v:Z

    .line 176
    .line 177
    invoke-virtual/range {v0 .. v11}, La/jr0;->a(JZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLa/zje;)Ljava/io/Serializable;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-ne v0, v13, :cond_8

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_8
    :goto_4
    iput-object v14, v11, La/tq0;->l:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v14, v11, La/tq0;->j:La/kmq;

    .line 187
    .line 188
    const/4 v1, 0x2

    .line 189
    iput-byte v1, v11, La/tq0;->k:B

    .line 190
    .line 191
    invoke-interface {v12, v0, v11}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-ne v0, v13, :cond_9

    .line 196
    .line 197
    :goto_5
    move-object v14, v13

    .line 198
    goto :goto_7

    .line 199
    :cond_9
    :goto_6
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_7
    return-object v14

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
