.class public final La/qyk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/yxk0;

.field public j:La/esr;

.field public k:Z

.field public final synthetic l:La/tyk0;

.field public final synthetic m:D


# direct methods
.method public constructor <init>(La/tyk0;DLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qyk0;->l:La/tyk0;

    .line 2
    .line 3
    iput-wide p2, p0, La/qyk0;->m:D

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    new-instance p1, La/qyk0;

    .line 2
    .line 3
    iget-object v0, p0, La/qyk0;->l:La/tyk0;

    .line 4
    .line 5
    iget-wide v1, p0, La/qyk0;->m:D

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, La/qyk0;-><init>(La/tyk0;DLa/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/qyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qyk0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/qyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/qyk0;->k:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/qyk0;->l:La/tyk0;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, La/qyk0;->j:La/esr;

    .line 14
    .line 15
    iget-object v1, p0, La/qyk0;->i:La/yxk0;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object v10, v0

    .line 21
    :goto_0
    move-object v8, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v4, La/tyk0;->n:La/ysu;

    .line 33
    .line 34
    iget-object p1, p1, La/ysu;->a:La/bzk0;

    .line 35
    .line 36
    iget-object p1, p1, La/bzk0;->d:La/uyk0;

    .line 37
    .line 38
    iget-object v1, p1, La/uyk0;->b:La/yxk0;

    .line 39
    .line 40
    sget-object p1, La/yxk0;->g:La/yxk0;

    .line 41
    .line 42
    if-eq v1, p1, :cond_8

    .line 43
    .line 44
    iget-object v5, v4, La/tyk0;->e:La/ztt;

    .line 45
    .line 46
    invoke-virtual {v5}, La/ztt;->a()La/csr;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object v5, v5, La/csr;->a:La/bsr;

    .line 51
    .line 52
    iget-object v5, v5, La/bsr;->a:La/esr;

    .line 53
    .line 54
    sget-object v6, La/esr;->d:La/esr;

    .line 55
    .line 56
    if-eq v5, v6, :cond_2

    .line 57
    .line 58
    sget-object v6, La/esr;->f:La/esr;

    .line 59
    .line 60
    if-eq v5, v6, :cond_2

    .line 61
    .line 62
    sget-object v6, La/esr;->e:La/esr;

    .line 63
    .line 64
    if-eq v5, v6, :cond_2

    .line 65
    .line 66
    sget-object v6, La/esr;->h:La/esr;

    .line 67
    .line 68
    if-ne v5, v6, :cond_3

    .line 69
    .line 70
    :cond_2
    iget-object v6, v4, La/tyk0;->q:La/fhf0;

    .line 71
    .line 72
    iget-object v6, v6, La/fhf0;->a:La/bzk0;

    .line 73
    .line 74
    iget-object v6, v6, La/bzk0;->d:La/uyk0;

    .line 75
    .line 76
    iget-object v6, v6, La/uyk0;->a:La/p7m0;

    .line 77
    .line 78
    sget-object v7, La/iun;->a:La/iun;

    .line 79
    .line 80
    invoke-virtual {v6, v7}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    new-instance v6, La/acs;

    .line 84
    .line 85
    invoke-direct {v6, p1}, La/acs;-><init>(La/yxk0;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v6}, La/tyk0;->D(La/dcs;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object p1, v4, La/tyk0;->y:La/t0u;

    .line 92
    .line 93
    iput-object v1, p0, La/qyk0;->i:La/yxk0;

    .line 94
    .line 95
    iput-object v5, p0, La/qyk0;->j:La/esr;

    .line 96
    .line 97
    iput-boolean v3, p0, La/qyk0;->k:Z

    .line 98
    .line 99
    invoke-virtual {p1, p0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v0, :cond_4

    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_4
    move-object v10, v5

    .line 107
    goto :goto_0

    .line 108
    :goto_1
    move-object v9, p1

    .line 109
    check-cast v9, Ljava/lang/String;

    .line 110
    .line 111
    new-instance v5, La/xxk0;

    .line 112
    .line 113
    iget-wide v6, p0, La/qyk0;->m:D

    .line 114
    .line 115
    const/4 v11, 0x1

    .line 116
    invoke-direct/range {v5 .. v11}, La/xxk0;-><init>(DLa/yxk0;Ljava/lang/String;La/esr;Z)V

    .line 117
    .line 118
    .line 119
    iget-object p1, v4, La/tyk0;->j:La/js;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object p1, p1, La/js;->a:La/bzk0;

    .line 125
    .line 126
    iget-object p1, p1, La/bzk0;->d:La/uyk0;

    .line 127
    .line 128
    iget-object p1, p1, La/uyk0;->a:La/p7m0;

    .line 129
    .line 130
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Ljava/util/Collection;

    .line 135
    .line 136
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_6

    .line 149
    .line 150
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    move-object v6, v3

    .line 155
    check-cast v6, La/xxk0;

    .line 156
    .line 157
    iget-object v6, v6, La/xxk0;->b:La/yxk0;

    .line 158
    .line 159
    iget-object v7, v5, La/xxk0;->b:La/yxk0;

    .line 160
    .line 161
    if-ne v6, v7, :cond_5

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    move-object v3, v2

    .line 165
    :goto_2
    check-cast v3, La/xxk0;

    .line 166
    .line 167
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    const/4 v3, -0x1

    .line 172
    if-le v1, v3, :cond_7

    .line 173
    .line 174
    invoke-virtual {v0, v1, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    :goto_3
    invoke-virtual {p1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    iget-object p1, v4, La/tyk0;->b:La/wkt0;

    .line 185
    .line 186
    iget-wide v0, p0, La/qyk0;->m:D

    .line 187
    .line 188
    invoke-virtual {p1, v0, v1}, La/wkt0;->a(D)V

    .line 189
    .line 190
    .line 191
    new-instance p0, La/zbs;

    .line 192
    .line 193
    new-instance p1, Ljava/lang/Double;

    .line 194
    .line 195
    invoke-direct {p1, v0, v1}, Ljava/lang/Double;-><init>(D)V

    .line 196
    .line 197
    .line 198
    invoke-direct {p0, v8, p1}, La/zbs;-><init>(La/yxk0;Ljava/lang/Double;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, p0}, La/tyk0;->D(La/dcs;)V

    .line 202
    .line 203
    .line 204
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p0
.end method
