.class public final La/giu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public j:J

.field public k:I

.field public l:La/jvn;

.field public m:B

.field public final synthetic n:La/xzp;

.field public final synthetic o:J

.field public final synthetic p:La/aj00;


# direct methods
.method public constructor <init>(La/xzp;JLa/aj00;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/giu;->n:La/xzp;

    .line 2
    .line 3
    iput-wide p2, p0, La/giu;->o:J

    .line 4
    .line 5
    iput-object p4, p0, La/giu;->p:La/aj00;

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
    new-instance v0, La/giu;

    .line 2
    .line 3
    iget-wide v2, p0, La/giu;->o:J

    .line 4
    .line 5
    iget-object v4, p0, La/giu;->p:La/aj00;

    .line 6
    .line 7
    iget-object v1, p0, La/giu;->n:La/xzp;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/giu;-><init>(La/xzp;JLa/aj00;La/yje;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    check-cast p2, La/yje;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, La/giu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/giu;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/giu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v10, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v0, p0, La/giu;->m:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x3

    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, La/giu;->n:La/xzp;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v4, :cond_2

    .line 14
    .line 15
    if-eq v0, v3, :cond_1

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    move-object v0, p1

    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    iget v0, p0, La/giu;->k:I

    .line 32
    .line 33
    iget-wide v3, p0, La/giu;->j:J

    .line 34
    .line 35
    iget-boolean v6, p0, La/giu;->i:Z

    .line 36
    .line 37
    iget-object v7, p0, La/giu;->l:La/jvn;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-wide v11, v3

    .line 43
    move v4, v6

    .line 44
    move-object v8, v7

    .line 45
    move-object v3, p1

    .line 46
    move v7, v0

    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_2
    iget-wide v6, p0, La/giu;->j:J

    .line 50
    .line 51
    iget-boolean v0, p0, La/giu;->i:Z

    .line 52
    .line 53
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object v4, p1

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 62
    .line 63
    iget-object v0, v5, La/xzp;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, La/gst0;

    .line 66
    .line 67
    iget-object v0, v0, La/gst0;->a:La/rrt0;

    .line 68
    .line 69
    invoke-virtual {v0}, La/rrt0;->a()La/krt0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-boolean v0, v0, La/krt0;->c:Z

    .line 74
    .line 75
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 82
    .line 83
    new-instance v6, La/g0g0;

    .line 84
    .line 85
    invoke-direct {v6, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object v0, v6

    .line 89
    :goto_0
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    instance-of v7, v0, La/g0g0;

    .line 92
    .line 93
    if-eqz v7, :cond_4

    .line 94
    .line 95
    move-object v0, v6

    .line 96
    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v6, v5, La/xzp;->e:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v6, La/gst0;

    .line 105
    .line 106
    invoke-virtual {v6}, La/gst0;->e()J

    .line 107
    .line 108
    .line 109
    move-result-wide v6

    .line 110
    iget-object v8, v5, La/xzp;->d:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v8, La/pmi;

    .line 113
    .line 114
    iput-boolean v0, p0, La/giu;->i:Z

    .line 115
    .line 116
    iput-wide v6, p0, La/giu;->j:J

    .line 117
    .line 118
    iput-byte v4, p0, La/giu;->m:B

    .line 119
    .line 120
    invoke-virtual {v8, p0}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    if-ne v4, v10, :cond_5

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    :goto_1
    check-cast v4, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    iget-object v8, v5, La/xzp;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v8, La/uzc;

    .line 136
    .line 137
    invoke-virtual {v8}, La/uzc;->b()La/jvn;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    iget-object v11, v5, La/xzp;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v11, La/ehf0;

    .line 144
    .line 145
    iput-object v8, p0, La/giu;->l:La/jvn;

    .line 146
    .line 147
    iput-boolean v0, p0, La/giu;->i:Z

    .line 148
    .line 149
    iput-wide v6, p0, La/giu;->j:J

    .line 150
    .line 151
    iput v4, p0, La/giu;->k:I

    .line 152
    .line 153
    iput-byte v3, p0, La/giu;->m:B

    .line 154
    .line 155
    invoke-virtual {v11, p0}, La/ehf0;->x(La/zje;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    if-ne v3, v10, :cond_6

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    move-wide v11, v6

    .line 163
    move v7, v4

    .line 164
    move v4, v0

    .line 165
    :goto_2
    check-cast v3, Ljava/util/List;

    .line 166
    .line 167
    iget-object v0, v5, La/xzp;->a:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, La/xfu;

    .line 170
    .line 171
    iput-object v1, p0, La/giu;->l:La/jvn;

    .line 172
    .line 173
    iput-boolean v4, p0, La/giu;->i:Z

    .line 174
    .line 175
    iput-wide v11, p0, La/giu;->j:J

    .line 176
    .line 177
    iput v7, p0, La/giu;->k:I

    .line 178
    .line 179
    iput-byte v2, p0, La/giu;->m:B

    .line 180
    .line 181
    iget-wide v1, p0, La/giu;->o:J

    .line 182
    .line 183
    iget-object v3, p0, La/giu;->p:La/aj00;

    .line 184
    .line 185
    move-object v9, p0

    .line 186
    move-wide v5, v11

    .line 187
    invoke-virtual/range {v0 .. v9}, La/xfu;->f(JLa/aj00;ZJILa/jvn;La/zje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-ne v0, v10, :cond_7

    .line 192
    .line 193
    :goto_3
    return-object v10

    .line 194
    :cond_7
    :goto_4
    check-cast v0, Ljava/util/List;

    .line 195
    .line 196
    return-object v0
.end method
