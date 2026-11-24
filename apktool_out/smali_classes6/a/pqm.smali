.class public final La/pqm;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/rwh0;

.field public final synthetic j:La/vne;

.field public final synthetic k:La/t33;

.field public final synthetic l:La/t33;

.field public final synthetic m:I

.field public final synthetic n:Lkotlin/jvm/functions/Function0;

.field public final synthetic o:Lkotlin/jvm/functions/Function0;

.field public final synthetic p:La/pz40;

.field public final synthetic q:La/agk0;

.field public final synthetic r:La/agk0;


# direct methods
.method public constructor <init>(La/rwh0;La/vne;La/t33;La/t33;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/pz40;La/agk0;La/agk0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pqm;->i:La/rwh0;

    .line 2
    .line 3
    iput-object p2, p0, La/pqm;->j:La/vne;

    .line 4
    .line 5
    iput-object p3, p0, La/pqm;->k:La/t33;

    .line 6
    .line 7
    iput-object p4, p0, La/pqm;->l:La/t33;

    .line 8
    .line 9
    iput p5, p0, La/pqm;->m:I

    .line 10
    .line 11
    iput-object p6, p0, La/pqm;->n:Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    iput-object p7, p0, La/pqm;->o:Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    iput-object p8, p0, La/pqm;->p:La/pz40;

    .line 16
    .line 17
    iput-object p9, p0, La/pqm;->q:La/agk0;

    .line 18
    .line 19
    iput-object p10, p0, La/pqm;->r:La/agk0;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p11}, La/bnn0;-><init>(ILa/yje;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    new-instance v0, La/pqm;

    .line 2
    .line 3
    iget-object v9, p0, La/pqm;->q:La/agk0;

    .line 4
    .line 5
    iget-object v10, p0, La/pqm;->r:La/agk0;

    .line 6
    .line 7
    iget-object v1, p0, La/pqm;->i:La/rwh0;

    .line 8
    .line 9
    iget-object v2, p0, La/pqm;->j:La/vne;

    .line 10
    .line 11
    iget-object v3, p0, La/pqm;->k:La/t33;

    .line 12
    .line 13
    iget-object v4, p0, La/pqm;->l:La/t33;

    .line 14
    .line 15
    iget v5, p0, La/pqm;->m:I

    .line 16
    .line 17
    iget-object v6, p0, La/pqm;->n:Lkotlin/jvm/functions/Function0;

    .line 18
    .line 19
    iget-object v7, p0, La/pqm;->o:Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    iget-object v8, p0, La/pqm;->p:La/pz40;

    .line 22
    .line 23
    move-object v11, p2

    .line 24
    invoke-direct/range {v0 .. v11}, La/pqm;-><init>(La/rwh0;La/vne;La/t33;La/t33;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/pz40;La/agk0;La/agk0;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/pqm;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/pqm;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/pqm;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/pqm;->p:La/pz40;

    .line 9
    .line 10
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, La/bby;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v2, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    new-instance v6, La/mr0;

    .line 23
    .line 24
    const/16 v13, 0x9

    .line 25
    .line 26
    iget-object v5, v0, La/pqm;->l:La/t33;

    .line 27
    .line 28
    iget-object v4, v0, La/pqm;->k:La/t33;

    .line 29
    .line 30
    iget-object v11, v0, La/pqm;->q:La/agk0;

    .line 31
    .line 32
    iget-object v12, v0, La/pqm;->r:La/agk0;

    .line 33
    .line 34
    move-object v10, v4

    .line 35
    move-object v9, v5

    .line 36
    move-object v8, v6

    .line 37
    invoke-direct/range {v8 .. v13}, La/mr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    iget-object v2, v0, La/pqm;->i:La/rwh0;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v15, 0x3

    .line 47
    iget-object v3, v0, La/pqm;->j:La/vne;

    .line 48
    .line 49
    if-eqz v2, :cond_5

    .line 50
    .line 51
    const/4 v8, 0x1

    .line 52
    if-eq v2, v8, :cond_4

    .line 53
    .line 54
    const/4 v8, 0x2

    .line 55
    if-eq v2, v8, :cond_3

    .line 56
    .line 57
    if-eq v2, v15, :cond_2

    .line 58
    .line 59
    const/4 v8, 0x4

    .line 60
    if-ne v2, v8, :cond_1

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v11, v0, La/pqm;->o:Lkotlin/jvm/functions/Function0;

    .line 72
    .line 73
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v8, La/pnd0;

    .line 77
    .line 78
    const/4 v13, 0x0

    .line 79
    const/16 v14, 0xa

    .line 80
    .line 81
    move-object v9, v4

    .line 82
    move-object v10, v5

    .line 83
    move-object v12, v6

    .line 84
    invoke-direct/range {v8 .. v14}, La/pnd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v3, v7, v7, v8, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 93
    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    return-object v0

    .line 97
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-object v0, v3

    .line 107
    new-instance v3, La/xvh0;

    .line 108
    .line 109
    const/4 v8, 0x0

    .line 110
    move-object v2, v0

    .line 111
    invoke-direct/range {v3 .. v8}, La/xvh0;-><init>(La/t33;La/t33;La/mr0;La/yje;B)V

    .line 112
    .line 113
    .line 114
    invoke-static {v2, v7, v7, v3, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    goto :goto_0

    .line 119
    :cond_3
    move-object v2, v3

    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v3, La/xvh0;

    .line 130
    .line 131
    const/4 v8, 0x2

    .line 132
    invoke-direct/range {v3 .. v8}, La/xvh0;-><init>(La/t33;La/t33;La/mr0;La/yje;B)V

    .line 133
    .line 134
    .line 135
    invoke-static {v2, v7, v7, v3, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    goto :goto_0

    .line 140
    :cond_4
    move-object v2, v3

    .line 141
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance v3, La/xvh0;

    .line 151
    .line 152
    const/4 v8, 0x1

    .line 153
    invoke-direct/range {v3 .. v8}, La/xvh0;-><init>(La/t33;La/t33;La/mr0;La/yje;B)V

    .line 154
    .line 155
    .line 156
    invoke-static {v2, v7, v7, v3, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_0

    .line 161
    :cond_5
    move-object v2, v3

    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget-object v12, v0, La/pqm;->n:Lkotlin/jvm/functions/Function0;

    .line 172
    .line 173
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v8, La/iq3;

    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    iget v11, v0, La/pqm;->m:I

    .line 180
    .line 181
    move-object v9, v4

    .line 182
    move-object v10, v5

    .line 183
    move-object v13, v6

    .line 184
    invoke-direct/range {v8 .. v14}, La/iq3;-><init>(La/t33;La/t33;ILkotlin/jvm/functions/Function0;La/mr0;La/yje;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v2, v7, v7, v8, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :goto_0
    invoke-interface {v1, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object v0
.end method
