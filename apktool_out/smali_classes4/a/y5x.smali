.class public final La/y5x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;
.implements La/s0h;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/lang/String;

.field public final d:La/m5x;

.field public final e:La/m5x;

.field public final f:Z

.field public final g:La/wnq0;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;La/m5x;La/m5x;ZLa/wnq0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y5x;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, La/y5x;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput-object p3, p0, La/y5x;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, La/y5x;->d:La/m5x;

    .line 11
    .line 12
    iput-object p5, p0, La/y5x;->e:La/m5x;

    .line 13
    .line 14
    iput-boolean p6, p0, La/y5x;->f:Z

    .line 15
    .line 16
    iput-object p7, p0, La/y5x;->g:La/wnq0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/y5x;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/y5x;

    .line 11
    .line 12
    iget-object v1, p0, La/y5x;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v2, p1, La/y5x;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v1, p0, La/y5x;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v2, p1, La/y5x;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v1, p0, La/y5x;->c:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, p1, La/y5x;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget-object v1, p0, La/y5x;->d:La/m5x;

    .line 46
    .line 47
    iget-object v2, p1, La/y5x;->d:La/m5x;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, La/m5x;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_5

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    iget-object v1, p0, La/y5x;->e:La/m5x;

    .line 57
    .line 58
    iget-object v2, p1, La/y5x;->e:La/m5x;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, La/m5x;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_6

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_6
    iget-boolean v1, p0, La/y5x;->f:Z

    .line 68
    .line 69
    iget-boolean v2, p1, La/y5x;->f:Z

    .line 70
    .line 71
    if-eq v1, v2, :cond_7

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_7
    iget-object p0, p0, La/y5x;->g:La/wnq0;

    .line 75
    .line 76
    iget-object p1, p1, La/y5x;->g:La/wnq0;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, La/wnq0;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-nez p0, :cond_8

    .line 83
    .line 84
    :goto_0
    const/4 p0, 0x0

    .line 85
    return p0

    .line 86
    :cond_8
    return v0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
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
    instance-of p0, p1, La/y5x;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/y5x;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "INDIAN_POKER_KEY"

    .line 2
    .line 3
    return-object p0
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
    const v0, -0x7bf10691

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, La/y5x;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v2, 0x1f

    .line 7
    .line 8
    invoke-static {v1, v0, v2}, La/twn;->g(Ljava/util/ArrayList;II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, La/y5x;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v1, v0, v2}, La/twn;->g(Ljava/util/ArrayList;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, La/y5x;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p0, La/y5x;->d:La/m5x;

    .line 25
    .line 26
    invoke-virtual {v1}, La/m5x;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v1, v0

    .line 31
    mul-int/2addr v1, v2

    .line 32
    iget-object v0, p0, La/y5x;->e:La/m5x;

    .line 33
    .line 34
    invoke-virtual {v0}, La/m5x;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/2addr v0, v1

    .line 39
    mul-int/2addr v0, v2

    .line 40
    iget-boolean v1, p0, La/y5x;->f:Z

    .line 41
    .line 42
    invoke-static {v0, v2, v1}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object p0, p0, La/y5x;->g:La/wnq0;

    .line 47
    .line 48
    invoke-virtual {p0}, La/wnq0;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    mul-int/2addr p0, v2

    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    add-int/2addr v0, p0

    .line 60
    return v0
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
    instance-of p0, p1, La/y5x;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/y5x;

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
    check-cast p1, La/y5x;

    .line 21
    .line 22
    iget-object v0, p1, La/y5x;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v1, La/r5x;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/r5x;-><init>(Ljava/util/ArrayList;)V

    .line 27
    .line 28
    .line 29
    check-cast p2, La/y5x;

    .line 30
    .line 31
    iget-object v0, p2, La/y5x;->a:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance v2, La/r5x;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/r5x;-><init>(Ljava/util/ArrayList;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, La/y5x;->b:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v1, La/u5x;

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/u5x;-><init>(Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p2, La/y5x;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v2, La/u5x;

    .line 51
    .line 52
    invoke-direct {v2, v0}, La/u5x;-><init>(Ljava/util/ArrayList;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p1, La/y5x;->c:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v1, La/t5x;

    .line 61
    .line 62
    invoke-direct {v1, v0}, La/t5x;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p2, La/y5x;->c:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v2, La/t5x;

    .line 68
    .line 69
    invoke-direct {v2, v0}, La/t5x;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p1, La/y5x;->d:La/m5x;

    .line 76
    .line 77
    new-instance v1, La/s5x;

    .line 78
    .line 79
    invoke-direct {v1, v0}, La/s5x;-><init>(La/m5x;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p2, La/y5x;->d:La/m5x;

    .line 83
    .line 84
    new-instance v2, La/s5x;

    .line 85
    .line 86
    invoke-direct {v2, v0}, La/s5x;-><init>(La/m5x;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p1, La/y5x;->e:La/m5x;

    .line 93
    .line 94
    new-instance v1, La/v5x;

    .line 95
    .line 96
    invoke-direct {v1, v0}, La/v5x;-><init>(La/m5x;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p2, La/y5x;->e:La/m5x;

    .line 100
    .line 101
    new-instance v2, La/v5x;

    .line 102
    .line 103
    invoke-direct {v2, v0}, La/v5x;-><init>(La/m5x;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p1, La/y5x;->g:La/wnq0;

    .line 110
    .line 111
    new-instance v0, La/w5x;

    .line 112
    .line 113
    invoke-direct {v0, p1}, La/w5x;-><init>(La/wnq0;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p2, La/y5x;->g:La/wnq0;

    .line 117
    .line 118
    new-instance p2, La/w5x;

    .line 119
    .line 120
    invoke-direct {p2, p1}, La/w5x;-><init>(La/wnq0;)V

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
    .locals 9

    .line 1
    const-string v0, "FirstPlayerCards(value="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    iget-object v2, p0, La/y5x;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, La/hne;->o(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, p0, La/y5x;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    const-string v3, "SecondPlayerCards(value="

    .line 14
    .line 15
    invoke-static {v3, v1, v2}, La/hne;->o(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, La/y5x;->c:Ljava/lang/String;

    .line 20
    .line 21
    const-string v4, "MatchStatusText(value="

    .line 22
    .line 23
    invoke-static {v4, v3, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v5, "FirstPlayerCombination(value="

    .line 30
    .line 31
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v5, p0, La/y5x;->d:La/m5x;

    .line 35
    .line 36
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    new-instance v5, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v6, "SecondPlayerCombination(value="

    .line 49
    .line 50
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v6, p0, La/y5x;->e:La/m5x;

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    new-instance v6, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v7, "Timer(value="

    .line 68
    .line 69
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v7, p0, La/y5x;->g:La/wnq0;

    .line 73
    .line 74
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v6, ", secondPlayerCards="

    .line 85
    .line 86
    const-string v7, ", matchStatusText="

    .line 87
    .line 88
    const-string v8, "IndianPokerUiModel(key=INDIAN_POKER_KEY, firstPlayerCards="

    .line 89
    .line 90
    invoke-static {v8, v0, v6, v2, v7}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v2, ", firstPlayerCombination="

    .line 95
    .line 96
    const-string v6, ", secondPlayerCombination="

    .line 97
    .line 98
    invoke-static {v0, v3, v2, v4, v6}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v2, ", supportRtl="

    .line 102
    .line 103
    const-string v3, ", timerUiModel="

    .line 104
    .line 105
    iget-boolean p0, p0, La/y5x;->f:Z

    .line 106
    .line 107
    invoke-static {v5, v2, v3, v0, p0}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 108
    .line 109
    .line 110
    const-string p0, ", fixedTime=false)"

    .line 111
    .line 112
    invoke-static {v0, v1, p0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
.end method
