.class public final La/hy7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/e960;

.field public final synthetic k:La/t33;

.field public final synthetic l:La/t33;

.field public final synthetic m:La/t33;

.field public final synthetic n:La/t33;

.field public final synthetic o:La/t33;

.field public final synthetic p:La/t33;

.field public final synthetic q:F

.field public final synthetic r:La/t33;

.field public final synthetic s:F

.field public final synthetic t:La/pz40;


# direct methods
.method public constructor <init>(La/e960;La/t33;La/t33;La/t33;La/t33;La/t33;La/t33;FLa/t33;FLa/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hy7;->j:La/e960;

    .line 2
    .line 3
    iput-object p2, p0, La/hy7;->k:La/t33;

    .line 4
    .line 5
    iput-object p3, p0, La/hy7;->l:La/t33;

    .line 6
    .line 7
    iput-object p4, p0, La/hy7;->m:La/t33;

    .line 8
    .line 9
    iput-object p5, p0, La/hy7;->n:La/t33;

    .line 10
    .line 11
    iput-object p6, p0, La/hy7;->o:La/t33;

    .line 12
    .line 13
    iput-object p7, p0, La/hy7;->p:La/t33;

    .line 14
    .line 15
    iput p8, p0, La/hy7;->q:F

    .line 16
    .line 17
    iput-object p9, p0, La/hy7;->r:La/t33;

    .line 18
    .line 19
    iput p10, p0, La/hy7;->s:F

    .line 20
    .line 21
    iput-object p11, p0, La/hy7;->t:La/pz40;

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1, p12}, La/bnn0;-><init>(ILa/yje;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    new-instance v0, La/hy7;

    .line 2
    .line 3
    iget v10, p0, La/hy7;->s:F

    .line 4
    .line 5
    iget-object v11, p0, La/hy7;->t:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/hy7;->j:La/e960;

    .line 8
    .line 9
    iget-object v2, p0, La/hy7;->k:La/t33;

    .line 10
    .line 11
    iget-object v3, p0, La/hy7;->l:La/t33;

    .line 12
    .line 13
    iget-object v4, p0, La/hy7;->m:La/t33;

    .line 14
    .line 15
    iget-object v5, p0, La/hy7;->n:La/t33;

    .line 16
    .line 17
    iget-object v6, p0, La/hy7;->o:La/t33;

    .line 18
    .line 19
    iget-object v7, p0, La/hy7;->p:La/t33;

    .line 20
    .line 21
    iget v8, p0, La/hy7;->q:F

    .line 22
    .line 23
    iget-object v9, p0, La/hy7;->r:La/t33;

    .line 24
    .line 25
    move-object v12, p2

    .line 26
    invoke-direct/range {v0 .. v12}, La/hy7;-><init>(La/e960;La/t33;La/t33;La/t33;La/t33;La/t33;La/t33;FLa/t33;FLa/pz40;La/yje;)V

    .line 27
    .line 28
    .line 29
    return-object v0
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
    invoke-virtual {p0, p1, p2}, La/hy7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/hy7;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/hy7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    sget-object v9, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v8, La/hy7;->i:B

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iget v10, v8, La/hy7;->s:F

    .line 9
    .line 10
    iget-object v11, v8, La/hy7;->n:La/t33;

    .line 11
    .line 12
    iget-object v12, v8, La/hy7;->k:La/t33;

    .line 13
    .line 14
    const/4 v2, 0x5

    .line 15
    const/4 v13, 0x4

    .line 16
    const/4 v14, 0x3

    .line 17
    const/4 v15, 0x2

    .line 18
    const/4 v3, 0x1

    .line 19
    iget-object v4, v8, La/hy7;->t:La/pz40;

    .line 20
    .line 21
    iget-object v5, v8, La/hy7;->j:La/e960;

    .line 22
    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    if-eq v0, v3, :cond_4

    .line 26
    .line 27
    if-eq v0, v15, :cond_3

    .line 28
    .line 29
    if-eq v0, v14, :cond_2

    .line 30
    .line 31
    if-eq v0, v13, :cond_1

    .line 32
    .line 33
    if-ne v0, v2, :cond_0

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v13, v4

    .line 39
    move-object v7, v5

    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object v13, v4

    .line 57
    move-object/from16 v18, v5

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v13, v4

    .line 64
    move-object/from16 v18, v5

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object v13, v4

    .line 71
    move-object/from16 v18, v5

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, La/ry7;->a:La/zsf;

    .line 78
    .line 79
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, La/e960;

    .line 84
    .line 85
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_d

    .line 90
    .line 91
    instance-of v0, v5, La/d960;

    .line 92
    .line 93
    if-eqz v0, :cond_9

    .line 94
    .line 95
    iput-byte v3, v8, La/hy7;->i:B

    .line 96
    .line 97
    iget-object v0, v8, La/hy7;->k:La/t33;

    .line 98
    .line 99
    iget-object v1, v8, La/hy7;->l:La/t33;

    .line 100
    .line 101
    iget-object v2, v8, La/hy7;->m:La/t33;

    .line 102
    .line 103
    iget-object v3, v8, La/hy7;->n:La/t33;

    .line 104
    .line 105
    move-object v6, v4

    .line 106
    iget-object v4, v8, La/hy7;->o:La/t33;

    .line 107
    .line 108
    move-object v7, v5

    .line 109
    iget-object v5, v8, La/hy7;->p:La/t33;

    .line 110
    .line 111
    move-object/from16 v16, v6

    .line 112
    .line 113
    iget v6, v8, La/hy7;->q:F

    .line 114
    .line 115
    move-object/from16 v17, v7

    .line 116
    .line 117
    iget-object v7, v8, La/hy7;->r:La/t33;

    .line 118
    .line 119
    move-object/from16 v13, v16

    .line 120
    .line 121
    move-object/from16 v18, v17

    .line 122
    .line 123
    invoke-static/range {v0 .. v8}, La/ry7;->g(La/t33;La/t33;La/t33;La/t33;La/t33;La/t33;FLa/t33;La/zje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-ne v0, v9, :cond_6

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_6
    :goto_0
    iput-byte v15, v8, La/hy7;->i:B

    .line 131
    .line 132
    iget-object v0, v8, La/hy7;->l:La/t33;

    .line 133
    .line 134
    invoke-static {v12, v0, v11, v10, v8}, La/ry7;->e(La/t33;La/t33;La/t33;FLa/zje;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-ne v0, v9, :cond_7

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_7
    :goto_1
    iput-byte v14, v8, La/hy7;->i:B

    .line 142
    .line 143
    invoke-static {v11, v10, v8}, La/ry7;->d(La/t33;FLa/zje;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-ne v0, v9, :cond_8

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_8
    :goto_2
    sget-object v0, La/ry7;->a:La/zsf;

    .line 151
    .line 152
    move-object/from16 v7, v18

    .line 153
    .line 154
    invoke-interface {v13, v7}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const/4 v0, 0x4

    .line 158
    iput-byte v0, v8, La/hy7;->i:B

    .line 159
    .line 160
    iget-object v0, v8, La/hy7;->m:La/t33;

    .line 161
    .line 162
    iget-object v1, v8, La/hy7;->p:La/t33;

    .line 163
    .line 164
    iget-object v2, v8, La/hy7;->r:La/t33;

    .line 165
    .line 166
    invoke-static {v0, v1, v2, v8}, La/ry7;->f(La/t33;La/t33;La/t33;La/zje;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    if-ne v0, v9, :cond_d

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_9
    move-object v13, v4

    .line 174
    move-object v7, v5

    .line 175
    instance-of v0, v7, La/c960;

    .line 176
    .line 177
    if-eqz v0, :cond_c

    .line 178
    .line 179
    iput-byte v2, v8, La/hy7;->i:B

    .line 180
    .line 181
    new-instance v0, La/u47;

    .line 182
    .line 183
    const/16 v2, 0xd

    .line 184
    .line 185
    iget-object v3, v8, La/hy7;->o:La/t33;

    .line 186
    .line 187
    invoke-direct {v0, v12, v3, v1, v2}, La/u47;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 188
    .line 189
    .line 190
    invoke-static {v8, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-ne v0, v9, :cond_a

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    :goto_3
    if-ne v0, v9, :cond_b

    .line 200
    .line 201
    :goto_4
    return-object v9

    .line 202
    :cond_b
    :goto_5
    sget-object v0, La/ry7;->a:La/zsf;

    .line 203
    .line 204
    invoke-interface {v13, v7}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 209
    .line 210
    .line 211
    return-object v1

    .line 212
    :cond_d
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0
.end method
