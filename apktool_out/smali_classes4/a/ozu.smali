.class public final La/ozu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:[Ljava/lang/Object;

.field public j:La/kmq;

.field public k:[Ljava/lang/Object;

.field public l:Z

.field public m:B

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/pzu;

.field public final synthetic p:Z

.field public final synthetic q:Z

.field public final synthetic r:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/pzu;ZZLkotlin/jvm/functions/Function1;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ozu;->o:La/pzu;

    .line 2
    .line 3
    iput-boolean p2, p0, La/ozu;->p:Z

    .line 4
    .line 5
    iput-boolean p3, p0, La/ozu;->q:Z

    .line 6
    .line 7
    iput-object p4, p0, La/ozu;->r:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/ozu;

    .line 2
    .line 3
    iget-boolean v3, p0, La/ozu;->q:Z

    .line 4
    .line 5
    iget-object v4, p0, La/ozu;->r:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v1, p0, La/ozu;->o:La/pzu;

    .line 8
    .line 9
    iget-boolean v2, p0, La/ozu;->p:Z

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/ozu;-><init>(La/pzu;ZZLkotlin/jvm/functions/Function1;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/ozu;->n:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/ozu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ozu;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ozu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/ozu;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/kmq;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/ozu;->m:B

    .line 10
    .line 11
    const/16 v4, 0x16

    .line 12
    .line 13
    iget-object v9, v0, La/ozu;->r:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    iget-object v13, v0, La/ozu;->o:La/pzu;

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    const/4 v6, 0x1

    .line 19
    const/4 v7, 0x0

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    if-eq v3, v6, :cond_1

    .line 23
    .line 24
    if-ne v3, v5, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_4

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
    return-object v7

    .line 37
    :cond_1
    iget-boolean v6, v0, La/ozu;->l:Z

    .line 38
    .line 39
    iget-object v1, v0, La/ozu;->k:[Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, [La/gmq;

    .line 42
    .line 43
    iget-object v3, v0, La/ozu;->j:La/kmq;

    .line 44
    .line 45
    iget-object v8, v0, La/ozu;->i:[Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v8, [La/gmq;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v5, v3

    .line 53
    move-object v3, v1

    .line 54
    move-object v1, v5

    .line 55
    move-object/from16 v5, p1

    .line 56
    .line 57
    move-object v14, v7

    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-array v3, v5, [La/gmq;

    .line 64
    .line 65
    new-instance v8, La/hie0;

    .line 66
    .line 67
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    iget-boolean v10, v0, La/ozu;->p:Z

    .line 71
    .line 72
    iput-boolean v10, v8, La/hie0;->a:Z

    .line 73
    .line 74
    iget-boolean v14, v0, La/ozu;->q:Z

    .line 75
    .line 76
    if-eqz v14, :cond_3

    .line 77
    .line 78
    const-wide/16 v10, 0x8

    .line 79
    .line 80
    :goto_0
    move-wide v11, v10

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const-wide/16 v10, 0x1e

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :goto_1
    new-instance v10, La/y0f;

    .line 86
    .line 87
    const/4 v15, 0x0

    .line 88
    invoke-direct/range {v10 .. v15}, La/y0f;-><init>(JLa/pzu;ZLa/yje;)V

    .line 89
    .line 90
    .line 91
    new-instance v15, La/vsg0;

    .line 92
    .line 93
    invoke-direct {v15, v10}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 94
    .line 95
    .line 96
    move v10, v5

    .line 97
    new-instance v5, La/qqu;

    .line 98
    .line 99
    const/4 v10, 0x5

    .line 100
    invoke-direct {v5, v15, v8, v10}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 101
    .line 102
    .line 103
    new-instance v10, La/lqu;

    .line 104
    .line 105
    const/4 v15, 0x7

    .line 106
    invoke-direct {v10, v8, v15}, La/lqu;-><init>(La/hie0;B)V

    .line 107
    .line 108
    .line 109
    move-object v8, v10

    .line 110
    new-instance v10, La/isu;

    .line 111
    .line 112
    invoke-direct {v10, v13, v14, v7, v6}, La/isu;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 113
    .line 114
    .line 115
    move-object v14, v7

    .line 116
    move-wide/from16 v16, v11

    .line 117
    .line 118
    move v12, v6

    .line 119
    move-object v6, v8

    .line 120
    move-wide/from16 v7, v16

    .line 121
    .line 122
    const/4 v11, 0x0

    .line 123
    move v15, v12

    .line 124
    const/16 v12, 0x28

    .line 125
    .line 126
    invoke-static/range {v5 .. v12}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    new-instance v6, La/i89;

    .line 131
    .line 132
    invoke-direct {v6, v5, v4}, La/i89;-><init>(La/gmq;B)V

    .line 133
    .line 134
    .line 135
    const/4 v5, 0x0

    .line 136
    aput-object v6, v3, v5

    .line 137
    .line 138
    iget-object v5, v13, La/pzu;->e:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v5, La/jru;

    .line 141
    .line 142
    iput-object v14, v0, La/ozu;->n:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v3, v0, La/ozu;->i:[Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v1, v0, La/ozu;->j:La/kmq;

    .line 147
    .line 148
    iput-object v3, v0, La/ozu;->k:[Ljava/lang/Object;

    .line 149
    .line 150
    iput-boolean v15, v0, La/ozu;->l:Z

    .line 151
    .line 152
    iput-byte v15, v0, La/ozu;->m:B

    .line 153
    .line 154
    iget-object v5, v5, La/jru;->b:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v5, La/w5z;

    .line 157
    .line 158
    iget-boolean v6, v0, La/ozu;->q:Z

    .line 159
    .line 160
    invoke-virtual {v5, v6}, La/w5z;->t(Z)La/p6d;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    if-ne v5, v2, :cond_4

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_4
    move-object v8, v3

    .line 168
    move v6, v15

    .line 169
    :goto_2
    check-cast v5, La/gmq;

    .line 170
    .line 171
    new-instance v7, La/ewt;

    .line 172
    .line 173
    const/16 v10, 0xe

    .line 174
    .line 175
    invoke-direct {v7, v5, v13, v10}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 176
    .line 177
    .line 178
    new-instance v5, La/oz0;

    .line 179
    .line 180
    const/4 v10, 0x3

    .line 181
    const/16 v11, 0x10

    .line 182
    .line 183
    invoke-direct {v5, v10, v14, v11}, La/oz0;-><init>(ILa/yje;B)V

    .line 184
    .line 185
    .line 186
    invoke-static {v7, v9, v5}, La/uvw;->O(La/gmq;Lkotlin/jvm/functions/Function1;La/xdr;)La/a1g;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    new-instance v7, La/i89;

    .line 191
    .line 192
    invoke-direct {v7, v5, v4}, La/i89;-><init>(La/gmq;B)V

    .line 193
    .line 194
    .line 195
    aput-object v7, v3, v6

    .line 196
    .line 197
    invoke-static {v8}, La/aoq;->b([La/gmq;)La/ltb;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    iput-object v14, v0, La/ozu;->n:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v14, v0, La/ozu;->i:[Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v14, v0, La/ozu;->j:La/kmq;

    .line 206
    .line 207
    iput-object v14, v0, La/ozu;->k:[Ljava/lang/Object;

    .line 208
    .line 209
    const/4 v10, 0x2

    .line 210
    iput-byte v10, v0, La/ozu;->m:B

    .line 211
    .line 212
    invoke-static {v1, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-ne v0, v2, :cond_5

    .line 217
    .line 218
    :goto_3
    return-object v2

    .line 219
    :cond_5
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0
.end method
