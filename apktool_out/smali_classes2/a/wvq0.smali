.class public La/wvq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final synthetic b:La/dgu;


# direct methods
.method public constructor <init>(La/dgu;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wvq0;->b:La/dgu;

    .line 5
    .line 6
    iput p2, p0, La/wvq0;->a:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()La/wvq0;
    .locals 2

    .line 1
    new-instance v0, La/wvq0;

    .line 2
    .line 3
    iget v1, p0, La/wvq0;->a:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1

    .line 6
    .line 7
    iget-object p0, p0, La/wvq0;->b:La/dgu;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/wvq0;-><init>(La/dgu;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final b(I)C
    .locals 3

    .line 1
    iget-object v0, p0, La/wvq0;->b:La/dgu;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/wvq0;->d()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {v0, p0}, La/dgu;->i(I)C

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 v1, -0x1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq p1, v1, :cond_3

    .line 17
    .line 18
    if-eq p1, v2, :cond_2

    .line 19
    .line 20
    if-lez p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1}, La/wvq0;->f(I)La/lvq0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget p0, p0, La/lvq0;->b:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    add-int/2addr p1, v2

    .line 30
    invoke-virtual {p0, p1}, La/wvq0;->f(I)La/lvq0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget p0, p0, La/lvq0;->b:I

    .line 35
    .line 36
    sub-int/2addr p0, v2

    .line 37
    :goto_0
    invoke-virtual {v0, p0}, La/dgu;->i(I)C

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_2
    invoke-virtual {p0}, La/wvq0;->c()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-virtual {v0, p0}, La/dgu;->i(I)C

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_3
    invoke-virtual {p0}, La/wvq0;->d()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    sub-int/2addr p0, v2

    .line 56
    invoke-virtual {v0, p0}, La/dgu;->i(I)C

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    return p0
.end method

.method public final c()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, La/wvq0;->f(I)La/lvq0;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget p0, p0, La/lvq0;->c:I

    .line 7
    .line 8
    return p0
.end method

.method public final d()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, La/wvq0;->f(I)La/lvq0;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget p0, p0, La/lvq0;->b:I

    .line 7
    .line 8
    return p0
.end method

.method public final e()La/ar20;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, La/wvq0;->f(I)La/lvq0;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-object p0, p0, La/lvq0;->a:La/ar20;

    .line 7
    .line 8
    return-object p0
.end method

.method public final f(I)La/lvq0;
    .locals 10

    .line 1
    iget v0, p0, La/wvq0;->a:I

    .line 2
    .line 3
    iget-object p0, p0, La/wvq0;->b:La/dgu;

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    new-instance v1, La/lvq0;

    .line 8
    .line 9
    iget-object p0, p0, La/dgu;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lkotlin/ranges/IntRange;

    .line 12
    .line 13
    iget v3, p0, Lkotlin/ranges/a;->a:I

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v4, v3

    .line 19
    invoke-direct/range {v1 .. v6}, La/lvq0;-><init>(La/ar20;IIII)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    iget-object v1, p0, La/dgu;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v2, p0, La/dgu;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    iget-object v3, p0, La/dgu;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/util/ArrayList;

    .line 34
    .line 35
    iget-object p0, p0, La/dgu;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lkotlin/ranges/IntRange;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-le v0, v1, :cond_1

    .line 44
    .line 45
    new-instance v4, La/lvq0;

    .line 46
    .line 47
    iget p0, p0, Lkotlin/ranges/a;->b:I

    .line 48
    .line 49
    add-int/lit8 v6, p0, 0x1

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    move v7, v6

    .line 55
    invoke-direct/range {v4 .. v9}, La/lvq0;-><init>(La/ar20;IIII)V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-ge v0, v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/lvq0;

    .line 70
    .line 71
    iget v0, v0, La/lvq0;->d:I

    .line 72
    .line 73
    :goto_0
    add-int/2addr v0, p1

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    goto :goto_0

    .line 80
    :goto_1
    if-gez v0, :cond_3

    .line 81
    .line 82
    new-instance v4, La/lvq0;

    .line 83
    .line 84
    iget v6, p0, Lkotlin/ranges/a;->a:I

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    const/4 v5, 0x0

    .line 89
    move v7, v6

    .line 90
    invoke-direct/range {v4 .. v9}, La/lvq0;-><init>(La/ar20;IIII)V

    .line 91
    .line 92
    .line 93
    return-object v4

    .line 94
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-lt v0, p1, :cond_4

    .line 99
    .line 100
    new-instance v4, La/lvq0;

    .line 101
    .line 102
    iget p0, p0, Lkotlin/ranges/a;->b:I

    .line 103
    .line 104
    add-int/lit8 v6, p0, 0x1

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    const/4 v9, 0x0

    .line 108
    const/4 v5, 0x0

    .line 109
    move v7, v6

    .line 110
    invoke-direct/range {v4 .. v9}, La/lvq0;-><init>(La/ar20;IIII)V

    .line 111
    .line 112
    .line 113
    return-object v4

    .line 114
    :cond_4
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, La/lvq0;

    .line 119
    .line 120
    return-object p0
.end method

.method public g()La/ar20;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, La/wvq0;->f(I)La/lvq0;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-object p0, p0, La/lvq0;->a:La/ar20;

    .line 7
    .line 8
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Iterator: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, La/wvq0;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/wvq0;->e()La/ar20;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
