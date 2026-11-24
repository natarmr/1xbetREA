.class public final La/swt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j1q0;

.field public final b:La/lhf0;


# direct methods
.method public constructor <init>(La/j1q0;La/lhf0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/swt;->a:La/j1q0;

    .line 8
    .line 9
    iput-object p2, p0, La/swt;->b:La/lhf0;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(La/lhf0;La/j1q0;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, La/swt;->b:La/lhf0;

    .line 14
    iput-object p2, p0, La/swt;->a:La/j1q0;

    return-void
.end method


# virtual methods
.method public a([La/z7b;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/rnu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/rnu;

    .line 7
    .line 8
    iget v1, v0, La/rnu;->l:I

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
    iput v1, v0, La/rnu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/rnu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/rnu;-><init>(La/swt;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/rnu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/rnu;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, La/rnu;->i:[La/z7b;

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, La/swt;->a:La/j1q0;

    .line 53
    .line 54
    iget-object p2, p2, La/j1q0;->a:La/m1q0;

    .line 55
    .line 56
    invoke-virtual {p2}, La/m1q0;->a()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    iput-object p1, v0, La/rnu;->i:[La/z7b;

    .line 61
    .line 62
    iput v3, v0, La/rnu;->l:I

    .line 63
    .line 64
    iget-object p0, p0, La/swt;->b:La/lhf0;

    .line 65
    .line 66
    invoke-virtual {p0, p2, v0}, La/lhf0;->f(ZLa/zje;)Ljava/io/Serializable;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-ne p2, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 74
    .line 75
    array-length p0, p1

    .line 76
    if-nez p0, :cond_4

    .line 77
    .line 78
    return-object p2

    .line 79
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 80
    .line 81
    array-length v0, p1

    .line 82
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    array-length v0, p1

    .line 86
    const/4 v1, 0x0

    .line 87
    :goto_2
    if-ge v1, v0, :cond_5

    .line 88
    .line 89
    aget-object v2, p1, v1

    .line 90
    .line 91
    iget-byte v2, v2, La/z7b;->a:B

    .line 92
    .line 93
    int-to-long v2, v2

    .line 94
    new-instance v4, Ljava/lang/Long;

    .line 95
    .line 96
    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    new-instance p1, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    :cond_6
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    move-object v1, v0

    .line 129
    check-cast v1, La/vh0;

    .line 130
    .line 131
    iget-wide v1, v1, La/vh0;->f:J

    .line 132
    .line 133
    new-instance v3, Ljava/lang/Long;

    .line 134
    .line 135
    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_6

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_7
    return-object p1
.end method
