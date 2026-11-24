.class public final La/diz;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/kzj;

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/eiz;

.field public final synthetic m:J

.field public final synthetic n:J

.field public final synthetic o:I


# direct methods
.method public constructor <init>(La/eiz;JJILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/diz;->l:La/eiz;

    .line 2
    .line 3
    iput-wide p2, p0, La/diz;->m:J

    .line 4
    .line 5
    iput-wide p4, p0, La/diz;->n:J

    .line 6
    .line 7
    iput p6, p0, La/diz;->o:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/diz;

    .line 2
    .line 3
    iget-wide v4, p0, La/diz;->n:J

    .line 4
    .line 5
    iget v6, p0, La/diz;->o:I

    .line 6
    .line 7
    iget-object v1, p0, La/diz;->l:La/eiz;

    .line 8
    .line 9
    iget-wide v2, p0, La/diz;->m:J

    .line 10
    .line 11
    move-object v7, p2

    .line 12
    invoke-direct/range {v0 .. v7}, La/diz;-><init>(La/eiz;JJILa/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/diz;->k:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, La/diz;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/diz;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/diz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/diz;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/vne;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/diz;->j:B

    .line 10
    .line 11
    iget-wide v5, v0, La/diz;->n:J

    .line 12
    .line 13
    iget-object v8, v0, La/diz;->l:La/eiz;

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v15, 0x1

    .line 17
    const/4 v7, 0x0

    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    if-eq v3, v15, :cond_1

    .line 21
    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    move-object/from16 v27, v8

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v7

    .line 39
    :cond_1
    iget-object v1, v0, La/diz;->i:La/kzj;

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v3, v7

    .line 45
    move-object/from16 v7, p1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v7

    .line 52
    new-instance v7, La/tr;

    .line 53
    .line 54
    const/4 v13, 0x0

    .line 55
    const/16 v14, 0xa

    .line 56
    .line 57
    iget-wide v9, v0, La/diz;->m:J

    .line 58
    .line 59
    iget-wide v11, v0, La/diz;->n:J

    .line 60
    .line 61
    invoke-direct/range {v7 .. v14}, La/tr;-><init>(Ljava/lang/Object;JJLa/yje;B)V

    .line 62
    .line 63
    .line 64
    const/4 v13, 0x3

    .line 65
    invoke-static {v1, v3, v7, v13}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    new-instance v7, La/n6f;

    .line 70
    .line 71
    iget v11, v0, La/diz;->o:I

    .line 72
    .line 73
    const/4 v12, 0x0

    .line 74
    iget-wide v9, v0, La/diz;->n:J

    .line 75
    .line 76
    invoke-direct/range {v7 .. v12}, La/n6f;-><init>(La/eiz;JILa/yje;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v3, v7, v13}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v3, v0, La/diz;->k:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v1, v0, La/diz;->i:La/kzj;

    .line 86
    .line 87
    iput-byte v15, v0, La/diz;->j:B

    .line 88
    .line 89
    invoke-virtual {v14, v0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    if-ne v7, v2, :cond_3

    .line 94
    .line 95
    move-object v7, v2

    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :cond_3
    :goto_0
    move-object v11, v7

    .line 99
    check-cast v11, La/ypl0;

    .line 100
    .line 101
    sget v7, La/eiz;->E:I

    .line 102
    .line 103
    iget-object v7, v8, La/i3t0;->i:La/ocj;

    .line 104
    .line 105
    iget-object v7, v7, La/ocj;->a:La/p7m0;

    .line 106
    .line 107
    :goto_1
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move v10, v4

    .line 115
    move-object v4, v9

    .line 116
    check-cast v4, La/ihz;

    .line 117
    .line 118
    const/16 v21, 0x0

    .line 119
    .line 120
    const v22, 0x1ffbd

    .line 121
    .line 122
    .line 123
    move-object v12, v7

    .line 124
    const/4 v7, 0x0

    .line 125
    move-object v13, v8

    .line 126
    const/4 v8, 0x0

    .line 127
    move-object v14, v9

    .line 128
    const/4 v9, 0x0

    .line 129
    move v15, v10

    .line 130
    const/4 v10, 0x0

    .line 131
    move-object/from16 v16, v12

    .line 132
    .line 133
    const/4 v12, 0x0

    .line 134
    move-object/from16 v17, v13

    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    move-object/from16 v18, v14

    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    move/from16 v19, v15

    .line 141
    .line 142
    const/4 v15, 0x0

    .line 143
    move-object/from16 v20, v16

    .line 144
    .line 145
    const/16 v16, 0x0

    .line 146
    .line 147
    move-object/from16 v23, v17

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    move-object/from16 v24, v18

    .line 152
    .line 153
    const/16 v18, 0x0

    .line 154
    .line 155
    move/from16 v25, v19

    .line 156
    .line 157
    const/16 v19, 0x0

    .line 158
    .line 159
    move-object/from16 v26, v20

    .line 160
    .line 161
    const/16 v20, 0x0

    .line 162
    .line 163
    move-object/from16 v27, v23

    .line 164
    .line 165
    move-object/from16 v3, v26

    .line 166
    .line 167
    move-object/from16 v23, v2

    .line 168
    .line 169
    move-object/from16 v2, v24

    .line 170
    .line 171
    move-object/from16 v24, v1

    .line 172
    .line 173
    move/from16 v1, v25

    .line 174
    .line 175
    invoke-static/range {v4 .. v22}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v3, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_5

    .line 184
    .line 185
    const/4 v2, 0x0

    .line 186
    iput-object v2, v0, La/diz;->k:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object v2, v0, La/diz;->i:La/kzj;

    .line 189
    .line 190
    iput-byte v1, v0, La/diz;->j:B

    .line 191
    .line 192
    move-object/from16 v4, v24

    .line 193
    .line 194
    invoke-interface {v4, v0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    move-object/from16 v7, v23

    .line 199
    .line 200
    if-ne v0, v7, :cond_4

    .line 201
    .line 202
    :goto_2
    return-object v7

    .line 203
    :cond_4
    :goto_3
    check-cast v0, La/j0g0;

    .line 204
    .line 205
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 206
    .line 207
    new-instance v1, La/ub4;

    .line 208
    .line 209
    const/4 v2, 0x4

    .line 210
    invoke-direct {v1, v0, v5, v6, v2}, La/ub4;-><init>(Ljava/lang/Object;JB)V

    .line 211
    .line 212
    .line 213
    sget v0, La/eiz;->E:I

    .line 214
    .line 215
    move-object/from16 v8, v27

    .line 216
    .line 217
    invoke-virtual {v8, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_5
    move v4, v1

    .line 224
    move-object v7, v3

    .line 225
    move-object/from16 v2, v23

    .line 226
    .line 227
    move-object/from16 v1, v24

    .line 228
    .line 229
    move-object/from16 v8, v27

    .line 230
    .line 231
    const/4 v3, 0x0

    .line 232
    goto :goto_1
.end method
