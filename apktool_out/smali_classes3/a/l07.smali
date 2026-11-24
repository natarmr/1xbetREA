.class public final La/l07;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/List;

.field public final f:La/ro7;


# direct methods
.method public constructor <init>(JLjava/lang/String;ILjava/util/ArrayList;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x524

    .line 7
    .line 8
    cmp-long v1, p1, v1

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const-wide/16 v1, 0x523

    .line 13
    .line 14
    cmp-long v1, p1, v1

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v1, La/ro7;->a:La/ro7;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    sget-object v1, La/ro7;->b:La/ro7;

    .line 23
    .line 24
    :goto_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-wide p1, p0, La/l07;->a:J

    .line 28
    .line 29
    iput-object p3, p0, La/l07;->b:Ljava/lang/String;

    .line 30
    .line 31
    iput p4, p0, La/l07;->c:I

    .line 32
    .line 33
    iput-object p5, p0, La/l07;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    iput-object v0, p0, La/l07;->e:Ljava/util/List;

    .line 36
    .line 37
    iput-object v1, p0, La/l07;->f:La/ro7;

    .line 38
    .line 39
    invoke-virtual {p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_8

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Ljava/util/List;

    .line 54
    .line 55
    iget-object p3, p0, La/l07;->e:Ljava/util/List;

    .line 56
    .line 57
    iget-object p4, p0, La/l07;->f:La/ro7;

    .line 58
    .line 59
    sget-object p5, La/k07;->a:[I

    .line 60
    .line 61
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    aget p4, p5, p4

    .line 66
    .line 67
    const/4 p5, 0x1

    .line 68
    if-ne p4, p5, :cond_6

    .line 69
    .line 70
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    :cond_3
    :goto_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p5

    .line 78
    if-eqz p5, :cond_2

    .line 79
    .line 80
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p5

    .line 84
    check-cast p5, La/iq7;

    .line 85
    .line 86
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    new-instance v0, La/cac;

    .line 100
    .line 101
    invoke-direct {v0}, La/cac;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    :cond_5
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, La/cac;

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v0, v0, La/cac;->a:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    new-instance p4, La/cac;

    .line 125
    .line 126
    invoke-direct {p4}, La/cac;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result p5

    .line 137
    if-eqz p5, :cond_7

    .line 138
    .line 139
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p5

    .line 143
    check-cast p5, La/iq7;

    .line 144
    .line 145
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v0, p4, La/cac;->a:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_7
    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-class v2, La/l07;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, La/l07;

    .line 27
    .line 28
    iget-wide v3, p0, La/l07;->a:J

    .line 29
    .line 30
    iget-wide p0, p1, La/l07;->a:J

    .line 31
    .line 32
    cmp-long p0, v3, p0

    .line 33
    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, La/l07;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
