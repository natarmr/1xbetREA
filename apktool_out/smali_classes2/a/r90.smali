.class public final La/r90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/esr;

.field public j:La/z70;

.field public k:D

.field public l:Z

.field public final synthetic m:La/u90;

.field public final synthetic n:D


# direct methods
.method public constructor <init>(La/u90;DLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/r90;->m:La/u90;

    .line 2
    .line 3
    iput-wide p2, p0, La/r90;->n:D

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
    new-instance p1, La/r90;

    .line 2
    .line 3
    iget-object v0, p0, La/r90;->m:La/u90;

    .line 4
    .line 5
    iget-wide v1, p0, La/r90;->n:D

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, La/r90;-><init>(La/u90;DLa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/r90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/r90;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/r90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, La/r90;->m:La/u90;

    .line 2
    .line 3
    iget-object v1, v0, La/u90;->b:La/p80;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v3, p0, La/r90;->l:Z

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-wide v5, p0, La/r90;->n:D

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    if-ne v3, v7, :cond_0

    .line 16
    .line 17
    iget-wide v2, p0, La/r90;->k:D

    .line 18
    .line 19
    iget-object v7, p0, La/r90;->j:La/z70;

    .line 20
    .line 21
    iget-object p0, p0, La/r90;->i:La/esr;

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v12, p0

    .line 27
    move-wide v8, v2

    .line 28
    move-object v10, v7

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v4

    .line 36
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v1, La/p80;->d:La/r80;

    .line 40
    .line 41
    iget-object p1, p1, La/r80;->c:La/d80;

    .line 42
    .line 43
    iget-object p1, p1, La/d80;->b:La/z70;

    .line 44
    .line 45
    sget-object v3, La/z70;->v:La/z70;

    .line 46
    .line 47
    if-eq p1, v3, :cond_8

    .line 48
    .line 49
    iget-object v3, v0, La/u90;->f:La/ztt;

    .line 50
    .line 51
    invoke-virtual {v3}, La/ztt;->a()La/csr;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v3, v3, La/csr;->a:La/bsr;

    .line 56
    .line 57
    iget-object v3, v3, La/bsr;->a:La/esr;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v8, v1, La/p80;->d:La/r80;

    .line 63
    .line 64
    iget-object v8, v8, La/r80;->c:La/d80;

    .line 65
    .line 66
    iput-object v3, v8, La/d80;->c:La/esr;

    .line 67
    .line 68
    sget-object v8, La/esr;->d:La/esr;

    .line 69
    .line 70
    if-eq v3, v8, :cond_2

    .line 71
    .line 72
    sget-object v8, La/esr;->f:La/esr;

    .line 73
    .line 74
    if-eq v3, v8, :cond_2

    .line 75
    .line 76
    sget-object v8, La/esr;->e:La/esr;

    .line 77
    .line 78
    if-eq v3, v8, :cond_2

    .line 79
    .line 80
    sget-object v8, La/esr;->h:La/esr;

    .line 81
    .line 82
    if-ne v3, v8, :cond_3

    .line 83
    .line 84
    :cond_2
    iget-object v8, v1, La/p80;->d:La/r80;

    .line 85
    .line 86
    iget-object v8, v8, La/r80;->c:La/d80;

    .line 87
    .line 88
    iget-object v8, v8, La/d80;->a:La/p7m0;

    .line 89
    .line 90
    sget-object v9, La/iun;->a:La/iun;

    .line 91
    .line 92
    invoke-virtual {v8, v9}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    iget-object v8, v0, La/u90;->q:La/t0u;

    .line 96
    .line 97
    iput-object v3, p0, La/r90;->i:La/esr;

    .line 98
    .line 99
    iput-object p1, p0, La/r90;->j:La/z70;

    .line 100
    .line 101
    iput-wide v5, p0, La/r90;->k:D

    .line 102
    .line 103
    iput-boolean v7, p0, La/r90;->l:Z

    .line 104
    .line 105
    invoke-virtual {v8, p0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v2, :cond_4

    .line 110
    .line 111
    return-object v2

    .line 112
    :cond_4
    move-object v10, p1

    .line 113
    move-object v12, v3

    .line 114
    move-wide v8, v5

    .line 115
    move-object p1, p0

    .line 116
    :goto_0
    move-object v11, p1

    .line 117
    check-cast v11, Ljava/lang/String;

    .line 118
    .line 119
    new-instance v7, La/t70;

    .line 120
    .line 121
    invoke-direct/range {v7 .. v12}, La/t70;-><init>(DLa/z70;Ljava/lang/String;La/esr;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object p0, v1, La/p80;->d:La/r80;

    .line 128
    .line 129
    iget-object p0, p0, La/r80;->c:La/d80;

    .line 130
    .line 131
    invoke-virtual {p0}, La/d80;->a()Ljava/util/ArrayList;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_6

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    move-object v8, v3

    .line 150
    check-cast v8, La/t70;

    .line 151
    .line 152
    iget-object v8, v8, La/t70;->b:La/z70;

    .line 153
    .line 154
    iget-object v9, v7, La/t70;->b:La/z70;

    .line 155
    .line 156
    if-ne v8, v9, :cond_5

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_6
    move-object v3, v4

    .line 160
    :goto_1
    check-cast v3, La/t70;

    .line 161
    .line 162
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    const/4 v3, -0x1

    .line 167
    if-le v2, v3, :cond_7

    .line 168
    .line 169
    invoke-virtual {p1, v2, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_7
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    :goto_2
    iget-object p0, p0, La/d80;->a:La/p7m0;

    .line 177
    .line 178
    invoke-virtual {p0, v4, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    iget-object p0, v0, La/u90;->k:La/wkt0;

    .line 182
    .line 183
    invoke-virtual {p0, v5, v6}, La/wkt0;->a(D)V

    .line 184
    .line 185
    .line 186
    sget-object p0, La/z70;->v:La/z70;

    .line 187
    .line 188
    iget-object p1, v1, La/p80;->d:La/r80;

    .line 189
    .line 190
    iget-object p1, p1, La/r80;->c:La/d80;

    .line 191
    .line 192
    iput-object p0, p1, La/d80;->b:La/z70;

    .line 193
    .line 194
    sget-object p0, La/d90;->a:La/d90;

    .line 195
    .line 196
    invoke-virtual {v0, p0}, La/u90;->G(La/h90;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0
.end method
