.class public final La/jou;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/util/Map;

.field public j:Ljava/util/Iterator;

.field public k:Ljava/util/Map;

.field public l:Ljava/lang/Object;

.field public m:Z

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:La/khf0;

.field public final synthetic q:B

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:La/sff0;


# direct methods
.method public constructor <init>(Ljava/util/List;La/khf0;ILjava/lang/String;La/sff0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jou;->o:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, La/jou;->p:La/khf0;

    .line 4
    .line 5
    iput-byte p3, p0, La/jou;->q:B

    .line 6
    .line 7
    iput-object p4, p0, La/jou;->r:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, La/jou;->s:La/sff0;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/jou;

    .line 2
    .line 3
    iget-object v4, p0, La/jou;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v5, p0, La/jou;->s:La/sff0;

    .line 6
    .line 7
    iget-object v1, p0, La/jou;->o:Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, p0, La/jou;->p:La/khf0;

    .line 10
    .line 11
    iget-byte v3, p0, La/jou;->q:B

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/jou;-><init>(Ljava/util/List;La/khf0;ILjava/lang/String;La/sff0;La/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/jou;->n:Ljava/lang/Object;

    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, La/jou;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/jou;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/jou;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, La/jou;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v2, p0, La/jou;->m:Z

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, La/jou;->l:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v2, p0, La/jou;->k:Ljava/util/Map;

    .line 18
    .line 19
    check-cast v2, Ljava/util/Map;

    .line 20
    .line 21
    iget-object v5, p0, La/jou;->j:Ljava/util/Iterator;

    .line 22
    .line 23
    iget-object v6, p0, La/jou;->i:Ljava/util/Map;

    .line 24
    .line 25
    check-cast v6, Ljava/util/Map;

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v4

    .line 38
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    const/16 v2, 0xa

    .line 44
    .line 45
    iget-object v5, p0, La/jou;->o:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v5, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-static {v2}, La/wp20;->a(I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/16 v6, 0x10

    .line 56
    .line 57
    if-ge v2, v6, :cond_2

    .line 58
    .line 59
    move v2, v6

    .line 60
    :cond_2
    invoke-direct {p1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    move-object v8, v5

    .line 78
    check-cast v8, La/vh0;

    .line 79
    .line 80
    iget-object v6, p0, La/jou;->s:La/sff0;

    .line 81
    .line 82
    iget-object v6, v6, La/sff0;->b:La/hl1;

    .line 83
    .line 84
    iget-boolean v11, v6, La/hl1;->N:Z

    .line 85
    .line 86
    new-instance v6, La/knu;

    .line 87
    .line 88
    const/4 v12, 0x0

    .line 89
    iget-object v7, p0, La/jou;->p:La/khf0;

    .line 90
    .line 91
    iget-object v9, p0, La/jou;->r:Ljava/lang/String;

    .line 92
    .line 93
    iget-byte v10, p0, La/jou;->q:B

    .line 94
    .line 95
    invoke-direct/range {v6 .. v12}, La/knu;-><init>(La/khf0;La/vh0;Ljava/lang/String;IZLa/yje;)V

    .line 96
    .line 97
    .line 98
    const/4 v7, 0x3

    .line 99
    invoke-static {v0, v4, v6, v7}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-interface {p1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-static {v2}, La/wp20;->a(I)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Ljava/lang/Iterable;

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    move-object v5, p1

    .line 131
    move-object v2, v0

    .line 132
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Ljava/util/Map$Entry;

    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, La/jzj;

    .line 153
    .line 154
    iput-object v4, p0, La/jou;->n:Ljava/lang/Object;

    .line 155
    .line 156
    move-object v6, v2

    .line 157
    check-cast v6, Ljava/util/Map;

    .line 158
    .line 159
    iput-object v6, p0, La/jou;->i:Ljava/util/Map;

    .line 160
    .line 161
    iput-object v5, p0, La/jou;->j:Ljava/util/Iterator;

    .line 162
    .line 163
    iput-object v6, p0, La/jou;->k:Ljava/util/Map;

    .line 164
    .line 165
    iput-object v0, p0, La/jou;->l:Ljava/lang/Object;

    .line 166
    .line 167
    iput-boolean v3, p0, La/jou;->m:Z

    .line 168
    .line 169
    invoke-interface {p1, p0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-ne p1, v1, :cond_4

    .line 174
    .line 175
    return-object v1

    .line 176
    :cond_4
    move-object v6, v2

    .line 177
    :goto_2
    check-cast p1, La/j0g0;

    .line 178
    .line 179
    iget-object v7, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 180
    .line 181
    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-object v2, v6

    .line 185
    goto :goto_1

    .line 186
    :cond_5
    return-object v2
.end method
