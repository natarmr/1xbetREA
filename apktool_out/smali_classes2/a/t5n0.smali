.class public final La/t5n0;
.super La/dr30;
.source "SourceFile"


# instance fields
.field public final b:La/ym40;

.field public final c:La/swq;


# direct methods
.method public constructor <init>(La/ym40;La/swq;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/t5n0;->b:La/ym40;

    .line 11
    .line 12
    iput-object p2, p0, La/t5n0;->c:La/swq;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, La/cek;->h:I

    .line 5
    .line 6
    invoke-virtual {p1, v0}, La/cek;->a(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p0, La/iun;->a:La/iun;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object v0, p0, La/t5n0;->c:La/swq;

    .line 16
    .line 17
    iget-object v1, v0, La/swq;->a:La/twq;

    .line 18
    .line 19
    invoke-virtual {v1}, La/twq;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object p1, p1, La/cek;->a:Ljava/util/List;

    .line 26
    .line 27
    sget-object v1, La/ydk;->a:La/ydk;

    .line 28
    .line 29
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    sget-object p0, La/iun;->a:La/iun;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    iget-object p0, p0, La/t5n0;->b:La/ym40;

    .line 39
    .line 40
    invoke-interface {p0, v0, p2}, La/ym40;->n(La/swq;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, La/swq;

    .line 68
    .line 69
    iget-object v2, v2, La/swq;->a:La/twq;

    .line 70
    .line 71
    invoke-virtual {v2}, La/twq;->g()La/g950;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-boolean v3, v2, La/g950;->b:Z

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {v0, v2}, La/swq;->a(La/g950;)La/swq;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-interface {p0, v2}, La/ym40;->c0(La/swq;)La/gdz;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v3, v2, La/gdz;->g:La/cu00;

    .line 105
    .line 106
    sget-object v5, La/gdz;->i:[La/iiy;

    .line 107
    .line 108
    const/4 v6, 0x1

    .line 109
    aget-object v5, v5, v6

    .line 110
    .line 111
    invoke-static {v3, v5}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    move-object v4, v2

    .line 125
    :goto_1
    if-eqz v4, :cond_2

    .line 126
    .line 127
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    return-object v1
.end method

.method public final e()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, La/xun;->a:La/xun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "subpackages of "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/t5n0;->c:La/swq;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " from "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/t5n0;->b:La/ym40;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
