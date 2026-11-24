.class public final La/sjn;
.super La/rjn;
.source "SourceFile"


# virtual methods
.method public b(La/c9o0;La/c9o0;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p3, p0}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3, p0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 21
    .line 22
    .line 23
    instance-of p1, p4, Landroid/view/ViewGroup;

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    move-object p2, p4

    .line 29
    check-cast p2, Landroid/view/ViewGroup;

    .line 30
    .line 31
    :cond_0
    if-eqz p2, :cond_2

    .line 32
    .line 33
    new-instance p1, La/ihu0;

    .line 34
    .line 35
    invoke-direct {p1, p2}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_1
    move-object p2, p1

    .line 43
    check-cast p2, La/jhu0;

    .line 44
    .line 45
    invoke-virtual {p2}, La/jhu0;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p2}, La/jhu0;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    instance-of v0, p2, Ljava/util/List;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    move-object v0, p2

    .line 66
    check-cast v0, Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v2, 0x4

    .line 73
    if-ne v1, v2, :cond_1

    .line 74
    .line 75
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    instance-of v0, v0, La/p4d;

    .line 80
    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    check-cast p2, Ljava/lang/Iterable;

    .line 84
    .line 85
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_2

    .line 94
    .line 95
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-static {p3}, La/y5a;->C(Landroid/view/Window;)V

    .line 100
    .line 101
    .line 102
    new-instance p0, La/ani0;

    .line 103
    .line 104
    invoke-direct {p0, p4}, La/ani0;-><init>(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 108
    .line 109
    const/16 p2, 0x23

    .line 110
    .line 111
    if-lt p1, p2, :cond_3

    .line 112
    .line 113
    new-instance p1, La/bjv0;

    .line 114
    .line 115
    invoke-direct {p1, p3, p0}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    const/16 p2, 0x1e

    .line 120
    .line 121
    if-lt p1, p2, :cond_4

    .line 122
    .line 123
    new-instance p1, La/ajv0;

    .line 124
    .line 125
    invoke-direct {p1, p3, p0}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    const/16 p2, 0x1a

    .line 130
    .line 131
    if-lt p1, p2, :cond_5

    .line 132
    .line 133
    new-instance p1, La/ziv0;

    .line 134
    .line 135
    invoke-direct {p1, p3, p0}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    new-instance p1, La/yiv0;

    .line 140
    .line 141
    invoke-direct {p1, p3, p0}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 142
    .line 143
    .line 144
    :goto_1
    xor-int/lit8 p0, p5, 0x1

    .line 145
    .line 146
    invoke-virtual {p1, p0}, La/ycm0;->w(Z)V

    .line 147
    .line 148
    .line 149
    xor-int/lit8 p0, p6, 0x1

    .line 150
    .line 151
    invoke-virtual {p1, p0}, La/ycm0;->v(Z)V

    .line 152
    .line 153
    .line 154
    return-void
.end method
