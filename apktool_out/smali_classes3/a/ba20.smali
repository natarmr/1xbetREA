.class public final La/ba20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/dgu;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:La/jg7;

.field public final synthetic n:J

.field public final synthetic o:J

.field public final synthetic p:D

.field public final synthetic q:B

.field public final synthetic r:B


# direct methods
.method public constructor <init>(La/dgu;Ljava/lang/String;Ljava/util/List;La/jg7;JJDIJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ba20;->j:La/dgu;

    .line 2
    .line 3
    iput-object p2, p0, La/ba20;->k:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, La/ba20;->l:Ljava/util/List;

    .line 6
    .line 7
    iput-object p4, p0, La/ba20;->m:La/jg7;

    .line 8
    .line 9
    iput-wide p5, p0, La/ba20;->n:J

    .line 10
    .line 11
    iput-wide p7, p0, La/ba20;->o:J

    .line 12
    .line 13
    iput-wide p9, p0, La/ba20;->p:D

    .line 14
    .line 15
    iput-byte p11, p0, La/ba20;->q:B

    .line 16
    .line 17
    long-to-int p1, p12

    .line 18
    iput-byte p1, p0, La/ba20;->r:B

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    invoke-direct {p0, p1, p14}, La/bnn0;-><init>(ILa/yje;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 15

    .line 1
    new-instance v0, La/ba20;

    .line 2
    .line 3
    iget-byte v1, p0, La/ba20;->r:B

    .line 4
    .line 5
    int-to-long v12, v1

    .line 6
    iget-object v1, p0, La/ba20;->j:La/dgu;

    .line 7
    .line 8
    iget-object v2, p0, La/ba20;->k:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v3, p0, La/ba20;->l:Ljava/util/List;

    .line 11
    .line 12
    iget-object v4, p0, La/ba20;->m:La/jg7;

    .line 13
    .line 14
    iget-wide v5, p0, La/ba20;->n:J

    .line 15
    .line 16
    iget-wide v7, p0, La/ba20;->o:J

    .line 17
    .line 18
    iget-wide v9, p0, La/ba20;->p:D

    .line 19
    .line 20
    iget-byte v11, p0, La/ba20;->q:B

    .line 21
    .line 22
    move-object/from16 v14, p2

    .line 23
    .line 24
    invoke-direct/range {v0 .. v14}, La/ba20;-><init>(La/dgu;Ljava/lang/String;Ljava/util/List;La/jg7;JJDIJLa/yje;)V

    .line 25
    .line 26
    .line 27
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
    invoke-virtual {p0, p1, p2}, La/ba20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ba20;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ba20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/ba20;->j:La/dgu;

    .line 4
    .line 5
    iget-object v2, v1, La/dgu;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v4, v0, La/ba20;->i:Z

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
    move-object/from16 v0, p1

    .line 22
    .line 23
    goto/16 :goto_1

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
    const/4 v0, 0x0

    .line 31
    return-object v0

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v4, v1, La/dgu;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, La/dq00;

    .line 38
    .line 39
    iget-object v1, v1, La/dgu;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, La/btt0;

    .line 42
    .line 43
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v2}, La/knf0;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v16

    .line 55
    iget-object v6, v0, La/ba20;->k:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v6}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v2, Ljava/util/ArrayList;

    .line 68
    .line 69
    const/16 v6, 0xa

    .line 70
    .line 71
    iget-object v7, v0, La/ba20;->l:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v7, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_2

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, La/d9a0;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v8, La/j9a0;

    .line 100
    .line 101
    iget v9, v7, La/d9a0;->a:I

    .line 102
    .line 103
    iget-object v10, v7, La/d9a0;->d:Ljava/lang/String;

    .line 104
    .line 105
    iget v7, v7, La/d9a0;->f:I

    .line 106
    .line 107
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-direct {v8, v9, v10, v7}, La/j9a0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    new-instance v6, La/iv6;

    .line 119
    .line 120
    iget-object v7, v0, La/ba20;->m:La/jg7;

    .line 121
    .line 122
    iget-wide v8, v7, La/jg7;->a:D

    .line 123
    .line 124
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    iget-wide v9, v7, La/jg7;->c:D

    .line 129
    .line 130
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    iget-wide v13, v7, La/jg7;->e:J

    .line 135
    .line 136
    invoke-direct {v6, v8, v9, v13, v14}, La/iv6;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 137
    .line 138
    .line 139
    invoke-static {v6}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v20

    .line 143
    new-instance v6, La/fj30;

    .line 144
    .line 145
    iget-byte v7, v0, La/ba20;->r:B

    .line 146
    .line 147
    int-to-long v7, v7

    .line 148
    move-wide/from16 v17, v7

    .line 149
    .line 150
    iget-wide v7, v0, La/ba20;->n:J

    .line 151
    .line 152
    iget-wide v9, v0, La/ba20;->o:J

    .line 153
    .line 154
    iget-wide v13, v0, La/ba20;->p:D

    .line 155
    .line 156
    iget-byte v15, v0, La/ba20;->q:B

    .line 157
    .line 158
    move-object/from16 v19, v2

    .line 159
    .line 160
    invoke-direct/range {v6 .. v20}, La/fj30;-><init>(JJLjava/lang/String;Ljava/lang/String;DILjava/lang/String;JLjava/util/ArrayList;Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    iput-boolean v5, v0, La/ba20;->i:Z

    .line 164
    .line 165
    iget-object v2, v4, La/dq00;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v2, La/rx00;

    .line 168
    .line 169
    invoke-virtual {v2}, La/rx00;->invoke()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, La/n520;

    .line 174
    .line 175
    invoke-interface {v2, v1, v6, v0}, La/n520;->a(Ljava/lang/String;La/fj30;La/yje;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v3, :cond_3

    .line 180
    .line 181
    return-object v3

    .line 182
    :cond_3
    :goto_1
    check-cast v0, La/q16;

    .line 183
    .line 184
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0
.end method
