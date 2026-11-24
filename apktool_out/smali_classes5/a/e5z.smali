.class public final La/e5z;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/a6u;

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:B

.field public final synthetic p:J

.field public final synthetic q:J

.field public final synthetic r:Z

.field public final synthetic s:J


# direct methods
.method public constructor <init>(La/yje;La/a6u;ZZIJJZJ)V
    .locals 0

    .line 1
    iput-object p2, p0, La/e5z;->l:La/a6u;

    .line 2
    .line 3
    iput-boolean p3, p0, La/e5z;->m:Z

    .line 4
    .line 5
    iput-boolean p4, p0, La/e5z;->n:Z

    .line 6
    .line 7
    iput-byte p5, p0, La/e5z;->o:B

    .line 8
    .line 9
    iput-wide p6, p0, La/e5z;->p:J

    .line 10
    .line 11
    iput-wide p8, p0, La/e5z;->q:J

    .line 12
    .line 13
    iput-boolean p10, p0, La/e5z;->r:Z

    .line 14
    .line 15
    iput-wide p11, p0, La/e5z;->s:J

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/kmq;

    .line 3
    .line 4
    move-object/from16 v2, p3

    .line 5
    .line 6
    check-cast v2, La/yje;

    .line 7
    .line 8
    new-instance v1, La/e5z;

    .line 9
    .line 10
    iget-boolean v11, p0, La/e5z;->r:Z

    .line 11
    .line 12
    iget-wide v12, p0, La/e5z;->s:J

    .line 13
    .line 14
    iget-object v3, p0, La/e5z;->l:La/a6u;

    .line 15
    .line 16
    iget-boolean v4, p0, La/e5z;->m:Z

    .line 17
    .line 18
    iget-boolean v5, p0, La/e5z;->n:Z

    .line 19
    .line 20
    iget-byte v6, p0, La/e5z;->o:B

    .line 21
    .line 22
    iget-wide v7, p0, La/e5z;->p:J

    .line 23
    .line 24
    iget-wide v9, p0, La/e5z;->q:J

    .line 25
    .line 26
    invoke-direct/range {v1 .. v13}, La/e5z;-><init>(La/yje;La/a6u;ZZIJJZJ)V

    .line 27
    .line 28
    .line 29
    iput-object v0, v1, La/e5z;->j:La/kmq;

    .line 30
    .line 31
    move-object/from16 p0, p2

    .line 32
    .line 33
    iput-object p0, v1, La/e5z;->k:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    invoke-virtual {v1, p0}, La/e5z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/e5z;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v4

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/e5z;->j:La/kmq;

    .line 28
    .line 29
    iget-object v5, v0, La/e5z;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, La/l4z;

    .line 32
    .line 33
    if-eqz v5, :cond_5

    .line 34
    .line 35
    instance-of v6, v5, La/i4z;

    .line 36
    .line 37
    iget-byte v12, v0, La/e5z;->o:B

    .line 38
    .line 39
    iget-boolean v11, v0, La/e5z;->n:Z

    .line 40
    .line 41
    iget-boolean v10, v0, La/e5z;->m:Z

    .line 42
    .line 43
    iget-object v7, v0, La/e5z;->l:La/a6u;

    .line 44
    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    iget-object v6, v7, La/a6u;->b:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v8, v6

    .line 50
    check-cast v8, La/abu;

    .line 51
    .line 52
    move-object v9, v5

    .line 53
    check-cast v9, La/i4z;

    .line 54
    .line 55
    sget-object v15, La/i2o;->p:La/i2o;

    .line 56
    .line 57
    new-instance v5, La/djx;

    .line 58
    .line 59
    const/16 v6, 0x19

    .line 60
    .line 61
    invoke-direct {v5, v6}, La/djx;-><init>(B)V

    .line 62
    .line 63
    .line 64
    new-instance v7, La/y2x;

    .line 65
    .line 66
    invoke-direct {v7, v9, v6}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    new-instance v18, La/q4z;

    .line 70
    .line 71
    const/4 v13, 0x0

    .line 72
    const/4 v14, 0x0

    .line 73
    move-object/from16 v17, v7

    .line 74
    .line 75
    move-object/from16 v7, v18

    .line 76
    .line 77
    invoke-direct/range {v7 .. v14}, La/q4z;-><init>(Ljava/lang/Object;La/l4z;ZZILa/yje;B)V

    .line 78
    .line 79
    .line 80
    const-wide/16 v13, 0x1e

    .line 81
    .line 82
    move-object/from16 v16, v5

    .line 83
    .line 84
    invoke-static/range {v13 .. v18}, La/nkb;->H(JLa/i2o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/vsg0;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    new-instance v6, La/j5z;

    .line 89
    .line 90
    const/4 v7, 0x0

    .line 91
    iget-wide v8, v0, La/e5z;->p:J

    .line 92
    .line 93
    invoke-direct {v6, v5, v8, v9, v7}, La/j5z;-><init>(La/vsg0;JB)V

    .line 94
    .line 95
    .line 96
    move-wide v15, v8

    .line 97
    new-instance v8, La/g5z;

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    const/16 v18, 0x0

    .line 102
    .line 103
    iget-object v9, v0, La/e5z;->l:La/a6u;

    .line 104
    .line 105
    iget-wide v10, v0, La/e5z;->q:J

    .line 106
    .line 107
    iget-boolean v12, v0, La/e5z;->r:Z

    .line 108
    .line 109
    iget-wide v13, v0, La/e5z;->s:J

    .line 110
    .line 111
    invoke-direct/range {v8 .. v18}, La/g5z;-><init>(La/a6u;JZJJLa/yje;B)V

    .line 112
    .line 113
    .line 114
    new-instance v5, La/dnq;

    .line 115
    .line 116
    invoke-direct {v5, v6, v8, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    instance-of v6, v5, La/j4z;

    .line 121
    .line 122
    if-eqz v6, :cond_3

    .line 123
    .line 124
    iget-object v6, v7, La/a6u;->c:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v8, v6

    .line 127
    check-cast v8, La/gxu;

    .line 128
    .line 129
    move-object v9, v5

    .line 130
    check-cast v9, La/j4z;

    .line 131
    .line 132
    sget-object v15, La/i2o;->o:La/i2o;

    .line 133
    .line 134
    new-instance v5, La/adw;

    .line 135
    .line 136
    const/16 v6, 0x1a

    .line 137
    .line 138
    invoke-direct {v5, v8, v6}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 139
    .line 140
    .line 141
    new-instance v6, La/wqv;

    .line 142
    .line 143
    const/16 v7, 0x1b

    .line 144
    .line 145
    invoke-direct {v6, v8, v9, v7}, La/wqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 146
    .line 147
    .line 148
    new-instance v18, La/q4z;

    .line 149
    .line 150
    const/4 v13, 0x0

    .line 151
    const/4 v14, 0x1

    .line 152
    move-object/from16 v7, v18

    .line 153
    .line 154
    invoke-direct/range {v7 .. v14}, La/q4z;-><init>(Ljava/lang/Object;La/l4z;ZZILa/yje;B)V

    .line 155
    .line 156
    .line 157
    const-wide/16 v13, 0x8

    .line 158
    .line 159
    move-object/from16 v16, v5

    .line 160
    .line 161
    move-object/from16 v17, v6

    .line 162
    .line 163
    invoke-static/range {v13 .. v18}, La/nkb;->H(JLa/i2o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/vsg0;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    new-instance v6, La/j5z;

    .line 168
    .line 169
    iget-wide v14, v0, La/e5z;->p:J

    .line 170
    .line 171
    invoke-direct {v6, v5, v14, v15, v3}, La/j5z;-><init>(La/vsg0;JB)V

    .line 172
    .line 173
    .line 174
    new-instance v7, La/g5z;

    .line 175
    .line 176
    const/16 v16, 0x0

    .line 177
    .line 178
    const/16 v17, 0x1

    .line 179
    .line 180
    iget-object v8, v0, La/e5z;->l:La/a6u;

    .line 181
    .line 182
    iget-wide v9, v0, La/e5z;->q:J

    .line 183
    .line 184
    iget-boolean v11, v0, La/e5z;->r:Z

    .line 185
    .line 186
    iget-wide v12, v0, La/e5z;->s:J

    .line 187
    .line 188
    invoke-direct/range {v7 .. v17}, La/g5z;-><init>(La/a6u;JZJJLa/yje;B)V

    .line 189
    .line 190
    .line 191
    new-instance v5, La/dnq;

    .line 192
    .line 193
    invoke-direct {v5, v6, v7, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 194
    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_3
    instance-of v5, v5, La/k4z;

    .line 198
    .line 199
    if-eqz v5, :cond_5

    .line 200
    .line 201
    new-instance v5, La/eu4;

    .line 202
    .line 203
    const/16 v6, 0xc

    .line 204
    .line 205
    invoke-direct {v5, v4, v6}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 206
    .line 207
    .line 208
    :goto_0
    iput-object v4, v0, La/e5z;->j:La/kmq;

    .line 209
    .line 210
    iput-object v4, v0, La/e5z;->k:Ljava/lang/Object;

    .line 211
    .line 212
    iput-boolean v3, v0, La/e5z;->i:Z

    .line 213
    .line 214
    invoke-static {v2, v5, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-ne v0, v1, :cond_4

    .line 219
    .line 220
    return-object v1

    .line 221
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object v0

    .line 224
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 225
    .line 226
    .line 227
    return-object v4
.end method
