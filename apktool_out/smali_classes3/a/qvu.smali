.class public final La/qvu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pmi;

.field public final b:La/sjl0;


# direct methods
.method public constructor <init>(La/pmi;La/sjl0;)V
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
    iput-object p1, p0, La/qvu;->a:La/pmi;

    .line 8
    .line 9
    iput-object p2, p0, La/qvu;->b:La/sjl0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, La/pvu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/pvu;

    .line 7
    .line 8
    iget v1, v0, La/pvu;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/pvu;->l:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/pvu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/pvu;-><init>(La/qvu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v7, La/pvu;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v9, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v0, v7, La/pvu;->l:I

    .line 32
    .line 33
    iget-object v1, p0, La/qvu;->b:La/sjl0;

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    const/4 v3, 0x3

    .line 37
    const/4 v4, 0x2

    .line 38
    const/4 v5, 0x1

    .line 39
    const/4 v6, 0x0

    .line 40
    if-eqz v0, :cond_5

    .line 41
    .line 42
    if-eq v0, v5, :cond_4

    .line 43
    .line 44
    if-eq v0, v4, :cond_3

    .line 45
    .line 46
    if-eq v0, v3, :cond_2

    .line 47
    .line 48
    if-ne v0, v2, :cond_1

    .line 49
    .line 50
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    check-cast p1, La/j0g0;

    .line 54
    .line 55
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    goto/16 :goto_9

    .line 58
    .line 59
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v6

    .line 65
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_3
    iget-object p0, v7, La/pvu;->i:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/qvu;

    .line 73
    .line 74
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    move-object p0, v0

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iput v5, v7, La/pvu;->l:I

    .line 89
    .line 90
    invoke-virtual {v1, v7}, La/sjl0;->d(La/zje;)Ljava/io/Serializable;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v9, :cond_6

    .line 95
    .line 96
    goto/16 :goto_8

    .line 97
    .line 98
    :cond_6
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_a

    .line 105
    .line 106
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 107
    .line 108
    iget-object p0, p0, La/qvu;->a:La/pmi;

    .line 109
    .line 110
    iput-object v6, v7, La/pvu;->i:Ljava/lang/Object;

    .line 111
    .line 112
    iput v4, v7, La/pvu;->l:I

    .line 113
    .line 114
    iget-object p1, p0, La/pmi;->e:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, La/mne;

    .line 117
    .line 118
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 119
    .line 120
    new-instance v0, La/hij;

    .line 121
    .line 122
    invoke-direct {v0, p0, v6, v2}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1, v0, v7}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v9, :cond_7

    .line 130
    .line 131
    goto :goto_8

    .line 132
    :cond_7
    :goto_3
    check-cast p1, Ljava/util/List;

    .line 133
    .line 134
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :goto_4
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 138
    .line 139
    new-instance p1, La/g0g0;

    .line 140
    .line 141
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    :goto_5
    instance-of p0, p1, La/g0g0;

    .line 145
    .line 146
    if-nez p0, :cond_9

    .line 147
    .line 148
    move-object p0, p1

    .line 149
    check-cast p0, Ljava/util/List;

    .line 150
    .line 151
    iput-object p1, v7, La/pvu;->i:Ljava/lang/Object;

    .line 152
    .line 153
    iput v3, v7, La/pvu;->l:I

    .line 154
    .line 155
    iget-object p1, v1, La/sjl0;->c:La/mne;

    .line 156
    .line 157
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 158
    .line 159
    new-instance v0, La/lcl0;

    .line 160
    .line 161
    invoke-direct {v0, v1, p0, v6, v3}, La/lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1, v0, v7}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    sget-object p1, La/wne;->a:La/wne;

    .line 169
    .line 170
    if-ne p0, p1, :cond_8

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    :goto_6
    if-ne p0, v9, :cond_9

    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_9
    :goto_7
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 179
    .line 180
    goto :goto_a

    .line 181
    :cond_a
    move-object p1, v6

    .line 182
    new-instance v6, La/hr;

    .line 183
    .line 184
    const/16 v0, 0x12

    .line 185
    .line 186
    invoke-direct {v6, p0, p1, v0}, La/hr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 187
    .line 188
    .line 189
    iput v2, v7, La/pvu;->l:I

    .line 190
    .line 191
    const-string v1, "getSports"

    .line 192
    .line 193
    const-wide/16 v2, 0x5

    .line 194
    .line 195
    const-wide/16 v4, 0x0

    .line 196
    .line 197
    const/16 v8, 0xc

    .line 198
    .line 199
    invoke-static/range {v1 .. v8}, La/j0x;->I(Ljava/lang/String;JJLkotlin/jvm/functions/Function1;La/zje;I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    if-ne p0, v9, :cond_b

    .line 204
    .line 205
    :goto_8
    return-object v9

    .line 206
    :cond_b
    :goto_9
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :goto_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0
.end method
