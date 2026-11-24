.class public final synthetic La/o230;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:La/m9s;

.field public final synthetic c:La/l230;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:J

.field public final synthetic f:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(JLa/m9s;La/l230;Ljava/util/List;JLjava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/o230;->a:J

    iput-object p3, p0, La/o230;->b:La/m9s;

    iput-object p4, p0, La/o230;->c:La/l230;

    iput-object p5, p0, La/o230;->d:Ljava/util/List;

    iput-wide p6, p0, La/o230;->e:J

    iput-object p8, p0, La/o230;->f:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/g7h;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, v0, La/g7h;->e:La/th90;

    .line 8
    .line 9
    iget-wide v1, p0, La/o230;->a:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, La/th90;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    sget-object v3, La/uh90;->g:La/uh90;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    iget-object v7, p0, La/o230;->f:Ljava/util/Set;

    .line 68
    .line 69
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v4, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    invoke-static {v4}, La/dyb;->s0(Ljava/util/Map;)La/th90;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iget-object v4, p0, La/o230;->c:La/l230;

    .line 92
    .line 93
    iget-object v4, v4, La/l230;->b:La/ms2;

    .line 94
    .line 95
    iget-object v5, v0, La/g7h;->d:La/th90;

    .line 96
    .line 97
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    iget-wide v7, p0, La/o230;->e:J

    .line 102
    .line 103
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-interface {v5, v6, v7}, La/th90;->put(Ljava/lang/Object;Ljava/lang/Object;)La/th90;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {p1, v1, v3}, La/th90;->put(Ljava/lang/Object;Ljava/lang/Object;)La/th90;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    const-wide/16 v9, 0x0

    .line 120
    .line 121
    const/16 v11, 0x1e0

    .line 122
    .line 123
    iget-object v1, p0, La/o230;->b:La/m9s;

    .line 124
    .line 125
    iget-object v3, p0, La/o230;->d:Ljava/util/List;

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v8, 0x0

    .line 130
    move-object v2, v4

    .line 131
    move-object v4, v5

    .line 132
    move-object v5, p1

    .line 133
    invoke-static/range {v0 .. v11}, La/g7h;->a(La/g7h;La/m9s;La/ms2;Ljava/util/List;La/th90;La/th90;La/th90;La/th90;Ljava/util/List;JI)La/g7h;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0
.end method
