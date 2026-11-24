.class public final La/k7s;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:La/rv2;

.field public final synthetic m:Z

.field public final synthetic n:La/py20;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:La/pz40;


# direct methods
.method public constructor <init>(IILa/rv2;ZLa/py20;IILa/pz40;La/yje;)V
    .locals 0

    .line 1
    iput p1, p0, La/k7s;->j:I

    .line 2
    .line 3
    iput p2, p0, La/k7s;->k:I

    .line 4
    .line 5
    iput-object p3, p0, La/k7s;->l:La/rv2;

    .line 6
    .line 7
    iput-boolean p4, p0, La/k7s;->m:Z

    .line 8
    .line 9
    iput-object p5, p0, La/k7s;->n:La/py20;

    .line 10
    .line 11
    iput p6, p0, La/k7s;->o:I

    .line 12
    .line 13
    iput p7, p0, La/k7s;->p:I

    .line 14
    .line 15
    iput-object p8, p0, La/k7s;->q:La/pz40;

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/k7s;

    .line 2
    .line 3
    iget v7, p0, La/k7s;->p:I

    .line 4
    .line 5
    iget-object v8, p0, La/k7s;->q:La/pz40;

    .line 6
    .line 7
    iget v1, p0, La/k7s;->j:I

    .line 8
    .line 9
    iget v2, p0, La/k7s;->k:I

    .line 10
    .line 11
    iget-object v3, p0, La/k7s;->l:La/rv2;

    .line 12
    .line 13
    iget-boolean v4, p0, La/k7s;->m:Z

    .line 14
    .line 15
    iget-object v5, p0, La/k7s;->n:La/py20;

    .line 16
    .line 17
    iget v6, p0, La/k7s;->o:I

    .line 18
    .line 19
    move-object v9, p2

    .line 20
    invoke-direct/range {v0 .. v9}, La/k7s;-><init>(IILa/rv2;ZLa/py20;IILa/pz40;La/yje;)V

    .line 21
    .line 22
    .line 23
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
    invoke-virtual {p0, p1, p2}, La/k7s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/k7s;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/k7s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/k7s;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget p1, p0, La/k7s;->k:I

    .line 30
    .line 31
    iget v1, p0, La/k7s;->j:I

    .line 32
    .line 33
    sub-int p1, v1, p1

    .line 34
    .line 35
    int-to-float p1, p1

    .line 36
    const/4 v4, 0x0

    .line 37
    cmpg-float v5, p1, v4

    .line 38
    .line 39
    if-gez v5, :cond_3

    .line 40
    .line 41
    move p1, v4

    .line 42
    :cond_3
    new-instance v4, La/j7s;

    .line 43
    .line 44
    iget-boolean v5, p0, La/k7s;->m:Z

    .line 45
    .line 46
    iget v6, p0, La/k7s;->p:I

    .line 47
    .line 48
    invoke-direct {v4, v5, p1, v1, v6}, La/j7s;-><init>(ZFII)V

    .line 49
    .line 50
    .line 51
    new-instance p1, La/pel;

    .line 52
    .line 53
    invoke-direct {p1}, La/pel;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    new-instance v1, La/vtj;

    .line 60
    .line 61
    iget-object v4, p1, La/pel;->b:[F

    .line 62
    .line 63
    iget-object p1, p1, La/pel;->a:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    array-length v7, v4

    .line 70
    invoke-static {v6, v7}, La/nx3;->a(II)V

    .line 71
    .line 72
    .line 73
    const/4 v7, 0x0

    .line 74
    invoke-static {v4, v7, v6}, Ljava/util/Arrays;->copyOfRange([FII)[F

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-direct {v1, p1, v4}, La/vtj;-><init>(Ljava/util/List;[F)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, La/k7s;->l:La/rv2;

    .line 85
    .line 86
    iget-object v4, p1, La/rv2;->f:La/agk0;

    .line 87
    .line 88
    iget-object v6, p1, La/rv2;->e:La/zbk;

    .line 89
    .line 90
    invoke-virtual {v4}, La/agk0;->l()F

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-nez v4, :cond_4

    .line 99
    .line 100
    iget-object v4, p1, La/rv2;->f:La/agk0;

    .line 101
    .line 102
    invoke-virtual {v4}, La/agk0;->l()F

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    invoke-virtual {v1, v4}, La/vtj;->a(F)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-nez v4, :cond_5

    .line 111
    .line 112
    invoke-virtual {v6}, La/zbk;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    goto :goto_1

    .line 117
    :cond_4
    invoke-virtual {v6}, La/zbk;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    :cond_5
    :goto_1
    invoke-virtual {p1, v1, v4}, La/rv2;->i(La/vtj;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, La/k7s;->n:La/py20;

    .line 125
    .line 126
    if-nez v5, :cond_6

    .line 127
    .line 128
    sget-object v4, La/py20;->c:La/py20;

    .line 129
    .line 130
    if-ne v1, v4, :cond_6

    .line 131
    .line 132
    sget-object v1, La/py20;->b:La/py20;

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    iget v4, p0, La/k7s;->o:I

    .line 136
    .line 137
    if-lez v4, :cond_9

    .line 138
    .line 139
    :goto_2
    iget-object v4, p0, La/k7s;->q:La/pz40;

    .line 140
    .line 141
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    check-cast v5, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-nez v5, :cond_7

    .line 152
    .line 153
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-interface {v4, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iput-byte v3, p0, La/k7s;->i:B

    .line 159
    .line 160
    invoke-static {p1, v1, p0}, La/dv2;->f(La/rv2;Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-ne p0, v0, :cond_8

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_7
    iget-object v3, p1, La/rv2;->c:La/pz40;

    .line 168
    .line 169
    check-cast v3, La/hgk0;

    .line 170
    .line 171
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    if-eq v3, v1, :cond_8

    .line 176
    .line 177
    iput-byte v2, p0, La/k7s;->i:B

    .line 178
    .line 179
    invoke-static {p1, v1, p0}, La/dv2;->d(La/rv2;Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-ne p0, v0, :cond_8

    .line 184
    .line 185
    :goto_3
    return-object v0

    .line 186
    :cond_8
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0

    .line 189
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0
.end method
