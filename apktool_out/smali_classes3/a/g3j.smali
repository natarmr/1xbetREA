.class public final La/g3j;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final synthetic h:B

.field public final i:La/oeg0;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;

.field public final q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/hcp0;La/iqt;La/ivn;La/s31;La/je;La/hzg;La/oeg0;La/ih5;La/zr1;)V
    .locals 2

    const/4 v0, 0x1

    iput-byte v0, p0, La/g3j;->h:B

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    new-instance v0, La/o9s;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, La/o9s;-><init>(B)V

    .line 40
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 41
    iput-object p1, p0, La/g3j;->j:Ljava/lang/Object;

    .line 42
    iput-object p2, p0, La/g3j;->k:Ljava/lang/Object;

    .line 43
    iput-object p3, p0, La/g3j;->l:Ljava/lang/Object;

    .line 44
    iput-object p4, p0, La/g3j;->m:Ljava/lang/Object;

    .line 45
    iput-object p5, p0, La/g3j;->n:Ljava/lang/Object;

    .line 46
    iput-object p6, p0, La/g3j;->o:Ljava/lang/Object;

    .line 47
    iput-object p7, p0, La/g3j;->i:La/oeg0;

    .line 48
    iput-object p8, p0, La/g3j;->p:Ljava/lang/Object;

    .line 49
    iput-object p9, p0, La/g3j;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/rl1;La/ctf0;La/kd30;La/q5j;La/crt;La/oeg0;La/peg0;La/b4j;La/je;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/g3j;->h:B

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, La/bmh;

    .line 11
    .line 12
    const/16 v1, 0x13

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/bmh;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/g3j;->j:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p2, p0, La/g3j;->k:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p3, p0, La/g3j;->l:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p4, p0, La/g3j;->m:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object p5, p0, La/g3j;->n:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object p6, p0, La/g3j;->i:La/oeg0;

    .line 31
    .line 32
    iput-object p7, p0, La/g3j;->o:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object p8, p0, La/g3j;->p:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object p9, p0, La/g3j;->q:Ljava/lang/Object;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/g3j;->h:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ims;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/g3j;->k(La/ims;La/zje;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p1, La/s2j;

    .line 14
    .line 15
    iget-object p2, p0, La/g3j;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, La/je;

    .line 18
    .line 19
    iget-object v0, p0, La/g3j;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/b4j;

    .line 22
    .line 23
    instance-of v1, p1, La/o2j;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    check-cast p1, La/o2j;

    .line 28
    .line 29
    iget-object v1, p1, La/o2j;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget-wide v2, p1, La/o2j;->b:J

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/b4j;->d(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v1}, La/je;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/g3j;->n:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, La/crt;

    .line 42
    .line 43
    sget-object p1, La/wuo0;->c:La/wuo0;

    .line 44
    .line 45
    invoke-virtual {p1}, La/wuo0;->getId()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0, p1, v2, v3}, La/crt;->b(IJ)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    sget-object p1, La/wne;->a:La/wne;

    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_0
    instance-of v1, p1, La/r2j;

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    iget-object v3, p0, La/g3j;->i:La/oeg0;

    .line 62
    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    check-cast p1, La/r2j;

    .line 66
    .line 67
    iget-object v1, p1, La/r2j;->a:Ljava/lang/String;

    .line 68
    .line 69
    iget-object p1, p1, La/r2j;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1, p1}, La/b4j;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v1, p1}, La/je;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, La/oeg0;->c()La/i1w0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance p2, La/e3j;

    .line 82
    .line 83
    invoke-direct {p2, p0, v2}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    instance-of v1, p1, La/p2j;

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    check-cast p1, La/p2j;

    .line 96
    .line 97
    iget-object v1, p1, La/p2j;->a:Ljava/lang/String;

    .line 98
    .line 99
    iget v5, p1, La/p2j;->b:I

    .line 100
    .line 101
    iget-wide v6, p1, La/p2j;->c:J

    .line 102
    .line 103
    invoke-virtual {v0, v5, v1}, La/b4j;->e(ILjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, v5, v1}, La/je;->c(ILjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, La/hm1;

    .line 110
    .line 111
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-static {p2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-direct {p1, v2, v4, p2}, La/hm1;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, La/oeg0;->c()La/i1w0;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-static {p2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v1, La/vef;

    .line 131
    .line 132
    const/16 v2, 0x13

    .line 133
    .line 134
    invoke-direct {v1, p0, p1, v2}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    new-instance p0, La/a1w0;

    .line 138
    .line 139
    invoke-direct {p0, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 140
    .line 141
    .line 142
    new-instance p1, La/c8d;

    .line 143
    .line 144
    sget-object v1, La/y7d;->a:La/v7d;

    .line 145
    .line 146
    invoke-direct {p1, v1, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 147
    .line 148
    .line 149
    const/4 p0, 0x0

    .line 150
    invoke-static {v0, p1, p2, v0, p0}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    :goto_0
    move-object p1, p0

    .line 155
    check-cast p1, La/paw;

    .line 156
    .line 157
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_2

    .line 162
    .line 163
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, La/oe50;

    .line 168
    .line 169
    invoke-virtual {p2, p1}, La/i1w0;->a(La/oe50;)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_2
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_3
    sget-object p2, La/q2j;->a:La/q2j;

    .line 177
    .line 178
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-eqz p1, :cond_6

    .line 183
    .line 184
    iget-object p0, p0, La/g3j;->l:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p0, La/kd30;

    .line 187
    .line 188
    invoke-virtual {p0}, La/kd30;->N()Lkotlin/Unit;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    sget-object p1, La/wne;->a:La/wne;

    .line 193
    .line 194
    if-ne p0, p1, :cond_4

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    :goto_2
    if-ne p0, p1, :cond_5

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 206
    .line 207
    .line 208
    move-object p0, v4

    .line 209
    :goto_3
    return-object p0

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(La/jms;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/ya30;

    .line 6
    .line 7
    iget-wide v2, v0, La/ya30;->c:J

    .line 8
    .line 9
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/ya30;

    .line 14
    .line 15
    iget-boolean v4, v0, La/ya30;->a:Z

    .line 16
    .line 17
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/ya30;

    .line 22
    .line 23
    iget-wide v5, v0, La/ya30;->g:J

    .line 24
    .line 25
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/ya30;

    .line 30
    .line 31
    iget-wide v7, v0, La/ya30;->h:J

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    move-object v9, p1

    .line 35
    invoke-virtual/range {v1 .. v9}, La/g3j;->n(JZJJLa/jms;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object p1, La/wne;->a:La/wne;

    .line 40
    .line 41
    if-ne p0, p1, :cond_0

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0
.end method

.method public j(La/jms;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/ya30;

    .line 6
    .line 7
    iget-wide v2, v0, La/ya30;->d:J

    .line 8
    .line 9
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/ya30;

    .line 14
    .line 15
    iget-boolean v4, v0, La/ya30;->b:Z

    .line 16
    .line 17
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/ya30;

    .line 22
    .line 23
    iget-wide v5, v0, La/ya30;->g:J

    .line 24
    .line 25
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/ya30;

    .line 30
    .line 31
    iget-wide v7, v0, La/ya30;->h:J

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    move-object v9, p1

    .line 35
    invoke-virtual/range {v1 .. v9}, La/g3j;->n(JZJJLa/jms;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object p1, La/wne;->a:La/wne;

    .line 40
    .line 41
    if-ne p0, p1, :cond_0

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0
.end method

.method public k(La/ims;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/jms;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/jms;

    .line 13
    .line 14
    iget v4, v3, La/jms;->l:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/jms;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/jms;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/jms;-><init>(La/g3j;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/jms;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/jms;->l:I

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    if-eqz v5, :cond_5

    .line 43
    .line 44
    if-eq v5, v9, :cond_4

    .line 45
    .line 46
    if-eq v5, v8, :cond_3

    .line 47
    .line 48
    if-eq v5, v7, :cond_2

    .line 49
    .line 50
    if-ne v5, v6, :cond_1

    .line 51
    .line 52
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v10

    .line 63
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    iget-object v1, v3, La/jms;->i:La/ims;

    .line 72
    .line 73
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, v3, La/jms;->i:La/ims;

    .line 81
    .line 82
    iput v9, v3, La/jms;->l:I

    .line 83
    .line 84
    invoke-static {v0, v1, v3}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-ne v2, v4, :cond_6

    .line 89
    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :cond_6
    :goto_1
    if-eqz v1, :cond_17

    .line 93
    .line 94
    instance-of v2, v1, La/cms;

    .line 95
    .line 96
    if-eqz v2, :cond_8

    .line 97
    .line 98
    iput-object v10, v3, La/jms;->i:La/ims;

    .line 99
    .line 100
    iput v8, v3, La/jms;->l:I

    .line 101
    .line 102
    invoke-virtual {v0, v3}, La/g3j;->i(La/jms;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v4, :cond_7

    .line 107
    .line 108
    goto/16 :goto_6

    .line 109
    .line 110
    :cond_7
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_8
    instance-of v2, v1, La/fms;

    .line 114
    .line 115
    if-eqz v2, :cond_a

    .line 116
    .line 117
    iput-object v10, v3, La/jms;->i:La/ims;

    .line 118
    .line 119
    iput v7, v3, La/jms;->l:I

    .line 120
    .line 121
    invoke-virtual {v0, v3}, La/g3j;->j(La/jms;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v4, :cond_9

    .line 126
    .line 127
    goto/16 :goto_6

    .line 128
    .line 129
    :cond_9
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_a
    instance-of v2, v1, La/ems;

    .line 133
    .line 134
    if-eqz v2, :cond_d

    .line 135
    .line 136
    move-object v12, v1

    .line 137
    check-cast v12, La/ems;

    .line 138
    .line 139
    iget-object v1, v12, La/ems;->d:La/m9s;

    .line 140
    .line 141
    iget-object v2, v1, La/m9s;->c:Ljava/util/List;

    .line 142
    .line 143
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Ljava/lang/Long;

    .line 148
    .line 149
    const-wide/16 v3, 0x0

    .line 150
    .line 151
    if-eqz v2, :cond_b

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 154
    .line 155
    .line 156
    move-result-wide v5

    .line 157
    move-wide v13, v5

    .line 158
    goto :goto_4

    .line 159
    :cond_b
    move-wide v13, v3

    .line 160
    :goto_4
    iget-object v1, v1, La/m9s;->d:Ljava/util/List;

    .line 161
    .line 162
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Ljava/lang/Long;

    .line 167
    .line 168
    if-eqz v1, :cond_c

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide v3

    .line 174
    :cond_c
    move-wide v15, v3

    .line 175
    new-instance v11, La/qp7;

    .line 176
    .line 177
    const/16 v17, 0x2

    .line 178
    .line 179
    invoke-direct/range {v11 .. v17}, La/qp7;-><init>(Ljava/lang/Object;JJB)V

    .line 180
    .line 181
    .line 182
    iget-object v0, v0, La/x2t0;->b:La/ocj;

    .line 183
    .line 184
    invoke-virtual {v0, v11}, La/ocj;->c(Lkotlin/jvm/functions/Function1;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_8

    .line 188
    .line 189
    :cond_d
    instance-of v2, v1, La/dms;

    .line 190
    .line 191
    if-eqz v2, :cond_e

    .line 192
    .line 193
    invoke-virtual {v0}, La/x2t0;->e()V

    .line 194
    .line 195
    .line 196
    goto/16 :goto_8

    .line 197
    .line 198
    :cond_e
    instance-of v2, v1, La/gms;

    .line 199
    .line 200
    if-eqz v2, :cond_14

    .line 201
    .line 202
    check-cast v1, La/gms;

    .line 203
    .line 204
    iget-wide v1, v1, La/gms;->a:J

    .line 205
    .line 206
    iput-object v10, v3, La/jms;->i:La/ims;

    .line 207
    .line 208
    iput v6, v3, La/jms;->l:I

    .line 209
    .line 210
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, La/ya30;

    .line 215
    .line 216
    iget-wide v5, v5, La/ya30;->c:J

    .line 217
    .line 218
    cmp-long v5, v1, v5

    .line 219
    .line 220
    if-nez v5, :cond_10

    .line 221
    .line 222
    invoke-virtual {v0, v3}, La/g3j;->i(La/jms;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-ne v0, v4, :cond_f

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_10
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    check-cast v5, La/ya30;

    .line 237
    .line 238
    iget-wide v5, v5, La/ya30;->d:J

    .line 239
    .line 240
    cmp-long v1, v1, v5

    .line 241
    .line 242
    if-nez v1, :cond_12

    .line 243
    .line 244
    invoke-virtual {v0, v3}, La/g3j;->j(La/jms;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-ne v0, v4, :cond_11

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    :goto_5
    if-ne v0, v4, :cond_13

    .line 257
    .line 258
    :goto_6
    return-object v4

    .line 259
    :cond_13
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :cond_14
    instance-of v2, v1, La/hms;

    .line 263
    .line 264
    if-eqz v2, :cond_17

    .line 265
    .line 266
    check-cast v1, La/hms;

    .line 267
    .line 268
    iget-wide v1, v1, La/hms;->a:J

    .line 269
    .line 270
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    check-cast v3, La/ya30;

    .line 275
    .line 276
    iget-wide v3, v3, La/ya30;->c:J

    .line 277
    .line 278
    cmp-long v3, v1, v3

    .line 279
    .line 280
    if-nez v3, :cond_15

    .line 281
    .line 282
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    check-cast v1, La/ya30;

    .line 287
    .line 288
    iget-object v5, v1, La/ya30;->e:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    check-cast v1, La/ya30;

    .line 295
    .line 296
    iget-wide v1, v1, La/ya30;->h:J

    .line 297
    .line 298
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    check-cast v3, La/ya30;

    .line 303
    .line 304
    iget-wide v3, v3, La/ya30;->c:J

    .line 305
    .line 306
    invoke-virtual/range {v0 .. v5}, La/g3j;->l(JJLjava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_15
    invoke-virtual/range {p0 .. p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    check-cast v0, La/ya30;

    .line 315
    .line 316
    iget-wide v3, v0, La/ya30;->d:J

    .line 317
    .line 318
    cmp-long v0, v1, v3

    .line 319
    .line 320
    if-nez v0, :cond_16

    .line 321
    .line 322
    invoke-virtual/range {p0 .. p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, La/ya30;

    .line 327
    .line 328
    iget-object v5, v0, La/ya30;->f:Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual/range {p0 .. p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, La/ya30;

    .line 335
    .line 336
    iget-wide v1, v0, La/ya30;->h:J

    .line 337
    .line 338
    invoke-virtual/range {p0 .. p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    check-cast v0, La/ya30;

    .line 343
    .line 344
    iget-wide v3, v0, La/ya30;->d:J

    .line 345
    .line 346
    move-object/from16 v0, p0

    .line 347
    .line 348
    invoke-virtual/range {v0 .. v5}, La/g3j;->l(JJLjava/lang/String;)V

    .line 349
    .line 350
    .line 351
    :cond_16
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 352
    .line 353
    return-object v0

    .line 354
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 355
    .line 356
    .line 357
    return-object v10
.end method

.method public l(JJLjava/lang/String;)V
    .locals 7

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [La/yxg;

    .line 3
    .line 4
    sget-object v1, La/ttg;->d:La/ttg;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, La/trg;->d:La/trg;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, La/oxg;->d:La/oxg;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, La/pug;->d:La/pug;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, La/yvg;->d:La/yvg;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 v2, 0xa

    .line 36
    .line 37
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, La/yxg;

    .line 59
    .line 60
    iget-wide v2, v2, La/yxg;->a:J

    .line 61
    .line 62
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget-object v0, p0, La/g3j;->p:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, La/ih5;

    .line 83
    .line 84
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, La/ya30;

    .line 89
    .line 90
    iget-boolean v1, v1, La/ya30;->i:Z

    .line 91
    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    sget-object v1, La/r1g;->n:La/r1g;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    sget-object v1, La/r1g;->o:La/r1g;

    .line 98
    .line 99
    :goto_1
    invoke-virtual {v0, v1, p1, p2}, La/ih5;->p(La/r1g;J)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, La/g3j;->q:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, La/zr1;

    .line 105
    .line 106
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, La/ya30;

    .line 111
    .line 112
    iget-boolean v1, v1, La/ya30;->i:Z

    .line 113
    .line 114
    if-eqz v1, :cond_2

    .line 115
    .line 116
    sget-object v1, La/r1g;->n:La/r1g;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    sget-object v1, La/r1g;->o:La/r1g;

    .line 120
    .line 121
    :goto_2
    iget-object v1, v1, La/r1g;->a:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v0, p1, p2, v1}, La/zr1;->z(JLjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget-object p0, p0, La/g3j;->o:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, La/hzg;

    .line 129
    .line 130
    sget-object v6, La/k1g;->b:La/k1g;

    .line 131
    .line 132
    move-object v0, p0

    .line 133
    check-cast v0, La/uzg;

    .line 134
    .line 135
    move-wide v1, p1

    .line 136
    move-wide v3, p3

    .line 137
    move-object v5, p5

    .line 138
    invoke-virtual/range {v0 .. v6}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 139
    .line 140
    .line 141
    :cond_3
    return-void
.end method

.method public m(JJJLa/zje;Z)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v1, v0, La/kms;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/kms;

    .line 9
    .line 10
    iget v2, v1, La/kms;->n:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/kms;->n:I

    .line 20
    .line 21
    :goto_0
    move-object v10, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, La/kms;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, La/kms;-><init>(La/g3j;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v10, La/kms;->l:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v1, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v10, La/kms;->n:I

    .line 34
    .line 35
    const/4 v11, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v11, :cond_1

    .line 39
    .line 40
    iget-wide v1, v10, La/kms;->j:J

    .line 41
    .line 42
    iget-wide v3, v10, La/kms;->i:J

    .line 43
    .line 44
    iget-boolean v5, v10, La/kms;->k:Z

    .line 45
    .line 46
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_3

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 63
    .line 64
    iget-object v0, p0, La/g3j;->j:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v2, v0

    .line 67
    check-cast v2, La/hcp0;

    .line 68
    .line 69
    move/from16 v5, p8

    .line 70
    .line 71
    iput-boolean v5, v10, La/kms;->k:Z

    .line 72
    .line 73
    move-wide/from16 v6, p3

    .line 74
    .line 75
    iput-wide v6, v10, La/kms;->i:J

    .line 76
    .line 77
    move-wide/from16 v8, p5

    .line 78
    .line 79
    iput-wide v8, v10, La/kms;->j:J

    .line 80
    .line 81
    iput v11, v10, La/kms;->n:I

    .line 82
    .line 83
    move-wide v3, p1

    .line 84
    invoke-virtual/range {v2 .. v10}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    if-ne v0, v1, :cond_3

    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_3
    move-wide/from16 v3, p3

    .line 92
    .line 93
    move-wide/from16 v1, p5

    .line 94
    .line 95
    move/from16 v5, p8

    .line 96
    .line 97
    :goto_2
    :try_start_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    sget-object v6, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    move-wide/from16 v3, p3

    .line 104
    .line 105
    move-wide/from16 v1, p5

    .line 106
    .line 107
    move/from16 v5, p8

    .line 108
    .line 109
    :goto_3
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 110
    .line 111
    new-instance v6, La/g0g0;

    .line 112
    .line 113
    invoke-direct {v6, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    move-object v0, v6

    .line 117
    :goto_4
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    iget-object v6, p0, La/g3j;->l:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v6, La/ivn;

    .line 126
    .line 127
    new-instance v7, La/g7p;

    .line 128
    .line 129
    const/16 v8, 0x18

    .line 130
    .line 131
    invoke-direct {v7, p0, v8}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6, v0, v7}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    const-wide/16 v6, 0x0

    .line 138
    .line 139
    cmp-long v0, v1, v6

    .line 140
    .line 141
    iget-object v6, p0, La/g3j;->m:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v6, La/s31;

    .line 144
    .line 145
    if-gtz v0, :cond_5

    .line 146
    .line 147
    invoke-virtual {v6, v5, v3, v4}, La/s31;->d(ZJ)V

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_5
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const-string v0, "on"

    .line 155
    .line 156
    const-string v7, "off"

    .line 157
    .line 158
    if-eqz v5, :cond_6

    .line 159
    .line 160
    move-object v8, v7

    .line 161
    goto :goto_5

    .line 162
    :cond_6
    move-object v8, v0

    .line 163
    :goto_5
    iget-object v6, v6, La/s31;->a:La/kt2;

    .line 164
    .line 165
    new-instance v9, Lkotlin/Pair;

    .line 166
    .line 167
    const-string v10, "action"

    .line 168
    .line 169
    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    new-instance v10, Lkotlin/Pair;

    .line 177
    .line 178
    const-string v12, "sport_id"

    .line 179
    .line 180
    invoke-direct {v10, v12, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    new-instance v12, Lkotlin/Pair;

    .line 188
    .line 189
    const-string v13, "sub_sport_id"

    .line 190
    .line 191
    invoke-direct {v12, v13, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    filled-new-array {v9, v10, v12}, [Lkotlin/Pair;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-static {v8}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    const-string v9, "team_favor_add"

    .line 203
    .line 204
    invoke-interface {v6, v9, v8}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 205
    .line 206
    .line 207
    iget-object p0, p0, La/g3j;->n:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast p0, La/je;

    .line 210
    .line 211
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    if-eqz v5, :cond_7

    .line 215
    .line 216
    move-object v0, v7

    .line 217
    :cond_7
    iget-object p0, p0, La/je;->a:La/s1p;

    .line 218
    .line 219
    new-instance v5, La/i1p;

    .line 220
    .line 221
    const/4 v6, 0x2

    .line 222
    invoke-direct {v5, v6, v3, v4}, La/i1p;-><init>(BJ)V

    .line 223
    .line 224
    .line 225
    new-instance v3, La/i1p;

    .line 226
    .line 227
    const/4 v4, 0x0

    .line 228
    invoke-direct {v3, v4, v1, v2}, La/i1p;-><init>(BJ)V

    .line 229
    .line 230
    .line 231
    new-instance v1, La/j1p;

    .line 232
    .line 233
    invoke-direct {v1, v0, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 234
    .line 235
    .line 236
    const/4 v0, 0x3

    .line 237
    new-array v0, v0, [La/k1p;

    .line 238
    .line 239
    aput-object v5, v0, v4

    .line 240
    .line 241
    aput-object v3, v0, v11

    .line 242
    .line 243
    aput-object v1, v0, v6

    .line 244
    .line 245
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    const-wide/16 v1, 0xc5b

    .line 250
    .line 251
    invoke-virtual {p0, v0, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 252
    .line 253
    .line 254
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object p0
.end method

.method public n(JZJJLa/jms;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/g3j;->k:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, La/iqt;

    .line 5
    .line 6
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 7
    .line 8
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    move-object v2, p0

    .line 15
    move-wide v3, p1

    .line 16
    move v10, p3

    .line 17
    move-wide v5, p4

    .line 18
    move-wide/from16 v7, p6

    .line 19
    .line 20
    move-object/from16 v9, p8

    .line 21
    .line 22
    invoke-virtual/range {v2 .. v10}, La/g3j;->m(JJJLa/zje;Z)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, La/wne;->a:La/wne;

    .line 27
    .line 28
    if-ne p0, p1, :cond_0

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    check-cast p3, La/ya30;

    .line 39
    .line 40
    iget-wide v3, p3, La/ya30;->c:J

    .line 41
    .line 42
    cmp-long p1, v3, p1

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move p1, p2

    .line 50
    :goto_0
    new-instance p3, La/va30;

    .line 51
    .line 52
    invoke-direct {p3, p1}, La/va30;-><init>(Z)V

    .line 53
    .line 54
    .line 55
    new-instance v3, La/wej;

    .line 56
    .line 57
    move-object v5, v0

    .line 58
    check-cast v5, La/iqt;

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const/16 v10, 0x13

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const-class v6, La/iqt;

    .line 65
    .line 66
    const-string v7, "invoke"

    .line 67
    .line 68
    const-string v8, "invoke()Z"

    .line 69
    .line 70
    invoke-direct/range {v3 .. v10}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p3, v3}, La/x2t0;->h(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, La/g3j;->i:La/oeg0;

    .line 77
    .line 78
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    new-instance p3, La/c8d;

    .line 87
    .line 88
    sget-object v0, La/y7d;->a:La/v7d;

    .line 89
    .line 90
    sget-object v1, La/n0w0;->a:La/n0w0;

    .line 91
    .line 92
    invoke-direct {p3, v0, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p1, p3}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    sget-object v0, La/wez;->b:La/wez;

    .line 100
    .line 101
    invoke-static {v0, p3, p0, p1, p2}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :goto_1
    move-object p2, p1

    .line 106
    check-cast p2, La/paw;

    .line 107
    .line 108
    invoke-virtual {p2}, La/paw;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    if-eqz p3, :cond_3

    .line 113
    .line 114
    invoke-virtual {p2}, La/paw;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    check-cast p2, La/oe50;

    .line 119
    .line 120
    invoke-virtual {p0, p2}, La/i1w0;->a(La/oe50;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0
.end method
