.class public final La/zxc;
.super La/ir20;
.source "SourceFile"


# instance fields
.field public final f:La/y78;

.field public final g:Lkotlin/text/Regex;

.field public h:I


# direct methods
.method public constructor <init>(La/v9d;La/y78;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/y78;

    .line 8
    .line 9
    invoke-direct {v0, p2}, La/y78;-><init>(La/y78;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0, p1}, La/ir20;-><init>(La/y78;La/v9d;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, La/zxc;->f:La/y78;

    .line 16
    .line 17
    new-instance p1, Lkotlin/text/Regex;

    .line 18
    .line 19
    const-string p2, "^ {0,3}"

    .line 20
    .line 21
    const-string v0, "+ *$"

    .line 22
    .line 23
    invoke-static {p2, p3, v0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p1, p2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/zxc;->g:Lkotlin/text/Regex;

    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    iput p1, p0, La/zxc;->h:I

    .line 34
    .line 35
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
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p2, La/k810;->c:I

    .line 5
    .line 6
    iget-object v0, p2, La/k810;->d:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iget v1, p0, La/zxc;->h:I

    .line 9
    .line 10
    if-ge p1, v1, :cond_0

    .line 11
    .line 12
    sget-object p0, La/hr20;->e:La/hr20;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget v1, p2, La/k810;->b:I

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    sget-object p0, La/hr20;->e:La/hr20;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    if-ne v1, v2, :cond_5

    .line 24
    .line 25
    iget-object v1, p0, La/ir20;->a:La/v9d;

    .line 26
    .line 27
    invoke-virtual {v1, p2}, La/v9d;->b(La/k810;)La/v9d;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2, v1}, La/idx;->w(La/v9d;La/v9d;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    sget-object p0, La/hr20;->f:La/hr20;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    invoke-virtual {p2}, La/k810;->c()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput v1, p0, La/zxc;->h:I

    .line 45
    .line 46
    invoke-static {v2, v0}, La/idx;->v(La/v9d;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iget-object v4, p0, La/zxc;->g:Lkotlin/text/Regex;

    .line 51
    .line 52
    invoke-virtual {v4, v3}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iget-object v4, p0, La/zxc;->f:La/y78;

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    new-instance v0, La/sgi0;

    .line 62
    .line 63
    new-instance v2, Lkotlin/ranges/IntRange;

    .line 64
    .line 65
    add-int/2addr p1, v5

    .line 66
    invoke-virtual {p2}, La/k810;->c()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-direct {v2, p1, p2, v5}, Lkotlin/ranges/a;-><init>(III)V

    .line 71
    .line 72
    .line 73
    sget-object p1, La/cy2;->d0:La/ar20;

    .line 74
    .line 75
    invoke-direct {v0, v2, p1}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v4, p1}, La/y78;->b(Ljava/util/List;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, La/hr20;->f:La/hr20;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iput v1, p0, La/ir20;->c:I

    .line 91
    .line 92
    iput-object p1, p0, La/ir20;->d:La/hr20;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    new-instance p0, Lkotlin/ranges/IntRange;

    .line 96
    .line 97
    add-int/2addr p1, v5

    .line 98
    invoke-static {v2, v0}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    add-int/2addr p2, p1

    .line 103
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-direct {p0, p1, v1, v5}, Lkotlin/ranges/a;-><init>(III)V

    .line 108
    .line 109
    .line 110
    iget p2, p0, Lkotlin/ranges/a;->b:I

    .line 111
    .line 112
    if-ge p1, p2, :cond_4

    .line 113
    .line 114
    new-instance p1, La/sgi0;

    .line 115
    .line 116
    sget-object p2, La/cy2;->c0:La/ar20;

    .line 117
    .line 118
    invoke-direct {p1, p0, p2}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {v4, p0}, La/y78;->b(Ljava/util/List;)V

    .line 126
    .line 127
    .line 128
    :cond_4
    :goto_0
    sget-object p0, La/hr20;->e:La/hr20;

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_5
    new-instance p0, La/byw;

    .line 132
    .line 133
    const-string p1, ""

    .line 134
    .line 135
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p0
.end method

.method public final d()La/ar20;
    .locals 0

    .line 1
    sget-object p0, La/wb;->r:La/ar20;

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
