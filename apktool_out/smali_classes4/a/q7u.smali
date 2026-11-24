.class public final La/q7u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/pwi;

.field public final synthetic m:I

.field public final synthetic n:Z

.field public o:La/kmq;

.field public p:Ljava/util/List;

.field public q:La/gmq;

.field public r:Z

.field public s:I


# direct methods
.method public constructor <init>(La/yje;La/pwi;IZ)V
    .locals 0

    .line 1
    iput-object p2, p0, La/q7u;->l:La/pwi;

    .line 2
    .line 3
    iput p3, p0, La/q7u;->m:I

    .line 4
    .line 5
    iput-boolean p4, p0, La/q7u;->n:Z

    .line 6
    .line 7
    const/4 p2, 0x3

    .line 8
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p3, La/yje;

    .line 4
    .line 5
    new-instance v0, La/q7u;

    .line 6
    .line 7
    iget v1, p0, La/q7u;->m:I

    .line 8
    .line 9
    iget-boolean v2, p0, La/q7u;->n:Z

    .line 10
    .line 11
    iget-object p0, p0, La/q7u;->l:La/pwi;

    .line 12
    .line 13
    invoke-direct {v0, p3, p0, v1, v2}, La/q7u;-><init>(La/yje;La/pwi;IZ)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/q7u;->j:La/kmq;

    .line 17
    .line 18
    iput-object p2, v0, La/q7u;->k:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, La/q7u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v6, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v0, p0, La/q7u;->i:B

    .line 4
    .line 5
    const/4 v7, 0x4

    .line 6
    const/4 v8, 0x3

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x1

    .line 9
    iget-object v9, p0, La/q7u;->l:La/pwi;

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    if-eq v0, v2, :cond_3

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    if-eq v0, v8, :cond_1

    .line 19
    .line 20
    if-ne v0, v7, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v10

    .line 33
    :cond_1
    iget-object v0, p0, La/q7u;->q:La/gmq;

    .line 34
    .line 35
    check-cast v0, La/gmq;

    .line 36
    .line 37
    iget-object v1, p0, La/q7u;->p:Ljava/util/List;

    .line 38
    .line 39
    iget-object v2, p0, La/q7u;->o:La/kmq;

    .line 40
    .line 41
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v11, v0

    .line 45
    move-object v0, p1

    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_2
    iget v0, p0, La/q7u;->s:I

    .line 49
    .line 50
    iget-boolean v1, p0, La/q7u;->r:Z

    .line 51
    .line 52
    iget-object v2, p0, La/q7u;->p:Ljava/util/List;

    .line 53
    .line 54
    iget-object v3, p0, La/q7u;->o:La/kmq;

    .line 55
    .line 56
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v12, v2

    .line 60
    move-object v13, v3

    .line 61
    move v3, v0

    .line 62
    move-object v0, p1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    iget-boolean v0, p0, La/q7u;->r:Z

    .line 65
    .line 66
    iget-object v2, p0, La/q7u;->p:Ljava/util/List;

    .line 67
    .line 68
    iget-object v3, p0, La/q7u;->o:La/kmq;

    .line 69
    .line 70
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object v12, v2

    .line 74
    move-object v2, p1

    .line 75
    :goto_0
    move v11, v0

    .line 76
    move-object v13, v3

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v3, p0, La/q7u;->j:La/kmq;

    .line 82
    .line 83
    iget-object v0, p0, La/q7u;->k:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v4, v9, La/pwi;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v4, La/luu;

    .line 94
    .line 95
    iget-object v4, v4, La/luu;->a:La/nok0;

    .line 96
    .line 97
    invoke-virtual {v4}, La/nok0;->a()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iput-object v10, p0, La/q7u;->j:La/kmq;

    .line 102
    .line 103
    iput-object v10, p0, La/q7u;->k:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v3, p0, La/q7u;->o:La/kmq;

    .line 106
    .line 107
    iput-object v4, p0, La/q7u;->p:Ljava/util/List;

    .line 108
    .line 109
    iput-boolean v0, p0, La/q7u;->r:Z

    .line 110
    .line 111
    iput-byte v2, p0, La/q7u;->i:B

    .line 112
    .line 113
    invoke-virtual {v9, p0}, La/pwi;->k(La/zje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-ne v2, v6, :cond_5

    .line 118
    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_5
    move-object v12, v4

    .line 122
    goto :goto_0

    .line 123
    :goto_1
    check-cast v2, Ljava/lang/Number;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    sget-object v2, La/sip;->c:La/sip;

    .line 130
    .line 131
    iput-object v10, p0, La/q7u;->j:La/kmq;

    .line 132
    .line 133
    iput-object v10, p0, La/q7u;->k:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v13, p0, La/q7u;->o:La/kmq;

    .line 136
    .line 137
    iput-object v12, p0, La/q7u;->p:Ljava/util/List;

    .line 138
    .line 139
    iput-boolean v11, p0, La/q7u;->r:Z

    .line 140
    .line 141
    iput v3, p0, La/q7u;->s:I

    .line 142
    .line 143
    iput-byte v1, p0, La/q7u;->i:B

    .line 144
    .line 145
    iget-object v0, p0, La/q7u;->l:La/pwi;

    .line 146
    .line 147
    iget v1, p0, La/q7u;->m:I

    .line 148
    .line 149
    iget-boolean v4, p0, La/q7u;->n:Z

    .line 150
    .line 151
    move-object v5, p0

    .line 152
    invoke-virtual/range {v0 .. v5}, La/pwi;->i(ILa/sip;IZLa/zje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-ne v0, v6, :cond_6

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_6
    move v1, v11

    .line 160
    :goto_2
    move-object v11, v0

    .line 161
    check-cast v11, La/gmq;

    .line 162
    .line 163
    sget-object v2, La/sip;->b:La/sip;

    .line 164
    .line 165
    iput-object v10, p0, La/q7u;->j:La/kmq;

    .line 166
    .line 167
    iput-object v10, p0, La/q7u;->k:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v13, p0, La/q7u;->o:La/kmq;

    .line 170
    .line 171
    iput-object v12, p0, La/q7u;->p:Ljava/util/List;

    .line 172
    .line 173
    move-object v0, v11

    .line 174
    check-cast v0, La/gmq;

    .line 175
    .line 176
    iput-object v0, p0, La/q7u;->q:La/gmq;

    .line 177
    .line 178
    iput-boolean v1, p0, La/q7u;->r:Z

    .line 179
    .line 180
    iput v3, p0, La/q7u;->s:I

    .line 181
    .line 182
    iput-byte v8, p0, La/q7u;->i:B

    .line 183
    .line 184
    iget-object v0, p0, La/q7u;->l:La/pwi;

    .line 185
    .line 186
    iget v1, p0, La/q7u;->m:I

    .line 187
    .line 188
    iget-boolean v4, p0, La/q7u;->n:Z

    .line 189
    .line 190
    move-object v5, p0

    .line 191
    invoke-virtual/range {v0 .. v5}, La/pwi;->i(ILa/sip;IZLa/zje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-ne v0, v6, :cond_7

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_7
    move-object v1, v12

    .line 199
    move-object v2, v13

    .line 200
    :goto_3
    check-cast v0, La/gmq;

    .line 201
    .line 202
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    new-instance v3, La/fhq;

    .line 206
    .line 207
    const/16 v4, 0x9

    .line 208
    .line 209
    invoke-direct {v3, v9, v10, v4}, La/fhq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 210
    .line 211
    .line 212
    new-instance v4, La/vsg0;

    .line 213
    .line 214
    invoke-direct {v4, v3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 215
    .line 216
    .line 217
    new-instance v3, La/r7u;

    .line 218
    .line 219
    const/4 v8, 0x0

    .line 220
    invoke-direct {v3, v1, v10, v8}, La/r7u;-><init>(Ljava/util/List;La/yje;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {v11, v0, v4, v3}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    iput-object v10, p0, La/q7u;->j:La/kmq;

    .line 228
    .line 229
    iput-object v10, p0, La/q7u;->k:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v10, p0, La/q7u;->o:La/kmq;

    .line 232
    .line 233
    iput-object v10, p0, La/q7u;->p:Ljava/util/List;

    .line 234
    .line 235
    iput-object v10, p0, La/q7u;->q:La/gmq;

    .line 236
    .line 237
    iput-byte v7, p0, La/q7u;->i:B

    .line 238
    .line 239
    invoke-static {v2, v0, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    if-ne v0, v6, :cond_8

    .line 244
    .line 245
    :goto_4
    return-object v6

    .line 246
    :cond_8
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0
.end method
