.class public final La/mc40;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/cyu;

.field public final synthetic m:J

.field public n:La/kmq;

.field public o:Ljava/util/List;

.field public p:La/dgu;

.field public q:Ljava/util/List;


# direct methods
.method public constructor <init>(La/yje;La/cyu;J)V
    .locals 0

    .line 1
    iput-object p2, p0, La/mc40;->l:La/cyu;

    .line 2
    .line 3
    iput-wide p3, p0, La/mc40;->m:J

    .line 4
    .line 5
    const/4 p2, 0x3

    .line 6
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p3, La/yje;

    .line 4
    .line 5
    new-instance v0, La/mc40;

    .line 6
    .line 7
    iget-object v1, p0, La/mc40;->l:La/cyu;

    .line 8
    .line 9
    iget-wide v2, p0, La/mc40;->m:J

    .line 10
    .line 11
    invoke-direct {v0, p3, v1, v2, v3}, La/mc40;-><init>(La/yje;La/cyu;J)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/mc40;->j:La/kmq;

    .line 15
    .line 16
    iput-object p2, v0, La/mc40;->k:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, La/mc40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/mc40;->i:B

    .line 6
    .line 7
    const/16 v3, 0xc

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    if-eq v2, v4, :cond_1

    .line 15
    .line 16
    if-ne v2, v5, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v6

    .line 29
    :cond_1
    iget-object v2, v0, La/mc40;->q:Ljava/util/List;

    .line 30
    .line 31
    iget-object v7, v0, La/mc40;->p:La/dgu;

    .line 32
    .line 33
    iget-object v8, v0, La/mc40;->o:Ljava/util/List;

    .line 34
    .line 35
    iget-object v9, v0, La/mc40;->n:La/kmq;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object v10, v7

    .line 41
    move-object/from16 v7, p1

    .line 42
    .line 43
    :cond_2
    move-object v12, v2

    .line 44
    move-object v2, v8

    .line 45
    move-object v15, v9

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v9, v0, La/mc40;->j:La/kmq;

    .line 51
    .line 52
    iget-object v2, v0, La/mc40;->k:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v8, v2

    .line 55
    check-cast v8, Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 64
    .line 65
    sget-object v2, La/iun;->a:La/iun;

    .line 66
    .line 67
    new-instance v4, La/j0g0;

    .line 68
    .line 69
    invoke-direct {v4, v2}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v2, La/eu4;

    .line 73
    .line 74
    invoke-direct {v2, v4, v3}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 80
    .line 81
    const/16 v7, 0xa

    .line 82
    .line 83
    invoke-static {v8, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-eqz v10, :cond_5

    .line 99
    .line 100
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    check-cast v10, La/qb40;

    .line 105
    .line 106
    iget v10, v10, La/qb40;->a:I

    .line 107
    .line 108
    new-instance v11, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-direct {v11, v10}, Ljava/lang/Integer;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iget-object v7, v0, La/mc40;->l:La/cyu;

    .line 122
    .line 123
    iget-object v10, v7, La/cyu;->a:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v10, La/dgu;

    .line 126
    .line 127
    iget-object v7, v7, La/cyu;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v7, La/x0u;

    .line 130
    .line 131
    iput-object v6, v0, La/mc40;->j:La/kmq;

    .line 132
    .line 133
    iput-object v6, v0, La/mc40;->k:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v9, v0, La/mc40;->n:La/kmq;

    .line 136
    .line 137
    iput-object v8, v0, La/mc40;->o:Ljava/util/List;

    .line 138
    .line 139
    iput-object v10, v0, La/mc40;->p:La/dgu;

    .line 140
    .line 141
    iput-object v2, v0, La/mc40;->q:Ljava/util/List;

    .line 142
    .line 143
    iput-byte v4, v0, La/mc40;->i:B

    .line 144
    .line 145
    invoke-virtual {v7, v0}, La/x0u;->c(La/yje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    if-ne v7, v1, :cond_2

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :goto_1
    check-cast v7, Ljava/lang/Number;

    .line 153
    .line 154
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v7, La/atj;

    .line 165
    .line 166
    const/16 v8, 0x10

    .line 167
    .line 168
    invoke-direct {v7, v10, v6, v8}, La/atj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 169
    .line 170
    .line 171
    new-instance v8, La/vsg0;

    .line 172
    .line 173
    invoke-direct {v8, v7}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    move-object v7, v8

    .line 177
    new-instance v8, La/p2h;

    .line 178
    .line 179
    const/4 v9, 0x0

    .line 180
    iget-wide v13, v0, La/mc40;->m:J

    .line 181
    .line 182
    invoke-direct/range {v8 .. v14}, La/p2h;-><init>(La/yje;La/dgu;ILjava/util/List;J)V

    .line 183
    .line 184
    .line 185
    invoke-static {v7, v8}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    new-instance v8, La/oz0;

    .line 190
    .line 191
    const/16 v9, 0x18

    .line 192
    .line 193
    const/4 v10, 0x3

    .line 194
    invoke-direct {v8, v10, v6, v9}, La/oz0;-><init>(ILa/yje;B)V

    .line 195
    .line 196
    .line 197
    new-instance v9, La/dnq;

    .line 198
    .line 199
    invoke-direct {v9, v7, v8, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 200
    .line 201
    .line 202
    new-instance v7, La/fot;

    .line 203
    .line 204
    const/4 v8, 0x4

    .line 205
    invoke-direct {v7, v5, v6, v8}, La/fot;-><init>(ILa/yje;B)V

    .line 206
    .line 207
    .line 208
    new-instance v8, La/fnq;

    .line 209
    .line 210
    invoke-direct {v8, v9, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 211
    .line 212
    .line 213
    new-instance v7, La/eu4;

    .line 214
    .line 215
    invoke-direct {v7, v2, v3}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 216
    .line 217
    .line 218
    new-instance v2, La/y8p;

    .line 219
    .line 220
    const/16 v3, 0x9

    .line 221
    .line 222
    invoke-direct {v2, v10, v6, v3}, La/y8p;-><init>(ILa/yje;B)V

    .line 223
    .line 224
    .line 225
    new-instance v3, La/p6d;

    .line 226
    .line 227
    invoke-direct {v3, v7, v8, v2, v4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 228
    .line 229
    .line 230
    move-object v2, v3

    .line 231
    move-object v9, v15

    .line 232
    :goto_2
    iput-object v6, v0, La/mc40;->j:La/kmq;

    .line 233
    .line 234
    iput-object v6, v0, La/mc40;->k:Ljava/lang/Object;

    .line 235
    .line 236
    iput-object v6, v0, La/mc40;->n:La/kmq;

    .line 237
    .line 238
    iput-object v6, v0, La/mc40;->o:Ljava/util/List;

    .line 239
    .line 240
    iput-object v6, v0, La/mc40;->p:La/dgu;

    .line 241
    .line 242
    iput-object v6, v0, La/mc40;->q:Ljava/util/List;

    .line 243
    .line 244
    iput-byte v5, v0, La/mc40;->i:B

    .line 245
    .line 246
    invoke-static {v9, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-ne v0, v1, :cond_6

    .line 251
    .line 252
    :goto_3
    return-object v1

    .line 253
    :cond_6
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0
.end method
