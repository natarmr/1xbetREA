.class public final La/wxc;
.super La/ir20;
.source "SourceFile"


# instance fields
.field public final f:La/y78;

.field public g:I


# direct methods
.method public constructor <init>(La/v9d;La/y78;La/k810;)V
    .locals 3

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
    iput-object p2, p0, La/wxc;->f:La/y78;

    .line 13
    .line 14
    new-instance p1, La/sgi0;

    .line 15
    .line 16
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 17
    .line 18
    iget v1, p3, La/k810;->c:I

    .line 19
    .line 20
    invoke-virtual {p3}, La/k810;->c()I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v0, v1, p3, v2}, Lkotlin/ranges/a;-><init>(III)V

    .line 26
    .line 27
    .line 28
    sget-object p3, La/cy2;->y:La/ar20;

    .line 29
    .line 30
    invoke-direct {p1, v0, p3}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p2, p1}, La/y78;->b(Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, -0x1

    .line 41
    iput p1, p0, La/wxc;->g:I

    .line 42
    .line 43
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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p2, La/k810;->c:I

    .line 5
    .line 6
    iget v0, p0, La/wxc;->g:I

    .line 7
    .line 8
    iget v1, p2, La/k810;->b:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-ge p1, v0, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p2}, La/wxc;->g(La/k810;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, La/hr20;->e:La/hr20;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    if-eq v1, v2, :cond_2

    .line 22
    .line 23
    sget-object p0, La/hr20;->e:La/hr20;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    if-ne v1, v2, :cond_f

    .line 27
    .line 28
    iget-object p1, p0, La/ir20;->a:La/v9d;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v0, p2

    .line 34
    :cond_3
    const/4 v1, 0x0

    .line 35
    invoke-static {p1, v0, v1}, La/idx;->s(La/v9d;La/k810;Z)La/v9d;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2, p1}, La/idx;->X(La/v9d;La/v9d;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/16 v4, 0x9

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz v3, :cond_7

    .line 47
    .line 48
    invoke-static {v2, p1}, La/idx;->w(La/v9d;La/v9d;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_4

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    iget-object v3, v0, La/k810;->d:Ljava/lang/CharSequence;

    .line 56
    .line 57
    invoke-static {v2, v3}, La/idx;->v(La/v9d;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move v3, v1

    .line 65
    :goto_0
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-ge v3, v6, :cond_6

    .line 70
    .line 71
    invoke-interface {v2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    const/16 v7, 0x20

    .line 76
    .line 77
    if-eq v6, v7, :cond_5

    .line 78
    .line 79
    if-eq v6, v4, :cond_5

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_6
    invoke-virtual {v0}, La/k810;->d()La/k810;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    :cond_7
    :goto_1
    move-object v0, v5

    .line 92
    :goto_2
    if-nez v0, :cond_8

    .line 93
    .line 94
    sget-object p0, La/hr20;->f:La/hr20;

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_8
    invoke-static {p1, v0, v1}, La/idx;->s(La/v9d;La/k810;Z)La/v9d;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object v2, v0, La/k810;->d:Ljava/lang/CharSequence;

    .line 102
    .line 103
    invoke-static {p1, v2}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    invoke-virtual {v0, v2}, La/k810;->e(I)La/k810;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-eqz v2, :cond_e

    .line 114
    .line 115
    invoke-virtual {v2}, La/k810;->a()Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    if-eqz v3, :cond_9

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    :cond_9
    invoke-virtual {v2, v1}, La/k810;->e(I)La/k810;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-nez v1, :cond_a

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_a
    iget-object v2, v1, La/k810;->d:Ljava/lang/CharSequence;

    .line 133
    .line 134
    invoke-static {p1, v2}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iget v1, v1, La/k810;->b:I

    .line 139
    .line 140
    add-int/lit8 v3, p1, 0x4

    .line 141
    .line 142
    if-lt v1, v3, :cond_b

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_b
    if-gt p1, v1, :cond_d

    .line 146
    .line 147
    :goto_3
    invoke-interface {v2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-ne v3, v4, :cond_c

    .line 152
    .line 153
    :goto_4
    invoke-virtual {p0, p2}, La/wxc;->g(La/k810;)V

    .line 154
    .line 155
    .line 156
    iget p1, v0, La/k810;->c:I

    .line 157
    .line 158
    iput p1, p0, La/wxc;->g:I

    .line 159
    .line 160
    sget-object p0, La/hr20;->e:La/hr20;

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_c
    if-eq p1, v1, :cond_d

    .line 164
    .line 165
    add-int/lit8 p1, p1, 0x1

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_d
    sget-object p0, La/hr20;->f:La/hr20;

    .line 169
    .line 170
    return-object p0

    .line 171
    :cond_e
    :goto_5
    sget-object p0, La/hr20;->f:La/hr20;

    .line 172
    .line 173
    return-object p0

    .line 174
    :cond_f
    new-instance p0, La/byw;

    .line 175
    .line 176
    const-string p1, ""

    .line 177
    .line 178
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p0
.end method

.method public final f(La/k810;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final g(La/k810;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/ir20;->a:La/v9d;

    .line 2
    .line 3
    invoke-static {v0, p1}, La/idx;->r(La/v9d;La/k810;)La/v9d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lkotlin/ranges/IntRange;

    .line 8
    .line 9
    iget v2, p1, La/k810;->c:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    add-int/2addr v2, v3

    .line 13
    iget-object v4, p1, La/k810;->d:Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-static {v0, v4}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/2addr v0, v2

    .line 20
    invoke-virtual {p1}, La/k810;->c()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-direct {v1, v0, p1, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 25
    .line 26
    .line 27
    iget p1, v1, Lkotlin/ranges/a;->b:I

    .line 28
    .line 29
    sub-int/2addr p1, v0

    .line 30
    if-lez p1, :cond_0

    .line 31
    .line 32
    new-instance p1, La/sgi0;

    .line 33
    .line 34
    sget-object v0, La/cy2;->y:La/ar20;

    .line 35
    .line 36
    invoke-direct {p1, v1, v0}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object p0, p0, La/wxc;->f:La/y78;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, La/y78;->b(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method
