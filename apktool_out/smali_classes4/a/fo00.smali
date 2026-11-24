.class public final La/fo00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:B

.field public final synthetic j:La/pzu;

.field public final synthetic k:La/j700;

.field public final synthetic l:I

.field public final synthetic m:Ljava/util/Set;

.field public final synthetic n:Z

.field public final synthetic o:Ljava/util/Set;

.field public final synthetic p:Z


# direct methods
.method public constructor <init>(La/pzu;La/j700;ILjava/util/Set;ZLjava/util/Set;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fo00;->j:La/pzu;

    .line 2
    .line 3
    iput-object p2, p0, La/fo00;->k:La/j700;

    .line 4
    .line 5
    iput p3, p0, La/fo00;->l:I

    .line 6
    .line 7
    iput-object p4, p0, La/fo00;->m:Ljava/util/Set;

    .line 8
    .line 9
    iput-boolean p5, p0, La/fo00;->n:Z

    .line 10
    .line 11
    iput-object p6, p0, La/fo00;->o:Ljava/util/Set;

    .line 12
    .line 13
    iput-boolean p7, p0, La/fo00;->p:Z

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/fo00;

    .line 2
    .line 3
    iget-object v6, p0, La/fo00;->o:Ljava/util/Set;

    .line 4
    .line 5
    iget-boolean v7, p0, La/fo00;->p:Z

    .line 6
    .line 7
    iget-object v1, p0, La/fo00;->j:La/pzu;

    .line 8
    .line 9
    iget-object v2, p0, La/fo00;->k:La/j700;

    .line 10
    .line 11
    iget v3, p0, La/fo00;->l:I

    .line 12
    .line 13
    iget-object v4, p0, La/fo00;->m:Ljava/util/Set;

    .line 14
    .line 15
    iget-boolean v5, p0, La/fo00;->n:Z

    .line 16
    .line 17
    move-object v8, p1

    .line 18
    invoke-direct/range {v0 .. v8}, La/fo00;-><init>(La/pzu;La/j700;ILjava/util/Set;ZLjava/util/Set;ZLa/yje;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/fo00;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fo00;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/fo00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/fo00;->i:B

    .line 6
    .line 7
    iget-object v5, v0, La/fo00;->k:La/j700;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    iget-object v6, v0, La/fo00;->j:La/pzu;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    return-object v0

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object/from16 v2, p1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, v6, La/pzu;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, La/rtu;

    .line 42
    .line 43
    invoke-static {v5}, La/t9x;->J(La/j700;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    iput-byte v4, v0, La/fo00;->i:B

    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    invoke-virtual {v2, v7, v8, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-ne v2, v1, :cond_3

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_3
    :goto_0
    check-cast v2, La/c3c0;

    .line 59
    .line 60
    iget-object v7, v6, La/pzu;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v7, La/viu;

    .line 63
    .line 64
    invoke-virtual {v7}, La/viu;->a()J

    .line 65
    .line 66
    .line 67
    move-result-wide v7

    .line 68
    invoke-static {v7, v8}, La/ynq0;->f(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v14

    .line 72
    iget-object v7, v6, La/pzu;->b:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v11, v7

    .line 75
    check-cast v11, La/pzu;

    .line 76
    .line 77
    iget-boolean v9, v2, La/c3c0;->b:Z

    .line 78
    .line 79
    iget-wide v7, v2, La/c3c0;->c:J

    .line 80
    .line 81
    iget-object v2, v6, La/pzu;->e:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, La/pru;

    .line 84
    .line 85
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget-boolean v2, v2, La/sff0;->O1:Z

    .line 90
    .line 91
    iput-byte v3, v0, La/fo00;->i:B

    .line 92
    .line 93
    new-instance v3, La/hie0;

    .line 94
    .line 95
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    iget-object v6, v11, La/pzu;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v6, La/uzc;

    .line 101
    .line 102
    invoke-virtual {v6}, La/uzc;->c()La/fnq;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    move-object v10, v3

    .line 107
    new-instance v3, La/go00;

    .line 108
    .line 109
    move v12, v4

    .line 110
    const/4 v4, 0x0

    .line 111
    move-object v13, v6

    .line 112
    move-object v6, v11

    .line 113
    move-wide/from16 v19, v7

    .line 114
    .line 115
    move-object v8, v10

    .line 116
    move-wide/from16 v10, v19

    .line 117
    .line 118
    iget v7, v0, La/fo00;->l:I

    .line 119
    .line 120
    move-object/from16 v16, v8

    .line 121
    .line 122
    iget-object v8, v0, La/fo00;->m:Ljava/util/Set;

    .line 123
    .line 124
    move/from16 v17, v12

    .line 125
    .line 126
    iget-object v12, v0, La/fo00;->o:Ljava/util/Set;

    .line 127
    .line 128
    move-object/from16 v18, v13

    .line 129
    .line 130
    iget-boolean v13, v0, La/fo00;->n:Z

    .line 131
    .line 132
    move/from16 p1, v2

    .line 133
    .line 134
    move-object/from16 v2, v16

    .line 135
    .line 136
    move/from16 v0, v17

    .line 137
    .line 138
    move-object/from16 v16, v1

    .line 139
    .line 140
    move-object/from16 v1, v18

    .line 141
    .line 142
    invoke-direct/range {v3 .. v15}, La/go00;-><init>(La/yje;La/j700;La/pzu;ILjava/util/Set;ZJLjava/util/Set;ZJ)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1, v3}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    new-instance v3, La/uwu;

    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    invoke-direct {v3, v2, v10, v0}, La/uwu;-><init>(La/hie0;La/yje;B)V

    .line 153
    .line 154
    .line 155
    new-instance v4, La/fnq;

    .line 156
    .line 157
    const/4 v5, 0x4

    .line 158
    invoke-direct {v4, v1, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 159
    .line 160
    .line 161
    new-instance v1, La/qos;

    .line 162
    .line 163
    const/16 v3, 0xa

    .line 164
    .line 165
    invoke-direct {v1, v2, v10, v3}, La/qos;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 166
    .line 167
    .line 168
    new-instance v2, La/dnq;

    .line 169
    .line 170
    invoke-direct {v2, v4, v1, v0}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 171
    .line 172
    .line 173
    new-instance v8, La/b9u;

    .line 174
    .line 175
    const/16 v9, 0x8

    .line 176
    .line 177
    move-object/from16 v0, p0

    .line 178
    .line 179
    iget-boolean v12, v0, La/fo00;->p:Z

    .line 180
    .line 181
    move/from16 v13, p1

    .line 182
    .line 183
    move-object v11, v6

    .line 184
    invoke-direct/range {v8 .. v13}, La/b9u;-><init>(BLa/yje;Ljava/lang/Object;ZZ)V

    .line 185
    .line 186
    .line 187
    invoke-static {v2, v8}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    new-instance v1, La/sot;

    .line 192
    .line 193
    const/16 v2, 0x18

    .line 194
    .line 195
    invoke-direct {v1, v10, v6, v2}, La/sot;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 196
    .line 197
    .line 198
    invoke-static {v0, v1}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    move-object/from16 v1, v16

    .line 203
    .line 204
    if-ne v0, v1, :cond_4

    .line 205
    .line 206
    :goto_1
    return-object v1

    .line 207
    :cond_4
    return-object v0
.end method
