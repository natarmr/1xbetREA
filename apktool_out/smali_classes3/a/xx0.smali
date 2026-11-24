.class public final La/xx0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xzp;

.field public final b:La/btt0;


# direct methods
.method public constructor <init>(La/xzp;La/btt0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xx0;->a:La/xzp;

    .line 8
    .line 9
    iput-object p2, p0, La/xx0;->b:La/btt0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(ZLjava/lang/String;La/qmu0;ZLa/zje;)Ljava/io/Serializable;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    instance-of v4, v3, La/wx0;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, La/wx0;

    .line 15
    .line 16
    iget v5, v4, La/wx0;->l:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/wx0;->l:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/wx0;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, La/wx0;-><init>(La/xx0;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, La/wx0;->j:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/wx0;->l:I

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    if-eq v6, v8, :cond_2

    .line 45
    .line 46
    if-ne v6, v7, :cond_1

    .line 47
    .line 48
    iget-object v0, v4, La/wx0;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v9

    .line 61
    :cond_2
    iget-object v0, v4, La/wx0;->i:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v3, v0, La/xx0;->b:La/btt0;

    .line 71
    .line 72
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const/4 v6, 0x0

    .line 77
    iget-object v0, v0, La/xx0;->a:La/xzp;

    .line 78
    .line 79
    if-eqz p4, :cond_6

    .line 80
    .line 81
    instance-of v7, v2, La/omu0;

    .line 82
    .line 83
    if-eqz v7, :cond_4

    .line 84
    .line 85
    check-cast v2, La/omu0;

    .line 86
    .line 87
    iget-byte v6, v2, La/omu0;->a:B

    .line 88
    .line 89
    :cond_4
    move v11, v6

    .line 90
    const-string v2, "847"

    .line 91
    .line 92
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object v20

    .line 100
    const/16 v22, 0x0

    .line 101
    .line 102
    const/16 v23, 0x77f8

    .line 103
    .line 104
    const/4 v10, 0x0

    .line 105
    const/4 v13, 0x0

    .line 106
    const/4 v14, 0x0

    .line 107
    const/4 v15, 0x0

    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const/16 v18, 0x0

    .line 113
    .line 114
    const/16 v19, 0x0

    .line 115
    .line 116
    const/16 v21, 0x0

    .line 117
    .line 118
    invoke-static/range {v10 .. v23}, La/cwr0;->K(IILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;I)La/jo20;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iput-object v1, v4, La/wx0;->i:Ljava/lang/String;

    .line 123
    .line 124
    iput v8, v4, La/wx0;->l:I

    .line 125
    .line 126
    invoke-static {v0, v2, v3, v4}, La/xzp;->z(La/xzp;La/jo20;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    if-ne v3, v5, :cond_5

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    move-object v0, v1

    .line 134
    :goto_1
    check-cast v3, La/dx5;

    .line 135
    .line 136
    invoke-virtual {v3}, La/dx5;->a()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, La/ty0;

    .line 141
    .line 142
    iget-object v1, v1, La/ty0;->a:Ljava/util/List;

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    move/from16 v8, p1

    .line 146
    .line 147
    invoke-static {v8, v6, v2}, La/zcm0;->h(ZILa/qmu0;)La/edy;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    iput-object v1, v4, La/wx0;->i:Ljava/lang/String;

    .line 152
    .line 153
    iput v7, v4, La/wx0;->l:I

    .line 154
    .line 155
    invoke-virtual {v0, v2, v3, v4}, La/xzp;->W(La/edy;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    if-ne v3, v5, :cond_7

    .line 160
    .line 161
    :goto_2
    return-object v5

    .line 162
    :cond_7
    move-object v0, v1

    .line 163
    :goto_3
    check-cast v3, La/dx5;

    .line 164
    .line 165
    invoke-virtual {v3}, La/dx5;->a()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, La/ty0;

    .line 170
    .line 171
    iget-object v1, v1, La/ty0;->a:Ljava/util/List;

    .line 172
    .line 173
    :goto_4
    if-eqz v1, :cond_8

    .line 174
    .line 175
    new-instance v9, Ljava/util/ArrayList;

    .line 176
    .line 177
    const/16 v2, 0xa

    .line 178
    .line 179
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_8

    .line 195
    .line 196
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, La/bw0;

    .line 201
    .line 202
    invoke-static {v2, v0}, La/jar0;->b0(La/bw0;Ljava/lang/String;)La/mlr;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_8
    if-nez v9, :cond_9

    .line 211
    .line 212
    sget-object v0, La/iun;->a:La/iun;

    .line 213
    .line 214
    return-object v0

    .line 215
    :cond_9
    return-object v9
.end method
