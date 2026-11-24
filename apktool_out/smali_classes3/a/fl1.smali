.class public final La/fl1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:I

.field public j:I

.field public k:La/u8u;

.field public l:J

.field public m:B

.field public final synthetic n:La/gl1;

.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/gl1;JLjava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fl1;->n:La/gl1;

    .line 2
    .line 3
    iput-wide p2, p0, La/fl1;->o:J

    .line 4
    .line 5
    iput-object p4, p0, La/fl1;->p:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/fl1;

    .line 2
    .line 3
    iget-wide v2, p0, La/fl1;->o:J

    .line 4
    .line 5
    iget-object v4, p0, La/fl1;->p:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/fl1;->n:La/gl1;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/fl1;-><init>(La/gl1;JLjava/lang/String;La/yje;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0, p1, p2}, La/fl1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/fl1;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/fl1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    sget-object v6, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v5, La/fl1;->m:B

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    iget-object v7, v5, La/fl1;->n:La/gl1;

    .line 9
    .line 10
    const/4 v8, 0x3

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-eq v0, v2, :cond_2

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    if-ne v0, v8, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v0, p1

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
    return-object v9

    .line 34
    :cond_1
    iget v0, v5, La/fl1;->j:I

    .line 35
    .line 36
    iget-wide v1, v5, La/fl1;->l:J

    .line 37
    .line 38
    iget v3, v5, La/fl1;->i:I

    .line 39
    .line 40
    iget-object v4, v5, La/fl1;->k:La/u8u;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move v10, v3

    .line 46
    move v3, v0

    .line 47
    move v0, v10

    .line 48
    move-wide v10, v1

    .line 49
    move-object/from16 v1, p1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v0, p1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, v7, La/gl1;->p:La/x0u;

    .line 62
    .line 63
    iput-byte v2, v5, La/fl1;->m:B

    .line 64
    .line 65
    invoke-virtual {v0, v5}, La/x0u;->c(La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-ne v0, v6, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_0
    check-cast v0, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v4, v7, La/gl1;->o:La/u8u;

    .line 79
    .line 80
    iget-object v2, v7, La/gl1;->q:La/nou;

    .line 81
    .line 82
    iput-object v4, v5, La/fl1;->k:La/u8u;

    .line 83
    .line 84
    iput v0, v5, La/fl1;->i:I

    .line 85
    .line 86
    iget-wide v10, v5, La/fl1;->o:J

    .line 87
    .line 88
    iput-wide v10, v5, La/fl1;->l:J

    .line 89
    .line 90
    iput v0, v5, La/fl1;->j:I

    .line 91
    .line 92
    iput-byte v1, v5, La/fl1;->m:B

    .line 93
    .line 94
    invoke-static {v2, v5}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-ne v1, v6, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    move v3, v0

    .line 102
    :goto_1
    check-cast v1, La/ql5;

    .line 103
    .line 104
    iget-wide v1, v1, La/ql5;->e:J

    .line 105
    .line 106
    long-to-int v1, v1

    .line 107
    move-object v2, v4

    .line 108
    new-instance v4, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 111
    .line 112
    .line 113
    iput-object v9, v5, La/fl1;->k:La/u8u;

    .line 114
    .line 115
    iput v0, v5, La/fl1;->i:I

    .line 116
    .line 117
    iput-byte v8, v5, La/fl1;->m:B

    .line 118
    .line 119
    move-object v0, v2

    .line 120
    move-wide v1, v10

    .line 121
    invoke-virtual/range {v0 .. v5}, La/u8u;->t(JILjava/lang/Integer;La/zje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v6, :cond_6

    .line 126
    .line 127
    :goto_2
    return-object v6

    .line 128
    :cond_6
    :goto_3
    check-cast v0, La/gu1;

    .line 129
    .line 130
    iget-object v0, v0, La/gu1;->i:La/s98;

    .line 131
    .line 132
    iget-object v0, v0, La/s98;->a:Ljava/util/List;

    .line 133
    .line 134
    invoke-static {v0, v8}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v10, Ljava/util/ArrayList;

    .line 139
    .line 140
    const/16 v1, 0xa

    .line 141
    .line 142
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const/4 v1, 0x0

    .line 154
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_8

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    add-int/lit8 v3, v1, 0x1

    .line 165
    .line 166
    if-ltz v1, :cond_7

    .line 167
    .line 168
    check-cast v2, Ljava/lang/String;

    .line 169
    .line 170
    new-instance v1, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v4, ". "

    .line 179
    .line 180
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move v1, v3

    .line 194
    goto :goto_4

    .line 195
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 196
    .line 197
    .line 198
    throw v9

    .line 199
    :cond_8
    const/4 v14, 0x0

    .line 200
    const/16 v15, 0x3e

    .line 201
    .line 202
    const-string v11, "\n"

    .line 203
    .line 204
    const/4 v12, 0x0

    .line 205
    const/4 v13, 0x0

    .line 206
    invoke-static/range {v10 .. v15}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    sget v1, La/gl1;->r:I

    .line 211
    .line 212
    iget-object v1, v7, La/i3t0;->i:La/ocj;

    .line 213
    .line 214
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 215
    .line 216
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-object v3, v2

    .line 224
    check-cast v3, La/dl1;

    .line 225
    .line 226
    iget-object v4, v5, La/fl1;->p:Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v3, v4, v0}, La/dl1;->a(La/dl1;Ljava/lang/String;Ljava/lang/String;)La/dl1;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-eqz v2, :cond_9

    .line 237
    .line 238
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0
.end method
