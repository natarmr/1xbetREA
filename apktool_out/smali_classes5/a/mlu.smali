.class public final La/mlu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public synthetic i:Ljava/util/List;

.field public synthetic j:Ljava/util/List;

.field public synthetic k:Ljava/util/List;

.field public synthetic l:Ljava/util/List;

.field public final synthetic m:Ljava/util/Map;

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(Ljava/util/Map;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mlu;->m:Ljava/util/Map;

    .line 2
    .line 3
    iput-boolean p2, p0, La/mlu;->n:Z

    .line 4
    .line 5
    const/4 p1, 0x5

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    check-cast p2, Ljava/util/List;

    .line 4
    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    .line 7
    check-cast p4, Ljava/util/List;

    .line 8
    .line 9
    check-cast p5, La/yje;

    .line 10
    .line 11
    new-instance v0, La/mlu;

    .line 12
    .line 13
    iget-object v1, p0, La/mlu;->m:Ljava/util/Map;

    .line 14
    .line 15
    iget-boolean p0, p0, La/mlu;->n:Z

    .line 16
    .line 17
    invoke-direct {v0, v1, p0, p5}, La/mlu;-><init>(Ljava/util/Map;ZLa/yje;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/mlu;->i:Ljava/util/List;

    .line 21
    .line 22
    iput-object p2, v0, La/mlu;->j:Ljava/util/List;

    .line 23
    .line 24
    iput-object p3, v0, La/mlu;->k:Ljava/util/List;

    .line 25
    .line 26
    iput-object p4, v0, La/mlu;->l:Ljava/util/List;

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, La/mlu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/mlu;->i:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, La/mlu;->j:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, La/mlu;->k:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, La/mlu;->l:Ljava/util/List;

    .line 8
    .line 9
    sget-object v4, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, La/jo20;

    .line 15
    .line 16
    invoke-direct {p1}, La/jo20;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-boolean v4, p0, La/mlu;->n:Z

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    sget-object v5, La/r040;->k:La/r040;

    .line 24
    .line 25
    invoke-virtual {p1, v5, v2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object v2, La/r040;->l:La/r040;

    .line 29
    .line 30
    invoke-virtual {p1, v2, v3}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/util/List;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v5, La/r040;->k:La/r040;

    .line 38
    .line 39
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p1, v5, v2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ljava/util/List;

    .line 48
    .line 49
    :goto_0
    invoke-virtual {p1}, La/jo20;->b()La/jo20;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v2, La/jo20;

    .line 54
    .line 55
    invoke-direct {v2}, La/jo20;-><init>()V

    .line 56
    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    sget-object v3, La/r040;->i:La/r040;

    .line 61
    .line 62
    invoke-virtual {v2, v3, v0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object v0, La/r040;->j:La/r040;

    .line 66
    .line 67
    invoke-virtual {v2, v0, v1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/util/List;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    sget-object v3, La/r040;->i:La/r040;

    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v2, v3, v0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/util/List;

    .line 85
    .line 86
    :goto_1
    invoke-virtual {v2}, La/jo20;->b()La/jo20;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 91
    .line 92
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, La/jo20;->entrySet()Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/ko20;

    .line 100
    .line 101
    invoke-virtual {v0}, La/ko20;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Ljava/util/Map$Entry;

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_2

    .line 128
    .line 129
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    iget-object p0, p0, La/mlu;->m:Ljava/util/Map;

    .line 142
    .line 143
    invoke-static {p1, p0}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {p0, v1}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0
.end method
