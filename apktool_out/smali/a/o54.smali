.class public final La/o54;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:I

.field public j:La/na10;

.field public k:La/u910;

.field public l:F

.field public m:F

.field public n:B

.field public final synthetic o:La/xn4;

.field public final synthetic p:La/na10;

.field public final synthetic q:La/na10;

.field public final synthetic r:Z

.field public final synthetic s:La/u910;

.field public final synthetic t:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(La/xn4;La/na10;La/na10;ZLa/u910;Lkotlin/jvm/functions/Function0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o54;->o:La/xn4;

    .line 2
    .line 3
    iput-object p2, p0, La/o54;->p:La/na10;

    .line 4
    .line 5
    iput-object p3, p0, La/o54;->q:La/na10;

    .line 6
    .line 7
    iput-boolean p4, p0, La/o54;->r:Z

    .line 8
    .line 9
    iput-object p5, p0, La/o54;->s:La/u910;

    .line 10
    .line 11
    iput-object p6, p0, La/o54;->t:Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/o54;

    .line 2
    .line 3
    iget-object v5, p0, La/o54;->s:La/u910;

    .line 4
    .line 5
    iget-object v6, p0, La/o54;->t:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    iget-object v1, p0, La/o54;->o:La/xn4;

    .line 8
    .line 9
    iget-object v2, p0, La/o54;->p:La/na10;

    .line 10
    .line 11
    iget-object v3, p0, La/o54;->q:La/na10;

    .line 12
    .line 13
    iget-boolean v4, p0, La/o54;->r:Z

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, La/o54;-><init>(La/xn4;La/na10;La/na10;ZLa/u910;Lkotlin/jvm/functions/Function0;La/yje;)V

    .line 17
    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, La/o54;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/o54;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/o54;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v7, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v5, La/o54;->n:B

    .line 6
    .line 7
    iget-object v8, v5, La/o54;->s:La/u910;

    .line 8
    .line 9
    iget-boolean v9, v5, La/o54;->r:Z

    .line 10
    .line 11
    const/4 v10, 0x4

    .line 12
    const/4 v11, 0x3

    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v12, 0x0

    .line 16
    if-eqz v0, :cond_5

    .line 17
    .line 18
    if-eq v0, v2, :cond_4

    .line 19
    .line 20
    if-eq v0, v1, :cond_3

    .line 21
    .line 22
    if-eq v0, v11, :cond_1

    .line 23
    .line 24
    if-ne v0, v10, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_b

    .line 30
    .line 31
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v12

    .line 37
    :cond_1
    iget v0, v5, La/o54;->m:F

    .line 38
    .line 39
    iget v1, v5, La/o54;->l:F

    .line 40
    .line 41
    iget v2, v5, La/o54;->i:I

    .line 42
    .line 43
    iget-object v8, v5, La/o54;->k:La/u910;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object/from16 v3, p1

    .line 49
    .line 50
    :cond_2
    move v4, v0

    .line 51
    move-object v0, v8

    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_3
    iget v0, v5, La/o54;->m:F

    .line 55
    .line 56
    iget v1, v5, La/o54;->l:F

    .line 57
    .line 58
    iget v2, v5, La/o54;->i:I

    .line 59
    .line 60
    iget-object v3, v5, La/o54;->j:La/na10;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_4
    iget v0, v5, La/o54;->m:F

    .line 68
    .line 69
    iget v2, v5, La/o54;->l:F

    .line 70
    .line 71
    iget v3, v5, La/o54;->i:I

    .line 72
    .line 73
    iget-object v4, v5, La/o54;->k:La/u910;

    .line 74
    .line 75
    iget-object v6, v5, La/o54;->j:La/na10;

    .line 76
    .line 77
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object v13, v4

    .line 81
    move v4, v0

    .line 82
    move-object v0, v13

    .line 83
    move v13, v3

    .line 84
    move v3, v2

    .line 85
    move-object/from16 v2, p1

    .line 86
    .line 87
    :goto_0
    move-object v14, v6

    .line 88
    goto :goto_6

    .line 89
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v5, La/o54;->o:La/xn4;

    .line 93
    .line 94
    sget-object v3, La/xn4;->a:La/xn4;

    .line 95
    .line 96
    if-ne v0, v3, :cond_6

    .line 97
    .line 98
    move v0, v2

    .line 99
    goto :goto_1

    .line 100
    :cond_6
    const/4 v0, 0x0

    .line 101
    :goto_1
    iget-object v3, v5, La/o54;->q:La/na10;

    .line 102
    .line 103
    iget-object v4, v5, La/o54;->p:La/na10;

    .line 104
    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    move-object v6, v4

    .line 108
    goto :goto_2

    .line 109
    :cond_7
    move-object v6, v3

    .line 110
    :goto_2
    if-eqz v0, :cond_8

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_8
    move-object v3, v4

    .line 114
    :goto_3
    if-eqz v0, :cond_9

    .line 115
    .line 116
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_9
    const/high16 v4, -0x40400000    # -1.5f

    .line 120
    .line 121
    :goto_4
    if-eqz v0, :cond_a

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    goto :goto_5

    .line 125
    :cond_a
    const/high16 v13, 0x3f800000    # 1.0f

    .line 126
    .line 127
    :goto_5
    if-eqz v9, :cond_d

    .line 128
    .line 129
    iput-object v6, v5, La/o54;->j:La/na10;

    .line 130
    .line 131
    iput-object v8, v5, La/o54;->k:La/u910;

    .line 132
    .line 133
    iput v0, v5, La/o54;->i:I

    .line 134
    .line 135
    iput v4, v5, La/o54;->l:F

    .line 136
    .line 137
    iput v13, v5, La/o54;->m:F

    .line 138
    .line 139
    iput-byte v2, v5, La/o54;->n:B

    .line 140
    .line 141
    iget-object v2, v3, La/na10;->a:La/odd;

    .line 142
    .line 143
    invoke-virtual {v2, v5}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    if-ne v2, v7, :cond_b

    .line 148
    .line 149
    goto/16 :goto_a

    .line 150
    .line 151
    :cond_b
    move v3, v4

    .line 152
    move v4, v13

    .line 153
    move v13, v0

    .line 154
    move-object v0, v8

    .line 155
    goto :goto_0

    .line 156
    :goto_6
    check-cast v2, La/fa10;

    .line 157
    .line 158
    iput-object v14, v5, La/o54;->j:La/na10;

    .line 159
    .line 160
    iput-object v12, v5, La/o54;->k:La/u910;

    .line 161
    .line 162
    iput v13, v5, La/o54;->i:I

    .line 163
    .line 164
    iput v3, v5, La/o54;->l:F

    .line 165
    .line 166
    iput v4, v5, La/o54;->m:F

    .line 167
    .line 168
    iput-byte v1, v5, La/o54;->n:B

    .line 169
    .line 170
    move-object v1, v2

    .line 171
    const/4 v2, 0x1

    .line 172
    const/16 v6, 0x72a

    .line 173
    .line 174
    invoke-static/range {v0 .. v6}, La/fww;->s(La/u910;La/fa10;IFFLa/bnn0;I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-ne v0, v7, :cond_c

    .line 179
    .line 180
    goto :goto_a

    .line 181
    :cond_c
    move v1, v3

    .line 182
    move v0, v4

    .line 183
    move v2, v13

    .line 184
    move-object v3, v14

    .line 185
    :goto_7
    move-object v6, v3

    .line 186
    goto :goto_8

    .line 187
    :cond_d
    move v2, v0

    .line 188
    move v1, v4

    .line 189
    move v0, v13

    .line 190
    :goto_8
    iput-object v12, v5, La/o54;->j:La/na10;

    .line 191
    .line 192
    iput-object v8, v5, La/o54;->k:La/u910;

    .line 193
    .line 194
    iput v2, v5, La/o54;->i:I

    .line 195
    .line 196
    iput v1, v5, La/o54;->l:F

    .line 197
    .line 198
    iput v0, v5, La/o54;->m:F

    .line 199
    .line 200
    iput-byte v11, v5, La/o54;->n:B

    .line 201
    .line 202
    iget-object v3, v6, La/na10;->a:La/odd;

    .line 203
    .line 204
    invoke-virtual {v3, v5}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    if-ne v3, v7, :cond_2

    .line 209
    .line 210
    goto :goto_a

    .line 211
    :goto_9
    check-cast v3, La/fa10;

    .line 212
    .line 213
    iput-object v12, v5, La/o54;->j:La/na10;

    .line 214
    .line 215
    iput-object v12, v5, La/o54;->k:La/u910;

    .line 216
    .line 217
    iput v2, v5, La/o54;->i:I

    .line 218
    .line 219
    iput v1, v5, La/o54;->l:F

    .line 220
    .line 221
    iput v4, v5, La/o54;->m:F

    .line 222
    .line 223
    iput-byte v10, v5, La/o54;->n:B

    .line 224
    .line 225
    const/4 v2, 0x1

    .line 226
    const/16 v6, 0x72a

    .line 227
    .line 228
    move-object v15, v3

    .line 229
    move v3, v1

    .line 230
    move-object v1, v15

    .line 231
    invoke-static/range {v0 .. v6}, La/fww;->s(La/u910;La/fa10;IFFLa/bnn0;I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    if-ne v0, v7, :cond_e

    .line 236
    .line 237
    :goto_a
    return-object v7

    .line 238
    :cond_e
    :goto_b
    if-eqz v9, :cond_f

    .line 239
    .line 240
    iget-object v0, v5, La/o54;->t:Lkotlin/jvm/functions/Function0;

    .line 241
    .line 242
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0
.end method
