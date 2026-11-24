.class public final La/m7z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/c5n0;


# instance fields
.field public a:La/k6z;

.field public b:F

.field public c:F

.field public final synthetic d:La/r7z;


# direct methods
.method public constructor <init>(La/r7z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/m7z;->d:La/r7z;

    .line 5
    .line 6
    sget-object p1, La/k6z;->b:La/k6z;

    .line 7
    .line 8
    iput-object p1, p0, La/m7z;->a:La/k6z;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final D0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/uj30;
    .locals 9

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    and-int v1, p1, v0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    and-int/2addr v0, p2

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Size("

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " x "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    new-instance v1, La/l7z;

    .line 42
    .line 43
    iget-object v7, p0, La/m7z;->d:La/r7z;

    .line 44
    .line 45
    move-object v6, p0

    .line 46
    move v2, p1

    .line 47
    move v3, p2

    .line 48
    move-object v4, p3

    .line 49
    move-object v5, p4

    .line 50
    move-object v8, p5

    .line 51
    invoke-direct/range {v1 .. v8}, La/l7z;-><init>(IILjava/util/Map;Lkotlin/jvm/functions/Function1;La/m7z;La/r7z;Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method

.method public final M()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/m7z;->d:La/r7z;

    .line 2
    .line 3
    iget-object p0, p0, La/r7z;->a:La/e7z;

    .line 4
    .line 5
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 6
    .line 7
    iget-object p0, p0, La/i7z;->d:La/a7z;

    .line 8
    .line 9
    sget-object v0, La/a7z;->d:La/a7z;

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    sget-object v0, La/a7z;->b:La/a7z;

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    iget p0, p0, La/m7z;->b:F

    .line 2
    .line 3
    return p0
.end method

.method public final getLayoutDirection()La/k6z;
    .locals 0

    .line 1
    iget-object p0, p0, La/m7z;->a:La/k6z;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;
    .locals 9

    .line 1
    iget-object p0, p0, La/m7z;->d:La/r7z;

    .line 2
    .line 3
    invoke-virtual {p0}, La/r7z;->i()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/r7z;->a:La/e7z;

    .line 7
    .line 8
    iget-object v1, v0, La/e7z;->i1:La/i7z;

    .line 9
    .line 10
    iget-object v1, v1, La/i7z;->d:La/a7z;

    .line 11
    .line 12
    sget-object v2, La/a7z;->a:La/a7z;

    .line 13
    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    sget-object v3, La/a7z;->c:La/a7z;

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    sget-object v3, La/a7z;->b:La/a7z;

    .line 21
    .line 22
    if-eq v1, v3, :cond_1

    .line 23
    .line 24
    sget-object v3, La/a7z;->d:La/a7z;

    .line 25
    .line 26
    if-ne v1, v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v3, "subcompose can only be used inside the measure or layout blocks"

    .line 30
    .line 31
    invoke-static {v3}, La/xcx;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object v3, p0, La/r7z;->g:La/hz40;

    .line 35
    .line 36
    invoke-virtual {v3, p1}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x1

    .line 42
    if-nez v4, :cond_5

    .line 43
    .line 44
    iget-object v4, p0, La/r7z;->j:La/hz40;

    .line 45
    .line 46
    invoke-virtual {v4, p1}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, La/e7z;

    .line 51
    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    iget-object v7, p0, La/r7z;->f:La/hz40;

    .line 55
    .line 56
    invoke-virtual {v7, v4}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, La/k7z;

    .line 61
    .line 62
    iget v7, p0, La/r7z;->o:I

    .line 63
    .line 64
    if-lez v7, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const-string v7, "Check failed."

    .line 68
    .line 69
    invoke-static {v7}, La/xcx;->b(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    iget v7, p0, La/r7z;->o:I

    .line 73
    .line 74
    add-int/lit8 v7, v7, -0x1

    .line 75
    .line 76
    iput v7, p0, La/r7z;->o:I

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-virtual {p0, p1}, La/r7z;->o(Ljava/lang/Object;)La/e7z;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    if-nez v4, :cond_4

    .line 84
    .line 85
    iget v4, p0, La/r7z;->d:I

    .line 86
    .line 87
    new-instance v7, La/e7z;

    .line 88
    .line 89
    const/4 v8, 0x2

    .line 90
    invoke-direct {v7, v8}, La/e7z;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iput-boolean v6, v0, La/e7z;->r:Z

    .line 94
    .line 95
    invoke-virtual {v0, v4, v7}, La/e7z;->C(ILa/e7z;)V

    .line 96
    .line 97
    .line 98
    iput-boolean v5, v0, La/e7z;->r:Z

    .line 99
    .line 100
    move-object v4, v7

    .line 101
    :cond_4
    :goto_2
    invoke-virtual {v3, p1, v4}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    check-cast v4, La/e7z;

    .line 105
    .line 106
    invoke-virtual {v0}, La/e7z;->p()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    iget v7, p0, La/r7z;->d:I

    .line 111
    .line 112
    invoke-static {v7, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-eq v3, v4, :cond_7

    .line 117
    .line 118
    invoke-virtual {v0}, La/e7z;->p()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, La/ty40;

    .line 123
    .line 124
    iget-object v0, v0, La/ty40;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, La/xz40;

    .line 127
    .line 128
    invoke-virtual {v0, v4}, La/xz40;->i(Ljava/lang/Object;)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget v3, p0, La/r7z;->d:I

    .line 133
    .line 134
    if-lt v0, v3, :cond_6

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    new-instance v3, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v7, "Key \""

    .line 140
    .line 141
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v7, "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."

    .line 148
    .line 149
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-static {v3}, La/xcx;->a(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :goto_3
    iget v3, p0, La/r7z;->d:I

    .line 160
    .line 161
    if-eq v3, v0, :cond_7

    .line 162
    .line 163
    invoke-virtual {p0, v0, v3}, La/r7z;->k(II)V

    .line 164
    .line 165
    .line 166
    :cond_7
    iget v0, p0, La/r7z;->d:I

    .line 167
    .line 168
    add-int/2addr v0, v6

    .line 169
    iput v0, p0, La/r7z;->d:I

    .line 170
    .line 171
    invoke-virtual {p0, v4, p1, v5, p2}, La/r7z;->n(La/e7z;Ljava/lang/Object;ZLkotlin/jvm/functions/Function2;)V

    .line 172
    .line 173
    .line 174
    if-eq v1, v2, :cond_9

    .line 175
    .line 176
    sget-object p0, La/a7z;->c:La/a7z;

    .line 177
    .line 178
    if-ne v1, p0, :cond_8

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_8
    invoke-virtual {v4}, La/e7z;->m()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0

    .line 186
    :cond_9
    :goto_4
    invoke-virtual {v4}, La/e7z;->n()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0
.end method

.method public final v0()F
    .locals 0

    .line 1
    iget p0, p0, La/m7z;->c:F

    .line 2
    .line 3
    return p0
.end method
