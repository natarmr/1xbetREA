.class public final La/es40;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public j:La/dpa0;

.field public k:La/lie0;

.field public l:B

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:La/fs40;

.field public final synthetic o:La/s43;

.field public final synthetic p:La/hs40;

.field public final synthetic q:La/gs40;

.field public final synthetic r:La/gs40;


# direct methods
.method public constructor <init>(La/fs40;La/s43;La/hs40;La/gs40;La/gs40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/es40;->n:La/fs40;

    .line 2
    .line 3
    iput-object p2, p0, La/es40;->o:La/s43;

    .line 4
    .line 5
    iput-object p3, p0, La/es40;->p:La/hs40;

    .line 6
    .line 7
    iput-object p4, p0, La/es40;->q:La/gs40;

    .line 8
    .line 9
    iput-object p5, p0, La/es40;->r:La/gs40;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/zzf0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/es40;

    .line 2
    .line 3
    iget-object v4, p0, La/es40;->q:La/gs40;

    .line 4
    .line 5
    iget-object v5, p0, La/es40;->r:La/gs40;

    .line 6
    .line 7
    iget-object v1, p0, La/es40;->n:La/fs40;

    .line 8
    .line 9
    iget-object v2, p0, La/es40;->o:La/s43;

    .line 10
    .line 11
    iget-object v3, p0, La/es40;->p:La/hs40;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/es40;-><init>(La/fs40;La/s43;La/hs40;La/gs40;La/gs40;La/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/es40;->m:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/inn0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/es40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/es40;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/es40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/es40;->l:B

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    if-eq v2, v7, :cond_2

    .line 16
    .line 17
    if-eq v2, v6, :cond_1

    .line 18
    .line 19
    if-ne v2, v5, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v8

    .line 34
    :cond_1
    iget-object v2, v0, La/es40;->k:La/lie0;

    .line 35
    .line 36
    iget-object v7, v0, La/es40;->j:La/dpa0;

    .line 37
    .line 38
    iget-object v9, v0, La/es40;->m:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v9, La/inn0;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v10, p1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object v2, v0, La/es40;->m:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, La/inn0;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v7, p1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v0, La/es40;->m:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, La/inn0;

    .line 64
    .line 65
    iput-object v2, v0, La/es40;->m:Ljava/lang/Object;

    .line 66
    .line 67
    iput-byte v7, v0, La/es40;->l:B

    .line 68
    .line 69
    invoke-static {v2, v7, v0, v6}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    if-ne v7, v1, :cond_4

    .line 74
    .line 75
    goto/16 :goto_2

    .line 76
    .line 77
    :cond_4
    :goto_0
    check-cast v7, La/dpa0;

    .line 78
    .line 79
    iget-wide v9, v7, La/dpa0;->c:J

    .line 80
    .line 81
    new-instance v11, La/ne60;

    .line 82
    .line 83
    invoke-direct {v11, v9, v10}, La/ne60;-><init>(J)V

    .line 84
    .line 85
    .line 86
    iget-object v9, v0, La/es40;->n:La/fs40;

    .line 87
    .line 88
    invoke-virtual {v9, v11}, La/fs40;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    check-cast v9, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-nez v9, :cond_5

    .line 99
    .line 100
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_5
    new-instance v9, La/lie0;

    .line 104
    .line 105
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-wide v3, v9, La/lie0;->a:J

    .line 109
    .line 110
    move-object/from16 v19, v9

    .line 111
    .line 112
    move-object v9, v2

    .line 113
    move-object/from16 v2, v19

    .line 114
    .line 115
    :cond_6
    iget-wide v10, v7, La/dpa0;->a:J

    .line 116
    .line 117
    new-instance v12, La/t43;

    .line 118
    .line 119
    invoke-direct {v12, v2, v6}, La/t43;-><init>(Ljava/lang/Object;B)V

    .line 120
    .line 121
    .line 122
    iput-object v9, v0, La/es40;->m:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v7, v0, La/es40;->j:La/dpa0;

    .line 125
    .line 126
    iput-object v2, v0, La/es40;->k:La/lie0;

    .line 127
    .line 128
    iput-byte v6, v0, La/es40;->l:B

    .line 129
    .line 130
    invoke-static {v9, v10, v11, v12, v0}, La/bel;->c(La/inn0;JLkotlin/jvm/functions/Function2;La/zw5;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    if-ne v10, v1, :cond_7

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    :goto_1
    check-cast v10, La/dpa0;

    .line 138
    .line 139
    if-eqz v10, :cond_8

    .line 140
    .line 141
    invoke-virtual {v10}, La/dpa0;->c()Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_6

    .line 146
    .line 147
    :cond_8
    if-eqz v10, :cond_b

    .line 148
    .line 149
    iget-object v6, v0, La/es40;->o:La/s43;

    .line 150
    .line 151
    iget-object v6, v6, La/s43;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v6, La/j6u0;

    .line 154
    .line 155
    iget-object v6, v6, La/j6u0;->a:La/r34;

    .line 156
    .line 157
    iget-object v7, v6, La/r34;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v7, La/i6u0;

    .line 160
    .line 161
    iget-object v11, v7, La/i6u0;->d:[La/zaj;

    .line 162
    .line 163
    invoke-static {v8, v11}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    const/4 v11, 0x0

    .line 167
    iput v11, v7, La/i6u0;->e:I

    .line 168
    .line 169
    iget-object v7, v6, La/r34;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v7, La/i6u0;

    .line 172
    .line 173
    iget-object v12, v7, La/i6u0;->d:[La/zaj;

    .line 174
    .line 175
    invoke-static {v8, v12}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iput v11, v7, La/i6u0;->e:I

    .line 179
    .line 180
    iput-wide v3, v6, La/r34;->a:J

    .line 181
    .line 182
    iget-wide v2, v2, La/lie0;->a:J

    .line 183
    .line 184
    iget-object v4, v0, La/es40;->p:La/hs40;

    .line 185
    .line 186
    iget-object v6, v4, La/hs40;->b:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v6, La/j6u0;

    .line 189
    .line 190
    invoke-static {v6, v10}, La/dqm0;->k(La/j6u0;La/dpa0;)V

    .line 191
    .line 192
    .line 193
    iget-object v6, v4, La/hs40;->c:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v6, La/htb;

    .line 196
    .line 197
    new-instance v13, La/js40;

    .line 198
    .line 199
    const/4 v14, 0x1

    .line 200
    const-wide/16 v17, 0x0

    .line 201
    .line 202
    move-wide v15, v2

    .line 203
    invoke-direct/range {v13 .. v18}, La/js40;-><init>(ZJJ)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v6, v13}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    iget-wide v2, v10, La/dpa0;->a:J

    .line 210
    .line 211
    new-instance v6, La/s43;

    .line 212
    .line 213
    const/16 v7, 0xc

    .line 214
    .line 215
    invoke-direct {v6, v4, v7}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 216
    .line 217
    .line 218
    iput-object v8, v0, La/es40;->m:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v8, v0, La/es40;->j:La/dpa0;

    .line 221
    .line 222
    iput-object v8, v0, La/es40;->k:La/lie0;

    .line 223
    .line 224
    iput-byte v5, v0, La/es40;->l:B

    .line 225
    .line 226
    invoke-static {v9, v2, v3, v6, v0}, La/bel;->g(La/inn0;JLkotlin/jvm/functions/Function1;La/zw5;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    if-ne v2, v1, :cond_9

    .line 231
    .line 232
    :goto_2
    return-object v1

    .line 233
    :cond_9
    :goto_3
    check-cast v2, Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-nez v1, :cond_a

    .line 240
    .line 241
    iget-object v0, v0, La/es40;->q:La/gs40;

    .line 242
    .line 243
    invoke-virtual {v0}, La/gs40;->invoke()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_a
    iget-object v0, v0, La/es40;->r:La/gs40;

    .line 248
    .line 249
    invoke-virtual {v0}, La/gs40;->invoke()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    :cond_b
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object v0
.end method
