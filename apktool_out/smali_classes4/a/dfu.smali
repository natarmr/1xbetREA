.class public final La/dfu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/util/Map;

.field public j:Ljava/util/Iterator;

.field public k:Ljava/util/Map;

.field public l:La/yeu;

.field public m:I

.field public n:Z

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/util/Set;

.field public final synthetic q:La/a6u;

.field public final synthetic r:I

.field public final synthetic s:I


# direct methods
.method public constructor <init>(Ljava/util/Set;La/a6u;IILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dfu;->p:Ljava/util/Set;

    .line 2
    .line 3
    iput-object p2, p0, La/dfu;->q:La/a6u;

    .line 4
    .line 5
    iput p3, p0, La/dfu;->r:I

    .line 6
    .line 7
    iput p4, p0, La/dfu;->s:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/dfu;

    .line 2
    .line 3
    iget v3, p0, La/dfu;->r:I

    .line 4
    .line 5
    iget v4, p0, La/dfu;->s:I

    .line 6
    .line 7
    iget-object v1, p0, La/dfu;->p:Ljava/util/Set;

    .line 8
    .line 9
    iget-object v2, p0, La/dfu;->q:La/a6u;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/dfu;-><init>(Ljava/util/Set;La/a6u;IILa/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/dfu;->o:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, La/dfu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/dfu;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/dfu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, La/dfu;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v2, p0, La/dfu;->n:Z

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
    iget v0, p0, La/dfu;->m:I

    .line 16
    .line 17
    iget-object v2, p0, La/dfu;->l:La/yeu;

    .line 18
    .line 19
    iget-object v5, p0, La/dfu;->k:Ljava/util/Map;

    .line 20
    .line 21
    check-cast v5, Ljava/util/Map;

    .line 22
    .line 23
    iget-object v6, p0, La/dfu;->j:Ljava/util/Iterator;

    .line 24
    .line 25
    iget-object v7, p0, La/dfu;->i:Ljava/util/Map;

    .line 26
    .line 27
    check-cast v7, Ljava/util/Map;

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v4

    .line 40
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, La/dfu;->p:Ljava/util/Set;

    .line 44
    .line 45
    check-cast p1, Ljava/lang/Iterable;

    .line 46
    .line 47
    new-instance v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v5, 0xa

    .line 50
    .line 51
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_2

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    move-object v9, v6

    .line 73
    check-cast v9, La/yeu;

    .line 74
    .line 75
    new-instance v7, La/ydu;

    .line 76
    .line 77
    const/4 v12, 0x0

    .line 78
    iget-object v8, p0, La/dfu;->q:La/a6u;

    .line 79
    .line 80
    iget v10, p0, La/dfu;->r:I

    .line 81
    .line 82
    iget v11, p0, La/dfu;->s:I

    .line 83
    .line 84
    invoke-direct/range {v7 .. v12}, La/ydu;-><init>(La/a6u;La/yeu;IILa/yje;)V

    .line 85
    .line 86
    .line 87
    const/4 v6, 0x3

    .line 88
    invoke-static {v0, v4, v7, v6}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    new-instance v7, Lkotlin/Pair;

    .line 93
    .line 94
    invoke-direct {v7, v9, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-static {p1}, La/wp20;->a(I)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    const/16 v0, 0x10

    .line 110
    .line 111
    if-ge p1, v0, :cond_3

    .line 112
    .line 113
    move p1, v0

    .line 114
    :cond_3
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 115
    .line 116
    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    move-object v5, v0

    .line 124
    move-object v6, v2

    .line 125
    move v0, p1

    .line 126
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lkotlin/Pair;

    .line 137
    .line 138
    iget-object v2, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, La/yeu;

    .line 141
    .line 142
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p1, La/jzj;

    .line 145
    .line 146
    iput-object v4, p0, La/dfu;->o:Ljava/lang/Object;

    .line 147
    .line 148
    move-object v7, v5

    .line 149
    check-cast v7, Ljava/util/Map;

    .line 150
    .line 151
    iput-object v7, p0, La/dfu;->i:Ljava/util/Map;

    .line 152
    .line 153
    iput-object v6, p0, La/dfu;->j:Ljava/util/Iterator;

    .line 154
    .line 155
    iput-object v7, p0, La/dfu;->k:Ljava/util/Map;

    .line 156
    .line 157
    iput-object v2, p0, La/dfu;->l:La/yeu;

    .line 158
    .line 159
    iput v0, p0, La/dfu;->m:I

    .line 160
    .line 161
    iput-boolean v3, p0, La/dfu;->n:Z

    .line 162
    .line 163
    invoke-interface {p1, p0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-ne p1, v1, :cond_4

    .line 168
    .line 169
    return-object v1

    .line 170
    :cond_4
    move-object v7, v5

    .line 171
    :goto_2
    invoke-interface {v5, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-object v5, v7

    .line 175
    goto :goto_1

    .line 176
    :cond_5
    return-object v5
.end method
