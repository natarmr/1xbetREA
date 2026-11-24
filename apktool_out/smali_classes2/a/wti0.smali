.class public final La/wti0;
.super La/ir20;
.source "SourceFile"


# instance fields
.field public final f:La/y78;

.field public final g:La/y78;

.field public h:La/ar20;


# direct methods
.method public constructor <init>(La/y78;La/v9d;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/y78;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/y78;-><init>(La/y78;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0, p2}, La/ir20;-><init>(La/y78;La/v9d;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/wti0;->f:La/y78;

    .line 13
    .line 14
    new-instance p2, La/y78;

    .line 15
    .line 16
    invoke-direct {p2, p1}, La/y78;-><init>(La/y78;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/wti0;->g:La/y78;

    .line 20
    .line 21
    sget-object p1, La/wb;->I:La/ar20;

    .line 22
    .line 23
    iput-object p1, p0, La/wti0;->h:La/ar20;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final b(La/k810;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, La/k810;->c()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final c(La/v9d;La/k810;)La/hr20;
    .locals 8

    .line 1
    sget-object v0, La/wb;->J:La/ar20;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget p1, p2, La/k810;->b:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-eq p1, v1, :cond_0

    .line 10
    .line 11
    sget-object p0, La/hr20;->e:La/hr20;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p1, p2, La/k810;->d:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iget-object v1, p0, La/ir20;->a:La/v9d;

    .line 17
    .line 18
    invoke-virtual {v1, p2}, La/v9d;->b(La/k810;)La/v9d;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1, p1}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ge v1, v2, :cond_2

    .line 31
    .line 32
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/16 v3, 0x20

    .line 37
    .line 38
    if-eq v2, v3, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/16 v3, 0x9

    .line 45
    .line 46
    if-ne v2, v3, :cond_2

    .line 47
    .line 48
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/4 v3, 0x1

    .line 56
    if-ne v1, v2, :cond_3

    .line 57
    .line 58
    new-instance p0, La/hr20;

    .line 59
    .line 60
    const/4 p1, 0x2

    .line 61
    invoke-direct {p0, p1, p1, v3}, La/hr20;-><init>(III)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_3
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/16 v2, 0x2d

    .line 70
    .line 71
    if-ne p1, v2, :cond_4

    .line 72
    .line 73
    iput-object v0, p0, La/wti0;->h:La/ar20;

    .line 74
    .line 75
    :cond_4
    iget p1, p2, La/k810;->c:I

    .line 76
    .line 77
    add-int/2addr p1, v3

    .line 78
    add-int/2addr p1, v1

    .line 79
    iget-object v1, p0, La/wti0;->h:La/ar20;

    .line 80
    .line 81
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    sget-object v0, La/cy2;->R:La/ar20;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    sget-object v0, La/cy2;->Q:La/ar20;

    .line 91
    .line 92
    :goto_1
    sget-object v1, La/cy2;->S:La/ar20;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, La/wti0;->g:La/y78;

    .line 98
    .line 99
    iget-object v4, v2, La/y78;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, La/y78;

    .line 102
    .line 103
    iget-object v5, v4, La/y78;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, Ljava/util/ArrayList;

    .line 106
    .line 107
    new-instance v6, La/sgi0;

    .line 108
    .line 109
    new-instance v7, Lkotlin/ranges/IntRange;

    .line 110
    .line 111
    iget v2, v2, La/y78;->b:I

    .line 112
    .line 113
    iget v4, v4, La/y78;->b:I

    .line 114
    .line 115
    invoke-direct {v7, v2, v4, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v6, v7, v1}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    new-instance v1, La/sgi0;

    .line 125
    .line 126
    new-instance v2, Lkotlin/ranges/IntRange;

    .line 127
    .line 128
    invoke-virtual {p2}, La/k810;->c()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    invoke-direct {v2, p1, v4, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 133
    .line 134
    .line 135
    invoke-direct {v1, v2, v0}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object v0, p0, La/wti0;->f:La/y78;

    .line 143
    .line 144
    invoke-virtual {v0, p1}, La/y78;->b(Ljava/util/List;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2}, La/k810;->c()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    sget-object p2, La/hr20;->f:La/hr20;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iput p1, p0, La/ir20;->c:I

    .line 157
    .line 158
    iput-object p2, p0, La/ir20;->d:La/hr20;

    .line 159
    .line 160
    sget-object p0, La/hr20;->e:La/hr20;

    .line 161
    .line 162
    return-object p0
.end method

.method public final d()La/ar20;
    .locals 0

    .line 1
    iget-object p0, p0, La/wti0;->h:La/ar20;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(La/k810;)Z
    .locals 0

    .line 1
    iget p0, p1, La/k810;->b:I

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method
