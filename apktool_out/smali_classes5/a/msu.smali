.class public final La/msu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mne;

.field public final b:La/sjl0;


# direct methods
.method public constructor <init>(La/mne;La/sjl0;)V
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
    iput-object p1, p0, La/msu;->a:La/mne;

    .line 8
    .line 9
    iput-object p2, p0, La/msu;->b:La/sjl0;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(La/sjl0;La/mne;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, La/msu;->b:La/sjl0;

    .line 14
    iput-object p2, p0, La/msu;->a:La/mne;

    return-void
.end method


# virtual methods
.method public a(La/cxk0;La/zje;)Ljava/io/Serializable;
    .locals 9

    .line 1
    instance-of v0, p2, La/lsu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/lsu;

    .line 7
    .line 8
    iget v1, v0, La/lsu;->k:I

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
    iput v1, v0, La/lsu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lsu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/lsu;-><init>(La/msu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/lsu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lsu;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v4

    .line 48
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, La/yni0;

    .line 52
    .line 53
    invoke-direct {p2}, La/yni0;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object v2, p1, La/cxk0;->a:Ljava/util/List;

    .line 57
    .line 58
    new-instance v5, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/16 v6, 0xa

    .line 61
    .line 62
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_3

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, La/d0t;

    .line 84
    .line 85
    iget-wide v7, v7, La/d0t;->v:J

    .line 86
    .line 87
    invoke-static {v7, v8, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {p2, v5}, La/yni0;->addAll(Ljava/util/Collection;)Z

    .line 92
    .line 93
    .line 94
    iget-object v2, p1, La/cxk0;->b:Ljava/util/List;

    .line 95
    .line 96
    new-instance v5, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_4

    .line 114
    .line 115
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, La/d0t;

    .line 120
    .line 121
    iget-wide v7, v7, La/d0t;->v:J

    .line 122
    .line 123
    invoke-static {v7, v8, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    invoke-virtual {p2, v5}, La/yni0;->addAll(Ljava/util/Collection;)Z

    .line 128
    .line 129
    .line 130
    iget-object p1, p1, La/cxk0;->c:Ljava/util/List;

    .line 131
    .line 132
    new-instance v2, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-static {p1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_5

    .line 150
    .line 151
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    check-cast v5, La/d2w;

    .line 156
    .line 157
    invoke-virtual {v5}, La/d2w;->d()J

    .line 158
    .line 159
    .line 160
    move-result-wide v5

    .line 161
    invoke-static {v5, v6, v2}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    invoke-virtual {p2, v2}, La/yni0;->addAll(Ljava/util/Collection;)Z

    .line 166
    .line 167
    .line 168
    invoke-static {p2}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iget-object p2, p0, La/msu;->a:La/mne;

    .line 173
    .line 174
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 175
    .line 176
    new-instance v2, La/u5u;

    .line 177
    .line 178
    const/4 v5, 0x5

    .line 179
    invoke-direct {v2, p0, p1, v4, v5}, La/u5u;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 180
    .line 181
    .line 182
    iput v3, v0, La/lsu;->k:I

    .line 183
    .line 184
    invoke-static {p2, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    if-ne p2, v1, :cond_6

    .line 189
    .line 190
    return-object v1

    .line 191
    :cond_6
    :goto_4
    check-cast p2, Ljava/util/List;

    .line 192
    .line 193
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    if-nez p1, :cond_7

    .line 202
    .line 203
    sget-object p1, La/aok0;->a:La/aok0;

    .line 204
    .line 205
    invoke-virtual {p0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, p2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 209
    .line 210
    .line 211
    :cond_7
    invoke-static {p0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0
.end method

.method public b(JLa/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/msu;->a:La/mne;

    .line 2
    .line 3
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 4
    .line 5
    new-instance v1, La/ey;

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/16 v6, 0x1a

    .line 9
    .line 10
    move-object v2, p0

    .line 11
    move-wide v3, p1

    .line 12
    invoke-direct/range {v1 .. v6}, La/ey;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
