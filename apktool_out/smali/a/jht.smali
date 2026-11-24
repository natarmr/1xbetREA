.class public final La/jht;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/nr;

.field public final synthetic k:La/xgt;

.field public final synthetic l:J

.field public final synthetic m:I

.field public final synthetic n:J

.field public final synthetic o:I


# direct methods
.method public constructor <init>(La/nr;La/xgt;JIJILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jht;->j:La/nr;

    .line 2
    .line 3
    iput-object p2, p0, La/jht;->k:La/xgt;

    .line 4
    .line 5
    iput-wide p3, p0, La/jht;->l:J

    .line 6
    .line 7
    iput p5, p0, La/jht;->m:I

    .line 8
    .line 9
    iput-wide p6, p0, La/jht;->n:J

    .line 10
    .line 11
    iput p8, p0, La/jht;->o:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/jht;

    .line 2
    .line 3
    iget-wide v6, p0, La/jht;->n:J

    .line 4
    .line 5
    iget v8, p0, La/jht;->o:I

    .line 6
    .line 7
    iget-object v1, p0, La/jht;->j:La/nr;

    .line 8
    .line 9
    iget-object v2, p0, La/jht;->k:La/xgt;

    .line 10
    .line 11
    iget-wide v3, p0, La/jht;->l:J

    .line 12
    .line 13
    iget v5, p0, La/jht;->m:I

    .line 14
    .line 15
    move-object v9, p2

    .line 16
    invoke-direct/range {v0 .. v9}, La/jht;-><init>(La/nr;La/xgt;JIJILa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/jht;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/jht;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/jht;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/jht;->j:La/nr;

    .line 4
    .line 5
    iget-object v2, v1, La/nr;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v4, v0, La/jht;->i:Z

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v5, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, v1, La/nr;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, La/a1d;

    .line 35
    .line 36
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v14

    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v2, v0, La/jht;->k:La/xgt;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v12, v2, La/xgt;->d:Ljava/util/ArrayList;

    .line 49
    .line 50
    iget-object v11, v2, La/xgt;->c:Ljava/util/ArrayList;

    .line 51
    .line 52
    iget-object v4, v2, La/xgt;->e:Ljava/util/List;

    .line 53
    .line 54
    iget v6, v2, La/xgt;->b:I

    .line 55
    .line 56
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-wide v7, v0, La/jht;->l:J

    .line 61
    .line 62
    iget v9, v0, La/jht;->m:I

    .line 63
    .line 64
    move/from16 v23, v5

    .line 65
    .line 66
    move v10, v6

    .line 67
    iget-wide v5, v0, La/jht;->n:J

    .line 68
    .line 69
    iget v13, v0, La/jht;->o:I

    .line 70
    .line 71
    if-nez v4, :cond_2

    .line 72
    .line 73
    move-wide/from16 v17, v7

    .line 74
    .line 75
    iget-wide v7, v2, La/xgt;->a:D

    .line 76
    .line 77
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    move-wide/from16 v20, v5

    .line 86
    .line 87
    iget-wide v4, v2, La/xgt;->f:D

    .line 88
    .line 89
    iget v6, v2, La/xgt;->g:I

    .line 90
    .line 91
    move/from16 v22, v13

    .line 92
    .line 93
    iget-object v13, v2, La/xgt;->e:Ljava/util/List;

    .line 94
    .line 95
    move-wide/from16 v18, v17

    .line 96
    .line 97
    move/from16 v17, v6

    .line 98
    .line 99
    new-instance v6, La/pht;

    .line 100
    .line 101
    move-wide v15, v4

    .line 102
    invoke-direct/range {v6 .. v22}, La/pht;-><init>(DILjava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;DIJJI)V

    .line 103
    .line 104
    .line 105
    :goto_0
    move/from16 v2, v23

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    move-wide/from16 v20, v5

    .line 109
    .line 110
    move-wide/from16 v17, v7

    .line 111
    .line 112
    move/from16 v22, v13

    .line 113
    .line 114
    const-wide/16 v4, 0x0

    .line 115
    .line 116
    cmp-long v4, v17, v4

    .line 117
    .line 118
    if-eqz v4, :cond_3

    .line 119
    .line 120
    iget-wide v7, v2, La/xgt;->a:D

    .line 121
    .line 122
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    move-object v13, v14

    .line 131
    iget-wide v14, v2, La/xgt;->f:D

    .line 132
    .line 133
    iget v2, v2, La/xgt;->g:I

    .line 134
    .line 135
    new-instance v6, La/mht;

    .line 136
    .line 137
    move/from16 v16, v2

    .line 138
    .line 139
    move-wide/from16 v19, v20

    .line 140
    .line 141
    move/from16 v21, v22

    .line 142
    .line 143
    invoke-direct/range {v6 .. v21}, La/mht;-><init>(DILjava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;DIJJI)V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_3
    new-instance v6, La/sht;

    .line 148
    .line 149
    iget-wide v4, v2, La/xgt;->a:D

    .line 150
    .line 151
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    iget-wide v4, v2, La/xgt;->f:D

    .line 172
    .line 173
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    iget v2, v2, La/xgt;->g:I

    .line 178
    .line 179
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v16

    .line 187
    move-object v10, v11

    .line 188
    move-object v11, v12

    .line 189
    move-object v12, v14

    .line 190
    move-object v14, v4

    .line 191
    invoke-direct/range {v6 .. v16}, La/sht;-><init>(Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 192
    .line 193
    .line 194
    goto :goto_0

    .line 195
    :goto_1
    iput-boolean v2, v0, La/jht;->i:Z

    .line 196
    .line 197
    iget-object v1, v1, La/a1d;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v1, La/wgn;

    .line 200
    .line 201
    invoke-virtual {v1}, La/wgn;->invoke()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, La/wgt;

    .line 206
    .line 207
    invoke-interface {v1, v6, v0}, La/wgt;->b(La/muw;La/yje;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-ne v0, v3, :cond_4

    .line 212
    .line 213
    return-object v3

    .line 214
    :cond_4
    return-object v0
.end method
