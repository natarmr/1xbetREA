.class public final La/etw;
.super La/ir20;
.source "SourceFile"


# instance fields
.field public final f:La/y78;

.field public final g:Lkotlin/text/Regex;


# direct methods
.method public constructor <init>(La/v9d;La/y78;Lkotlin/text/Regex;La/k810;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/y78;

    .line 5
    .line 6
    invoke-direct {v0, p2}, La/y78;-><init>(La/y78;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0, p1}, La/ir20;-><init>(La/y78;La/v9d;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, La/etw;->f:La/y78;

    .line 13
    .line 14
    iput-object p3, p0, La/etw;->g:Lkotlin/text/Regex;

    .line 15
    .line 16
    new-instance p0, La/sgi0;

    .line 17
    .line 18
    new-instance p1, Lkotlin/ranges/IntRange;

    .line 19
    .line 20
    iget p3, p4, La/k810;->c:I

    .line 21
    .line 22
    invoke-virtual {p4}, La/k810;->c()I

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-direct {p1, p3, p4, v0}, Lkotlin/ranges/a;-><init>(III)V

    .line 28
    .line 29
    .line 30
    sget-object p3, La/cy2;->A:La/ar20;

    .line 31
    .line 32
    invoke-direct {p0, p1, p3}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p2, p0}, La/y78;->b(Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
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
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p2, La/k810;->b:I

    .line 5
    .line 6
    iget-object v0, p2, La/k810;->d:Ljava/lang/CharSequence;

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
    iget v2, p2, La/k810;->a:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    if-lez v2, :cond_1

    .line 19
    .line 20
    iget-object v5, p2, La/k810;->e:La/gxu;

    .line 21
    .line 22
    iget-object v5, v5, La/gxu;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Ljava/util/ArrayList;

    .line 25
    .line 26
    sub-int/2addr v2, v4

    .line 27
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/CharSequence;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v2, v3

    .line 35
    :goto_0
    if-nez v2, :cond_2

    .line 36
    .line 37
    sget-object p0, La/hr20;->f:La/hr20;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    iget-object v5, p0, La/ir20;->a:La/v9d;

    .line 41
    .line 42
    invoke-virtual {v5, p2}, La/v9d;->b(La/k810;)La/v9d;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-static {v6, v5}, La/idx;->w(La/v9d;La/v9d;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-nez v7, :cond_3

    .line 51
    .line 52
    sget-object p0, La/hr20;->f:La/hr20;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    iget-object v7, p0, La/etw;->g:Lkotlin/text/Regex;

    .line 56
    .line 57
    if-nez v7, :cond_8

    .line 58
    .line 59
    if-ne p1, v1, :cond_7

    .line 60
    .line 61
    new-instance p1, La/s43;

    .line 62
    .line 63
    const/16 v1, 0xa

    .line 64
    .line 65
    invoke-direct {p1, v5, v1}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    move-object v1, p2

    .line 69
    move v5, v4

    .line 70
    :cond_4
    invoke-virtual {p1, v1}, La/s43;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    check-cast v8, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-eqz v8, :cond_6

    .line 81
    .line 82
    invoke-virtual {v1}, La/k810;->d()La/k810;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-nez v1, :cond_5

    .line 87
    .line 88
    add-int/lit8 v5, v5, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 92
    .line 93
    const/4 v8, 0x4

    .line 94
    if-le v5, v8, :cond_4

    .line 95
    .line 96
    :cond_6
    :goto_1
    const/4 p1, 0x2

    .line 97
    if-lt v5, p1, :cond_8

    .line 98
    .line 99
    sget-object p0, La/hr20;->f:La/hr20;

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_7
    new-instance p0, La/byw;

    .line 103
    .line 104
    const-string p1, ""

    .line 105
    .line 106
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p0

    .line 110
    :cond_8
    if-eqz v7, :cond_9

    .line 111
    .line 112
    sget-object p1, Lkotlin/text/Regex;->b:La/lse0;

    .line 113
    .line 114
    invoke-virtual {v7, v2}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;)La/bh30;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    :cond_9
    if-eqz v3, :cond_a

    .line 119
    .line 120
    sget-object p0, La/hr20;->f:La/hr20;

    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_a
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-static {v6, v0}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-le p1, v1, :cond_b

    .line 132
    .line 133
    new-instance p1, La/sgi0;

    .line 134
    .line 135
    new-instance v1, Lkotlin/ranges/IntRange;

    .line 136
    .line 137
    iget v2, p2, La/k810;->c:I

    .line 138
    .line 139
    add-int/2addr v2, v4

    .line 140
    invoke-static {v6, v0}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    add-int/2addr v0, v2

    .line 145
    invoke-virtual {p2}, La/k810;->c()I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    invoke-direct {v1, v0, p2, v4}, Lkotlin/ranges/a;-><init>(III)V

    .line 150
    .line 151
    .line 152
    sget-object p2, La/cy2;->A:La/ar20;

    .line 153
    .line 154
    invoke-direct {p1, v1, p2}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 155
    .line 156
    .line 157
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-object p0, p0, La/etw;->f:La/y78;

    .line 162
    .line 163
    invoke-virtual {p0, p1}, La/y78;->b(Ljava/util/List;)V

    .line 164
    .line 165
    .line 166
    :cond_b
    sget-object p0, La/hr20;->e:La/hr20;

    .line 167
    .line 168
    return-object p0
.end method

.method public final d()La/ar20;
    .locals 0

    .line 1
    sget-object p0, La/wb;->u:La/ar20;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(La/k810;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
