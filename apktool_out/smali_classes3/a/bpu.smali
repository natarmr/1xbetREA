.class public final La/bpu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/kzj;

.field public j:La/jzj;

.field public k:La/toe;

.field public l:La/toe;

.field public m:J

.field public n:B

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:J

.field public final synthetic q:La/edu;


# direct methods
.method public constructor <init>(JLa/yje;La/edu;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/bpu;->p:J

    .line 2
    .line 3
    iput-object p4, p0, La/bpu;->q:La/edu;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    new-instance v0, La/bpu;

    .line 2
    .line 3
    iget-wide v1, p0, La/bpu;->p:J

    .line 4
    .line 5
    iget-object p0, p0, La/bpu;->q:La/edu;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2, p0}, La/bpu;-><init>(JLa/yje;La/edu;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/bpu;->o:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, La/bpu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/bpu;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/bpu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, La/bpu;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/bpu;->n:B

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v10, 0x0

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    if-eq v2, v5, :cond_2

    .line 16
    .line 17
    if-eq v2, v4, :cond_1

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, La/bpu;->l:La/toe;

    .line 22
    .line 23
    iget-object p0, p0, La/bpu;->k:La/toe;

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    iget-wide v4, p0, La/bpu;->m:J

    .line 38
    .line 39
    iget-object v0, p0, La/bpu;->k:La/toe;

    .line 40
    .line 41
    iget-object v2, p0, La/bpu;->j:La/jzj;

    .line 42
    .line 43
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v12, v2

    .line 47
    move-object v2, p1

    .line 48
    move-object p1, v0

    .line 49
    move-object v0, v12

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-wide v5, p0, La/bpu;->m:J

    .line 52
    .line 53
    iget-object v0, p0, La/bpu;->j:La/jzj;

    .line 54
    .line 55
    iget-object v2, p0, La/bpu;->i:La/kzj;

    .line 56
    .line 57
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const-wide/16 v6, 0x0

    .line 65
    .line 66
    iget-wide v8, p0, La/bpu;->p:J

    .line 67
    .line 68
    cmp-long p1, v8, v6

    .line 69
    .line 70
    iget-object v7, p0, La/bpu;->q:La/edu;

    .line 71
    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    iget-object p1, v7, La/edu;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, La/gst0;

    .line 77
    .line 78
    iget-object p1, p1, La/gst0;->a:La/rrt0;

    .line 79
    .line 80
    invoke-virtual {p1}, La/rrt0;->a()La/krt0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-wide v8, p1, La/krt0;->a:J

    .line 85
    .line 86
    :cond_4
    new-instance v6, La/zou;

    .line 87
    .line 88
    const/4 v11, 0x1

    .line 89
    invoke-direct/range {v6 .. v11}, La/zou;-><init>(La/edu;JLa/yje;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v10, v6, v3}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance v2, La/apu;

    .line 97
    .line 98
    invoke-direct {v2, v8, v9, v10, v7}, La/apu;-><init>(JLa/yje;La/edu;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v10, v2, v3}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    new-instance v6, La/zou;

    .line 106
    .line 107
    const/4 v11, 0x0

    .line 108
    invoke-direct/range {v6 .. v11}, La/zou;-><init>(La/edu;JLa/yje;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v10, v6, v3}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v10, p0, La/bpu;->o:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v2, p0, La/bpu;->i:La/kzj;

    .line 118
    .line 119
    iput-object v0, p0, La/bpu;->j:La/jzj;

    .line 120
    .line 121
    iput-wide v8, p0, La/bpu;->m:J

    .line 122
    .line 123
    iput-byte v5, p0, La/bpu;->n:B

    .line 124
    .line 125
    invoke-virtual {p1, p0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v1, :cond_5

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    move-wide v5, v8

    .line 133
    :goto_0
    check-cast p1, La/toe;

    .line 134
    .line 135
    iput-object v10, p0, La/bpu;->o:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v10, p0, La/bpu;->i:La/kzj;

    .line 138
    .line 139
    iput-object v0, p0, La/bpu;->j:La/jzj;

    .line 140
    .line 141
    iput-object p1, p0, La/bpu;->k:La/toe;

    .line 142
    .line 143
    iput-wide v5, p0, La/bpu;->m:J

    .line 144
    .line 145
    iput-byte v4, p0, La/bpu;->n:B

    .line 146
    .line 147
    invoke-interface {v2, p0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-ne v2, v1, :cond_6

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    move-wide v4, v5

    .line 155
    :goto_1
    check-cast v2, La/toe;

    .line 156
    .line 157
    iput-object v10, p0, La/bpu;->o:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v10, p0, La/bpu;->i:La/kzj;

    .line 160
    .line 161
    iput-object v10, p0, La/bpu;->j:La/jzj;

    .line 162
    .line 163
    iput-object p1, p0, La/bpu;->k:La/toe;

    .line 164
    .line 165
    iput-object v2, p0, La/bpu;->l:La/toe;

    .line 166
    .line 167
    iput-wide v4, p0, La/bpu;->m:J

    .line 168
    .line 169
    iput-byte v3, p0, La/bpu;->n:B

    .line 170
    .line 171
    invoke-interface {v0, p0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    if-ne p0, v1, :cond_7

    .line 176
    .line 177
    :goto_2
    return-object v1

    .line 178
    :cond_7
    move-object v0, p1

    .line 179
    move-object p1, p0

    .line 180
    move-object p0, v0

    .line 181
    move-object v0, v2

    .line 182
    :goto_3
    check-cast p1, La/hl;

    .line 183
    .line 184
    new-instance v1, La/dlc0;

    .line 185
    .line 186
    invoke-direct {v1, p0, v0, p1}, La/dlc0;-><init>(La/toe;La/toe;La/hl;)V

    .line 187
    .line 188
    .line 189
    return-object v1
.end method
