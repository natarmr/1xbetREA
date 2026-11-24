.class public final La/ptc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:La/zuc0;

.field public final b:La/gtc0;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:La/o0x;

.field public final f:La/o0x;

.field public final g:La/o0x;


# direct methods
.method public constructor <init>(La/zuc0;La/gtc0;Ljava/lang/String;La/o0x;La/itc0;)V
    .locals 2

    .line 1
    iget v0, p2, La/gtc0;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, La/j0x;->y(Z)La/m0x;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object p5, p5, La/itc0;->a:La/o0x;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/ptc0;->a:La/zuc0;

    .line 20
    .line 21
    iput-object p2, p0, La/ptc0;->b:La/gtc0;

    .line 22
    .line 23
    iput-object p3, p0, La/ptc0;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput v0, p0, La/ptc0;->d:I

    .line 26
    .line 27
    iput-object p4, p0, La/ptc0;->e:La/o0x;

    .line 28
    .line 29
    iput-object p5, p0, La/ptc0;->f:La/o0x;

    .line 30
    .line 31
    iput-object v1, p0, La/ptc0;->g:La/o0x;

    .line 32
    .line 33
    return-void
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
    instance-of v0, p1, La/ptc0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/ptc0;

    .line 10
    .line 11
    iget-object v0, p0, La/ptc0;->a:La/zuc0;

    .line 12
    .line 13
    iget-object v1, p1, La/ptc0;->a:La/zuc0;

    .line 14
    .line 15
    if-ne v0, v1, :cond_6

    .line 16
    .line 17
    iget-object v0, p0, La/ptc0;->b:La/gtc0;

    .line 18
    .line 19
    iget-object v1, p1, La/ptc0;->b:La/gtc0;

    .line 20
    .line 21
    if-ne v0, v1, :cond_6

    .line 22
    .line 23
    iget-object v0, p0, La/ptc0;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, La/ptc0;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget v0, p0, La/ptc0;->d:I

    .line 35
    .line 36
    iget v1, p1, La/ptc0;->d:I

    .line 37
    .line 38
    if-ne v0, v1, :cond_6

    .line 39
    .line 40
    iget-object v0, p0, La/ptc0;->e:La/o0x;

    .line 41
    .line 42
    iget-object v1, p1, La/ptc0;->e:La/o0x;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    iget-object v0, p0, La/ptc0;->f:La/o0x;

    .line 52
    .line 53
    iget-object v1, p1, La/ptc0;->f:La/o0x;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    iget-object p0, p0, La/ptc0;->g:La/o0x;

    .line 63
    .line 64
    iget-object p1, p1, La/ptc0;->g:La/o0x;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_5

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_5
    :goto_0
    const/4 p0, 0x1

    .line 74
    return p0

    .line 75
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 76
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2}, La/axq;->f(La/p6t0;La/p6t0;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final h(La/p6t0;La/p6t0;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2, p1, p2}, La/rw2;->y(La/p6t0;La/p6t0;La/p6t0;La/p6t0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/ptc0;->a:La/zuc0;

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
    iget-object v2, p0, La/ptc0;->b:La/gtc0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/ptc0;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, La/ptc0;->d:I

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/ptc0;->e:La/o0x;

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, La/w6x;->d(La/o0x;II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/ptc0;->f:La/o0x;

    .line 37
    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    :goto_0
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object p0, p0, La/ptc0;->g:La/o0x;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/2addr p0, v2

    .line 55
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
    instance-of p0, p1, La/ptc0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/ptc0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast p1, La/ptc0;

    .line 21
    .line 22
    iget-object v0, p1, La/ptc0;->a:La/zuc0;

    .line 23
    .line 24
    new-instance v1, La/ktc0;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/ktc0;-><init>(La/zuc0;)V

    .line 27
    .line 28
    .line 29
    check-cast p2, La/ptc0;

    .line 30
    .line 31
    iget-object v0, p2, La/ptc0;->a:La/zuc0;

    .line 32
    .line 33
    new-instance v2, La/ktc0;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/ktc0;-><init>(La/zuc0;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, La/ptc0;->b:La/gtc0;

    .line 42
    .line 43
    new-instance v1, La/ntc0;

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/ntc0;-><init>(La/gtc0;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p2, La/ptc0;->b:La/gtc0;

    .line 49
    .line 50
    new-instance v2, La/ntc0;

    .line 51
    .line 52
    invoke-direct {v2, v0}, La/ntc0;-><init>(La/gtc0;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p1, La/ptc0;->c:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v1, La/ltc0;

    .line 61
    .line 62
    invoke-direct {v1, v0}, La/ltc0;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p2, La/ptc0;->c:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v2, La/ltc0;

    .line 68
    .line 69
    invoke-direct {v2, v0}, La/ltc0;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget v0, p1, La/ptc0;->d:I

    .line 76
    .line 77
    new-instance v1, La/mtc0;

    .line 78
    .line 79
    invoke-direct {v1, v0}, La/mtc0;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iget v0, p2, La/ptc0;->d:I

    .line 83
    .line 84
    new-instance v2, La/mtc0;

    .line 85
    .line 86
    invoke-direct {v2, v0}, La/mtc0;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p1, La/ptc0;->e:La/o0x;

    .line 93
    .line 94
    new-instance v1, La/jtc0;

    .line 95
    .line 96
    invoke-direct {v1, v0}, La/jtc0;-><init>(La/o0x;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p2, La/ptc0;->e:La/o0x;

    .line 100
    .line 101
    new-instance v2, La/jtc0;

    .line 102
    .line 103
    invoke-direct {v2, v0}, La/jtc0;-><init>(La/o0x;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p1, La/ptc0;->f:La/o0x;

    .line 110
    .line 111
    new-instance v0, La/itc0;

    .line 112
    .line 113
    invoke-direct {v0, p1}, La/itc0;-><init>(La/o0x;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p2, La/ptc0;->f:La/o0x;

    .line 117
    .line 118
    new-instance p2, La/itc0;

    .line 119
    .line 120
    invoke-direct {p2, p1}, La/itc0;-><init>(La/o0x;)V

    .line 121
    .line 122
    .line 123
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-nez p1, :cond_0

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_0
    const/4 p0, 0x0

    .line 134
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Style(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ptc0;->a:La/zuc0;

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
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v3, "Type(value="

    .line 25
    .line 26
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, La/ptc0;->b:La/gtc0;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v3, p0, La/ptc0;->c:Ljava/lang/String;

    .line 42
    .line 43
    const-string v4, "Subtitle(value="

    .line 44
    .line 45
    invoke-static {v4, v3, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget v4, p0, La/ptc0;->d:I

    .line 50
    .line 51
    const-string v5, "Title(value="

    .line 52
    .line 53
    invoke-static {v4, v5, v1}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    new-instance v5, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v6, "StartIcon(value="

    .line 60
    .line 61
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v6, p0, La/ptc0;->e:La/o0x;

    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    new-instance v6, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v7, "EndIcon(value="

    .line 79
    .line 80
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object v7, p0, La/ptc0;->f:La/o0x;

    .line 84
    .line 85
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    const-string v7, ", type="

    .line 96
    .line 97
    const-string v8, ", subtitle="

    .line 98
    .line 99
    const-string v9, "PromoSimpleUiItem(style="

    .line 100
    .line 101
    invoke-static {v9, v0, v7, v2, v8}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v2, ", title="

    .line 106
    .line 107
    const-string v7, ", startIcon="

    .line 108
    .line 109
    invoke-static {v0, v3, v2, v4, v7}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v2, ", endIcon="

    .line 113
    .line 114
    const-string v3, ", placeholder="

    .line 115
    .line 116
    invoke-static {v0, v5, v2, v6, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object p0, p0, La/ptc0;->g:La/o0x;

    .line 120
    .line 121
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method
