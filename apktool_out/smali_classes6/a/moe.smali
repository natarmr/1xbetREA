.class public final La/moe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:I

.field public j:I

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lkotlin/jvm/functions/Function2;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:I

.field public final synthetic q:Lkotlin/jvm/functions/Function0;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/functions/Function0;Ljava/lang/String;JLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/moe;->m:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    iput-object p2, p0, La/moe;->n:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, La/moe;->o:Ljava/util/List;

    .line 6
    .line 7
    iput p4, p0, La/moe;->p:I

    .line 8
    .line 9
    iput-object p5, p0, La/moe;->q:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    iput-object p6, p0, La/moe;->r:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide p7, p0, La/moe;->s:J

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/moe;

    .line 2
    .line 3
    iget-object v6, p0, La/moe;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v7, p0, La/moe;->s:J

    .line 6
    .line 7
    iget-object v1, p0, La/moe;->m:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iget-object v2, p0, La/moe;->n:Ljava/util/List;

    .line 10
    .line 11
    iget-object v3, p0, La/moe;->o:Ljava/util/List;

    .line 12
    .line 13
    iget v4, p0, La/moe;->p:I

    .line 14
    .line 15
    iget-object v5, p0, La/moe;->q:Lkotlin/jvm/functions/Function0;

    .line 16
    .line 17
    move-object v9, p2

    .line 18
    invoke-direct/range {v0 .. v9}, La/moe;-><init>(Lkotlin/jvm/functions/Function2;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/functions/Function0;Ljava/lang/String;JLa/yje;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/moe;->l:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/moe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/moe;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/moe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/moe;->l:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, La/vne;

    .line 5
    .line 6
    sget-object v2, La/wne;->a:La/wne;

    .line 7
    .line 8
    iget-byte v0, p0, La/moe;->k:B

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-eq v0, v5, :cond_1

    .line 17
    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    iget v0, p0, La/moe;->j:I

    .line 21
    .line 22
    iget v7, p0, La/moe;->i:I

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :cond_1
    iget v0, p0, La/moe;->j:I

    .line 36
    .line 37
    iget v7, p0, La/moe;->i:I

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :catch_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    move v0, v7

    .line 47
    move-object v7, v1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move v7, v6

    .line 53
    :cond_3
    :try_start_1
    iget-object p1, p0, La/moe;->m:Lkotlin/jvm/functions/Function2;

    .line 54
    .line 55
    iput-object v1, p0, La/moe;->l:Ljava/lang/Object;

    .line 56
    .line 57
    iput v7, p0, La/moe;->i:I

    .line 58
    .line 59
    iput v6, p0, La/moe;->j:I

    .line 60
    .line 61
    iput-byte v5, p0, La/moe;->k:B

    .line 62
    .line 63
    invoke-interface {p1, v1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    if-ne p1, v2, :cond_4

    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :cond_4
    move v0, v6

    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :goto_0
    iget-object v1, p0, La/moe;->n:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_6

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    move-object v9, v8

    .line 91
    check-cast v9, Ljava/lang/Class;

    .line 92
    .line 93
    invoke-virtual {v9, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-eqz v9, :cond_5

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_6
    move-object v8, v4

    .line 101
    :goto_1
    check-cast v8, Ljava/lang/Class;

    .line 102
    .line 103
    if-eqz v8, :cond_7

    .line 104
    .line 105
    invoke-virtual {v8, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    goto :goto_2

    .line 110
    :cond_7
    move v1, v6

    .line 111
    :goto_2
    instance-of v8, p1, La/zhi0;

    .line 112
    .line 113
    if-eqz v8, :cond_8

    .line 114
    .line 115
    move-object v8, p1

    .line 116
    check-cast v8, La/zhi0;

    .line 117
    .line 118
    iget v8, v8, La/zhi0;->a:I

    .line 119
    .line 120
    iget-object v9, p0, La/moe;->o:Ljava/util/List;

    .line 121
    .line 122
    invoke-static {v8, v9}, La/rz4;->C(ILjava/util/List;)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    goto :goto_3

    .line 127
    :cond_8
    move v8, v6

    .line 128
    :goto_3
    add-int/lit8 v13, v0, 0x1

    .line 129
    .line 130
    iget v9, p0, La/moe;->p:I

    .line 131
    .line 132
    if-ge v0, v9, :cond_9

    .line 133
    .line 134
    if-nez v1, :cond_9

    .line 135
    .line 136
    if-nez v8, :cond_9

    .line 137
    .line 138
    move v0, v5

    .line 139
    goto :goto_4

    .line 140
    :cond_9
    move v0, v6

    .line 141
    :goto_4
    if-eqz v0, :cond_d

    .line 142
    .line 143
    iget-object p1, p0, La/moe;->q:Lkotlin/jvm/functions/Function0;

    .line 144
    .line 145
    if-eqz p1, :cond_a

    .line 146
    .line 147
    sget-object v1, La/tvk;->a:La/rwj;

    .line 148
    .line 149
    sget-object v10, La/ys10;->a:La/vs10;

    .line 150
    .line 151
    sget-object v8, La/ske;->e:La/ske;

    .line 152
    .line 153
    new-instance v11, La/wi1;

    .line 154
    .line 155
    invoke-direct {v11, v4, p1}, La/wi1;-><init>(La/yje;Lkotlin/jvm/functions/Function0;)V

    .line 156
    .line 157
    .line 158
    const/16 v12, 0xa

    .line 159
    .line 160
    const/4 v9, 0x0

    .line 161
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 162
    .line 163
    .line 164
    :cond_a
    const-string p1, " // "

    .line 165
    .line 166
    const-string v1, " retry // delay "

    .line 167
    .line 168
    const-string v8, "ALARM1 from "

    .line 169
    .line 170
    iget-object v9, p0, La/moe;->r:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v13, v8, v9, p1, v1}, La/kng0;->p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    const-string v1, " sec"

    .line 177
    .line 178
    iget-wide v8, p0, La/moe;->s:J

    .line 179
    .line 180
    invoke-static {v8, v9, v1, p1}, La/brm0;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 185
    .line 186
    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 190
    .line 191
    invoke-virtual {p1, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 192
    .line 193
    .line 194
    move-result-wide v8

    .line 195
    iput-object v7, p0, La/moe;->l:Ljava/lang/Object;

    .line 196
    .line 197
    iput v13, p0, La/moe;->i:I

    .line 198
    .line 199
    iput v0, p0, La/moe;->j:I

    .line 200
    .line 201
    iput-byte v3, p0, La/moe;->k:B

    .line 202
    .line 203
    invoke-static {v8, v9, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    if-ne p1, v2, :cond_b

    .line 208
    .line 209
    :goto_5
    return-object v2

    .line 210
    :cond_b
    move-object v1, v7

    .line 211
    move v7, v13

    .line 212
    :goto_6
    if-eqz v0, :cond_c

    .line 213
    .line 214
    invoke-static {v1}, La/d5c;->R(La/vne;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-nez p1, :cond_3

    .line 219
    .line 220
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object p0

    .line 223
    :cond_d
    throw p1
.end method
