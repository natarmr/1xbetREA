.class public abstract La/l8y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/g950;

.field public static final b:La/g950;

.field public static final c:La/g950;

.field public static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {v0}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/l8y;->a:La/g950;

    .line 8
    .line 9
    const-string v0, "allowedTargets"

    .line 10
    .line 11
    invoke-static {v0}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/l8y;->b:La/g950;

    .line 16
    .line 17
    const-string v0, "value"

    .line 18
    .line 19
    invoke-static {v0}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, La/l8y;->c:La/g950;

    .line 24
    .line 25
    sget-object v0, La/i4m0;->t:La/swq;

    .line 26
    .line 27
    sget-object v1, La/bey;->c:La/swq;

    .line 28
    .line 29
    new-instance v2, Lkotlin/Pair;

    .line 30
    .line 31
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, La/i4m0;->w:La/swq;

    .line 35
    .line 36
    sget-object v1, La/bey;->d:La/swq;

    .line 37
    .line 38
    new-instance v3, Lkotlin/Pair;

    .line 39
    .line 40
    invoke-direct {v3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, La/i4m0;->x:La/swq;

    .line 44
    .line 45
    sget-object v1, La/bey;->f:La/swq;

    .line 46
    .line 47
    new-instance v4, Lkotlin/Pair;

    .line 48
    .line 49
    invoke-direct {v4, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    filled-new-array {v2, v3, v4}, [Lkotlin/Pair;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, La/l8y;->d:Ljava/util/Map;

    .line 61
    .line 62
    return-void
.end method

.method public static a(La/swq;La/m8y;La/f7u;)La/rnb0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, La/i4m0;->m:La/swq;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, La/swq;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-object v0, La/bey;->e:La/swq;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, La/m8y;->a(La/swq;)La/cqe0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p0, La/v8y;

    .line 31
    .line 32
    invoke-direct {p0, v0, p2}, La/v8y;-><init>(La/cqe0;La/f7u;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    :goto_0
    sget-object v0, La/l8y;->d:Ljava/util/Map;

    .line 37
    .line 38
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/swq;

    .line 43
    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    invoke-interface {p1, p0}, La/m8y;->a(La/swq;)La/cqe0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-static {p2, p0, p1}, La/l8y;->b(La/f7u;La/cqe0;Z)La/rnb0;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_2
    const/4 p0, 0x0

    .line 59
    return-object p0
.end method

.method public static b(La/f7u;La/cqe0;Z)La/rnb0;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/cqe0;->a:Ljava/lang/annotation/Annotation;

    .line 5
    .line 6
    invoke-static {v0}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, La/bqe0;->a(Ljava/lang/Class;)La/qlc;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, La/bey;->c:La/swq;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, La/qlc;

    .line 24
    .line 25
    invoke-virtual {v1}, La/swq;->b()La/swq;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v1, v1, La/swq;->a:La/twq;

    .line 30
    .line 31
    invoke-virtual {v1}, La/twq;->g()La/g950;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v2, v3, v1}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, La/qlc;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    new-instance p2, La/z9y;

    .line 45
    .line 46
    invoke-direct {p2, p1, p0}, La/z9y;-><init>(La/cqe0;La/f7u;)V

    .line 47
    .line 48
    .line 49
    return-object p2

    .line 50
    :cond_0
    sget-object v1, La/bey;->d:La/swq;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v2, La/qlc;

    .line 56
    .line 57
    invoke-virtual {v1}, La/swq;->b()La/swq;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget-object v1, v1, La/swq;->a:La/twq;

    .line 62
    .line 63
    invoke-virtual {v1}, La/twq;->g()La/g950;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-direct {v2, v3, v1}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2}, La/qlc;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    new-instance p2, La/y9y;

    .line 77
    .line 78
    invoke-direct {p2, p1, p0}, La/y9y;-><init>(La/cqe0;La/f7u;)V

    .line 79
    .line 80
    .line 81
    return-object p2

    .line 82
    :cond_1
    sget-object v1, La/bey;->f:La/swq;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v2, La/qlc;

    .line 88
    .line 89
    invoke-virtual {v1}, La/swq;->b()La/swq;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    iget-object v1, v1, La/swq;->a:La/twq;

    .line 94
    .line 95
    invoke-virtual {v1}, La/twq;->g()La/g950;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v2, v3, v1}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2}, La/qlc;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    new-instance p2, La/k8y;

    .line 109
    .line 110
    sget-object v0, La/i4m0;->x:La/swq;

    .line 111
    .line 112
    invoke-direct {p2, p0, p1, v0}, La/k8y;-><init>(La/f7u;La/cqe0;La/swq;)V

    .line 113
    .line 114
    .line 115
    return-object p2

    .line 116
    :cond_2
    sget-object v1, La/bey;->e:La/swq;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v2, La/qlc;

    .line 122
    .line 123
    invoke-virtual {v1}, La/swq;->b()La/swq;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget-object v1, v1, La/swq;->a:La/twq;

    .line 128
    .line 129
    invoke-virtual {v1}, La/twq;->g()La/g950;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v2, v3, v1}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v2}, La/qlc;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_3

    .line 141
    .line 142
    const/4 p0, 0x0

    .line 143
    return-object p0

    .line 144
    :cond_3
    new-instance v0, La/i9z;

    .line 145
    .line 146
    invoke-direct {v0, p0, p1, p2}, La/i9z;-><init>(La/f7u;La/cqe0;Z)V

    .line 147
    .line 148
    .line 149
    return-object v0
.end method
