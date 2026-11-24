.class public final La/hnr;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:F

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/pz40;La/agk0;FLa/t33;La/pz40;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/hnr;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/hnr;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/hnr;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/hnr;->l:F

    .line 9
    .line 10
    iput-object p4, p0, La/hnr;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/hnr;->n:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/pvh0;La/oms0;FLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/hnr;->i:B

    .line 19
    iput-object p1, p0, La/hnr;->m:Ljava/lang/Object;

    iput-object p2, p0, La/hnr;->n:Ljava/lang/Object;

    iput-object p3, p0, La/hnr;->o:Ljava/lang/Object;

    iput-object p4, p0, La/hnr;->p:Ljava/lang/Object;

    iput p5, p0, La/hnr;->l:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/hnr;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/hnr;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/hnr;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/hnr;

    .line 11
    .line 12
    move-object v6, v2

    .line 13
    check-cast v6, La/pvh0;

    .line 14
    .line 15
    move-object v7, v1

    .line 16
    check-cast v7, La/oms0;

    .line 17
    .line 18
    iget v8, p0, La/hnr;->l:F

    .line 19
    .line 20
    iget-object v4, p0, La/hnr;->m:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v5, p0, La/hnr;->n:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v9, p2

    .line 25
    invoke-direct/range {v3 .. v9}, La/hnr;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/pvh0;La/oms0;FLa/yje;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v3, La/hnr;->k:Ljava/lang/Object;

    .line 29
    .line 30
    return-object v3

    .line 31
    :pswitch_0
    move-object v9, p2

    .line 32
    new-instance v4, La/hnr;

    .line 33
    .line 34
    iget-object p2, p0, La/hnr;->m:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, p2

    .line 37
    check-cast v5, La/pz40;

    .line 38
    .line 39
    move-object v6, v2

    .line 40
    check-cast v6, La/agk0;

    .line 41
    .line 42
    move-object v8, v1

    .line 43
    check-cast v8, La/t33;

    .line 44
    .line 45
    iget-object p2, p0, La/hnr;->n:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, La/pz40;

    .line 48
    .line 49
    iget v7, p0, La/hnr;->l:F

    .line 50
    .line 51
    move-object v10, v9

    .line 52
    move-object v9, p2

    .line 53
    invoke-direct/range {v4 .. v10}, La/hnr;-><init>(La/pz40;La/agk0;FLa/t33;La/pz40;La/yje;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, v4, La/hnr;->k:Ljava/lang/Object;

    .line 57
    .line 58
    return-object v4

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hnr;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/hnr;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hnr;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hnr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/hnr;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/hnr;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/hnr;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/hnr;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/hnr;->m:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/hnr;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/hnr;->n:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, La/hnr;->o:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v3, La/oms0;

    .line 19
    .line 20
    check-cast v5, La/pvh0;

    .line 21
    .line 22
    sget-object v0, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-boolean v8, p0, La/hnr;->j:Z

    .line 25
    .line 26
    if-eqz v8, :cond_1

    .line 27
    .line 28
    if-ne v8, v6, :cond_0

    .line 29
    .line 30
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La/hnr;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, La/vne;

    .line 44
    .line 45
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v5}, La/pvh0;->p1()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iput-object v7, v5, La/pvh0;->p:La/jvh0;

    .line 56
    .line 57
    iget-object v1, v5, La/pvh0;->d:La/pz40;

    .line 58
    .line 59
    check-cast v1, La/hgk0;

    .line 60
    .line 61
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    :goto_0
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget v4, p0, La/hnr;->l:F

    .line 79
    .line 80
    if-nez v1, :cond_4

    .line 81
    .line 82
    invoke-virtual {v3, v2}, La/oms0;->r(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const-wide/16 v8, 0x0

    .line 86
    .line 87
    invoke-virtual {v3, v8, v9}, La/oms0;->o(J)V

    .line 88
    .line 89
    .line 90
    iget-object v1, v5, La/pvh0;->c:La/pz40;

    .line 91
    .line 92
    check-cast v1, La/hgk0;

    .line 93
    .line 94
    invoke-virtual {v1, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v4}, La/oms0;->k(F)V

    .line 98
    .line 99
    .line 100
    :cond_4
    invoke-virtual {v5, v4}, La/pvh0;->u1(F)V

    .line 101
    .line 102
    .line 103
    iget-object v1, v5, La/pvh0;->o:La/vy40;

    .line 104
    .line 105
    invoke-virtual {v1}, La/vy40;->j()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    new-instance v1, La/yng0;

    .line 112
    .line 113
    const/4 v2, 0x7

    .line 114
    invoke-direct {v1, v5, v7, v2}, La/yng0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 115
    .line 116
    .line 117
    const/4 v2, 0x3

    .line 118
    invoke-static {p1, v7, v7, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    const-wide/high16 v1, -0x8000000000000000L

    .line 123
    .line 124
    iput-wide v1, v5, La/pvh0;->n:J

    .line 125
    .line 126
    :goto_1
    iput-boolean v6, p0, La/hnr;->j:Z

    .line 127
    .line 128
    invoke-virtual {v5, p0}, La/pvh0;->x1(La/zje;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-ne p0, v0, :cond_6

    .line 133
    .line 134
    move-object v7, v0

    .line 135
    goto :goto_3

    .line 136
    :cond_6
    :goto_2
    invoke-virtual {v5}, La/pvh0;->t1()V

    .line 137
    .line 138
    .line 139
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    :goto_3
    return-object v7

    .line 142
    :pswitch_0
    iget-object v0, p0, La/hnr;->k:Ljava/lang/Object;

    .line 143
    .line 144
    move-object v10, v0

    .line 145
    check-cast v10, La/vne;

    .line 146
    .line 147
    sget-object v0, La/wne;->a:La/wne;

    .line 148
    .line 149
    iget-boolean v8, p0, La/hnr;->j:Z

    .line 150
    .line 151
    if-eqz v8, :cond_8

    .line 152
    .line 153
    if-ne v8, v6, :cond_7

    .line 154
    .line 155
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    check-cast v2, La/pz40;

    .line 167
    .line 168
    move-object p1, v5

    .line 169
    check-cast p1, La/agk0;

    .line 170
    .line 171
    new-instance v1, La/gu7;

    .line 172
    .line 173
    invoke-direct {v1, v2, p1, v6}, La/gu7;-><init>(La/pz40;La/agk0;B)V

    .line 174
    .line 175
    .line 176
    invoke-static {v7, v1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance v8, La/gnr;

    .line 181
    .line 182
    move-object v11, v3

    .line 183
    check-cast v11, La/t33;

    .line 184
    .line 185
    move-object v12, v4

    .line 186
    check-cast v12, La/pz40;

    .line 187
    .line 188
    move-object v13, v5

    .line 189
    check-cast v13, La/agk0;

    .line 190
    .line 191
    iget v9, p0, La/hnr;->l:F

    .line 192
    .line 193
    invoke-direct/range {v8 .. v13}, La/gnr;-><init>(FLa/vne;La/t33;La/pz40;La/agk0;)V

    .line 194
    .line 195
    .line 196
    iput-object v7, p0, La/hnr;->k:Ljava/lang/Object;

    .line 197
    .line 198
    iput-boolean v6, p0, La/hnr;->j:Z

    .line 199
    .line 200
    invoke-virtual {p1, v8, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    if-ne p0, v0, :cond_9

    .line 205
    .line 206
    move-object v7, v0

    .line 207
    goto :goto_5

    .line 208
    :cond_9
    :goto_4
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    :goto_5
    return-object v7

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
