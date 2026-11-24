.class public final La/i1b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:La/a570;

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:La/d1b;

.field public final f:Z

.field public final g:La/hcs;

.field public final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/a570;ZZLjava/lang/String;La/d1b;ZLa/hcs;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/i1b;->a:La/a570;

    .line 17
    .line 18
    iput-boolean p2, p0, La/i1b;->b:Z

    .line 19
    .line 20
    iput-boolean p3, p0, La/i1b;->c:Z

    .line 21
    .line 22
    iput-object p4, p0, La/i1b;->d:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p5, p0, La/i1b;->e:La/d1b;

    .line 25
    .line 26
    iput-boolean p6, p0, La/i1b;->f:Z

    .line 27
    .line 28
    iput-object p7, p0, La/i1b;->g:La/hcs;

    .line 29
    .line 30
    iput-object p8, p0, La/i1b;->h:Ljava/lang/String;

    .line 31
    .line 32
    return-void
.end method

.method public static c(La/i1b;ZZ)La/i1b;
    .locals 9

    .line 1
    iget-object v1, p0, La/i1b;->a:La/a570;

    .line 2
    .line 3
    iget-object v4, p0, La/i1b;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v5, p0, La/i1b;->e:La/d1b;

    .line 6
    .line 7
    iget-boolean v6, p0, La/i1b;->f:Z

    .line 8
    .line 9
    iget-object v7, p0, La/i1b;->g:La/hcs;

    .line 10
    .line 11
    iget-object v8, p0, La/i1b;->h:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v0, La/i1b;

    .line 29
    .line 30
    move v2, p1

    .line 31
    move v3, p2

    .line 32
    invoke-direct/range {v0 .. v8}, La/i1b;-><init>(La/a570;ZZLjava/lang/String;La/d1b;ZLa/hcs;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/i1b;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/i1b;

    .line 10
    .line 11
    iget-object v0, p0, La/i1b;->a:La/a570;

    .line 12
    .line 13
    iget-object v1, p1, La/i1b;->a:La/a570;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-boolean v0, p0, La/i1b;->b:Z

    .line 23
    .line 24
    iget-boolean v1, p1, La/i1b;->b:Z

    .line 25
    .line 26
    if-ne v0, v1, :cond_6

    .line 27
    .line 28
    iget-boolean v0, p0, La/i1b;->c:Z

    .line 29
    .line 30
    iget-boolean v1, p1, La/i1b;->c:Z

    .line 31
    .line 32
    if-ne v0, v1, :cond_6

    .line 33
    .line 34
    iget-object v0, p0, La/i1b;->d:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p1, La/i1b;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget-object v0, p0, La/i1b;->e:La/d1b;

    .line 46
    .line 47
    iget-object v1, p1, La/i1b;->e:La/d1b;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, La/d1b;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    iget-boolean v0, p0, La/i1b;->f:Z

    .line 57
    .line 58
    iget-boolean v1, p1, La/i1b;->f:Z

    .line 59
    .line 60
    if-ne v0, v1, :cond_6

    .line 61
    .line 62
    iget-object v0, p0, La/i1b;->g:La/hcs;

    .line 63
    .line 64
    iget-object v1, p1, La/i1b;->g:La/hcs;

    .line 65
    .line 66
    if-ne v0, v1, :cond_6

    .line 67
    .line 68
    iget-object p0, p0, La/i1b;->h:Ljava/lang/String;

    .line 69
    .line 70
    iget-object p1, p1, La/i1b;->h:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    :goto_0
    const/4 p0, 0x1

    .line 80
    return p0

    .line 81
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 82
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p1, La/i1b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    instance-of v0, p2, La/i1b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, La/i1b;

    .line 16
    .line 17
    iget-object p0, p1, La/i1b;->a:La/a570;

    .line 18
    .line 19
    check-cast p2, La/i1b;

    .line 20
    .line 21
    iget-object p1, p2, La/i1b;->a:La/a570;

    .line 22
    .line 23
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_0
    invoke-super {p0, p1, p2}, La/p6t0;->g(La/p6t0;La/p6t0;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final h(La/p6t0;La/p6t0;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/i1b;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/i1b;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/i1b;->a:La/a570;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, La/i1b;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/i1b;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/i1b;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/i1b;->e:La/d1b;

    .line 29
    .line 30
    invoke-virtual {v2}, La/d1b;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-boolean v0, p0, La/i1b;->f:Z

    .line 37
    .line 38
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/i1b;->g:La/hcs;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object p0, p0, La/i1b;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr p0, v2

    .line 57
    return p0
.end method

.method public final o(La/p6t0;La/p6t0;)Ljava/util/Collection;
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
    instance-of p0, p1, La/i1b;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/i1b;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast p1, La/i1b;

    .line 21
    .line 22
    iget-object v0, p1, La/i1b;->a:La/a570;

    .line 23
    .line 24
    new-instance v1, La/c1b;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/c1b;-><init>(La/a570;)V

    .line 27
    .line 28
    .line 29
    check-cast p2, La/i1b;

    .line 30
    .line 31
    iget-object v0, p2, La/i1b;->a:La/a570;

    .line 32
    .line 33
    new-instance v2, La/c1b;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/c1b;-><init>(La/a570;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, La/i1b;->d:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v1, La/b1b;

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/b1b;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p2, La/i1b;->d:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v2, La/b1b;

    .line 51
    .line 52
    invoke-direct {v2, v0}, La/b1b;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p1, La/i1b;->e:La/d1b;

    .line 59
    .line 60
    iget-object v1, p2, La/i1b;->e:La/d1b;

    .line 61
    .line 62
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-boolean v0, p1, La/i1b;->b:Z

    .line 66
    .line 67
    new-instance v1, La/e1b;

    .line 68
    .line 69
    invoke-direct {v1, v0}, La/e1b;-><init>(Z)V

    .line 70
    .line 71
    .line 72
    iget-boolean v0, p2, La/i1b;->b:Z

    .line 73
    .line 74
    new-instance v2, La/e1b;

    .line 75
    .line 76
    invoke-direct {v2, v0}, La/e1b;-><init>(Z)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-boolean v0, p1, La/i1b;->c:Z

    .line 83
    .line 84
    new-instance v1, La/f1b;

    .line 85
    .line 86
    invoke-direct {v1, v0}, La/f1b;-><init>(Z)V

    .line 87
    .line 88
    .line 89
    iget-boolean v0, p2, La/i1b;->c:Z

    .line 90
    .line 91
    new-instance v2, La/f1b;

    .line 92
    .line 93
    invoke-direct {v2, v0}, La/f1b;-><init>(Z)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-boolean v0, p1, La/i1b;->f:Z

    .line 100
    .line 101
    new-instance v1, La/z0b;

    .line 102
    .line 103
    invoke-direct {v1, v0}, La/z0b;-><init>(Z)V

    .line 104
    .line 105
    .line 106
    iget-boolean v0, p2, La/i1b;->f:Z

    .line 107
    .line 108
    new-instance v2, La/z0b;

    .line 109
    .line 110
    invoke-direct {v2, v0}, La/z0b;-><init>(Z)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, La/i1b;->g:La/hcs;

    .line 117
    .line 118
    new-instance v1, La/a1b;

    .line 119
    .line 120
    invoke-direct {v1, v0}, La/a1b;-><init>(La/hcs;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p2, La/i1b;->g:La/hcs;

    .line 124
    .line 125
    new-instance v2, La/a1b;

    .line 126
    .line 127
    invoke-direct {v2, v0}, La/a1b;-><init>(La/hcs;)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p1, La/i1b;->h:Ljava/lang/String;

    .line 134
    .line 135
    new-instance v0, La/g1b;

    .line 136
    .line 137
    invoke-direct {v0, p1}, La/g1b;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p2, La/i1b;->h:Ljava/lang/String;

    .line 141
    .line 142
    new-instance p2, La/g1b;

    .line 143
    .line 144
    invoke-direct {p2, p1}, La/g1b;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-nez p1, :cond_0

    .line 155
    .line 156
    return-object p0

    .line 157
    :cond_0
    const/4 p0, 0x0

    .line 158
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GameType(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/i1b;->a:La/a570;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ")"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-boolean v2, p0, La/i1b;->b:Z

    .line 23
    .line 24
    const-string v3, "IsCheckable(value="

    .line 25
    .line 26
    invoke-static {v3, v1, v2}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-boolean v3, p0, La/i1b;->c:Z

    .line 31
    .line 32
    const-string v4, "IsChecked(value="

    .line 33
    .line 34
    invoke-static {v4, v1, v3}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v4, p0, La/i1b;->d:Ljava/lang/String;

    .line 39
    .line 40
    const-string v5, "GameName(value="

    .line 41
    .line 42
    invoke-static {v5, v4, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    iget-boolean v5, p0, La/i1b;->f:Z

    .line 47
    .line 48
    const-string v6, "DemoAvailable(value="

    .line 49
    .line 50
    invoke-static {v6, v1, v5}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v7, "GameFlag(value="

    .line 57
    .line 58
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v7, p0, La/i1b;->g:La/hcs;

    .line 62
    .line 63
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    iget-object v7, p0, La/i1b;->h:Ljava/lang/String;

    .line 74
    .line 75
    const-string v8, "MaxCoef(value="

    .line 76
    .line 77
    invoke-static {v8, v7, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    const-string v8, ", isCheckable="

    .line 82
    .line 83
    const-string v9, ", isChecked="

    .line 84
    .line 85
    const-string v10, "CashbackUiItem(gameType="

    .line 86
    .line 87
    invoke-static {v10, v0, v8, v2, v9}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v2, ", gameName="

    .line 92
    .line 93
    const-string v8, ", imageUrl="

    .line 94
    .line 95
    invoke-static {v0, v3, v2, v4, v8}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/i1b;->e:La/d1b;

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p0, ", demoAvailable="

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p0, ", gameFlag="

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string p0, ", maxCoef="

    .line 117
    .line 118
    invoke-static {v0, v6, p0, v7, v1}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0
.end method
