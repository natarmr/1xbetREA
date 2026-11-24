.class public final La/crf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I


# direct methods
.method public constructor <init>(IIIIIJLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p6, p0, La/crf;->a:J

    .line 5
    .line 6
    iput-object p8, p0, La/crf;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p9, p0, La/crf;->c:Z

    .line 9
    .line 10
    iput p1, p0, La/crf;->d:I

    .line 11
    .line 12
    iput p2, p0, La/crf;->e:I

    .line 13
    .line 14
    iput p3, p0, La/crf;->f:I

    .line 15
    .line 16
    iput p4, p0, La/crf;->g:I

    .line 17
    .line 18
    iput p5, p0, La/crf;->h:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/crf;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/crf;

    .line 10
    .line 11
    iget-wide v0, p0, La/crf;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/crf;->a:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    iget-object v0, p0, La/crf;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, La/crf;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 32
    .line 33
    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    iget-boolean v0, p0, La/crf;->c:Z

    .line 40
    .line 41
    iget-boolean v1, p1, La/crf;->c:Z

    .line 42
    .line 43
    if-ne v0, v1, :cond_4

    .line 44
    .line 45
    iget v0, p0, La/crf;->d:I

    .line 46
    .line 47
    iget v1, p1, La/crf;->d:I

    .line 48
    .line 49
    if-ne v0, v1, :cond_4

    .line 50
    .line 51
    iget v0, p0, La/crf;->e:I

    .line 52
    .line 53
    iget v1, p1, La/crf;->e:I

    .line 54
    .line 55
    if-ne v0, v1, :cond_4

    .line 56
    .line 57
    iget v0, p0, La/crf;->f:I

    .line 58
    .line 59
    iget v1, p1, La/crf;->f:I

    .line 60
    .line 61
    if-ne v0, v1, :cond_4

    .line 62
    .line 63
    iget v0, p0, La/crf;->g:I

    .line 64
    .line 65
    iget v1, p1, La/crf;->g:I

    .line 66
    .line 67
    if-ne v0, v1, :cond_4

    .line 68
    .line 69
    iget p0, p0, La/crf;->h:I

    .line 70
    .line 71
    iget p1, p1, La/crf;->h:I

    .line 72
    .line 73
    if-ne p0, p1, :cond_4

    .line 74
    .line 75
    :goto_0
    const/4 p0, 0x1

    .line 76
    return p0

    .line 77
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 78
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
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
    instance-of p0, p1, La/crf;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    instance-of p0, p2, La/crf;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    check-cast p1, La/crf;

    .line 17
    .line 18
    iget-wide p0, p1, La/crf;->a:J

    .line 19
    .line 20
    check-cast p2, La/crf;

    .line 21
    .line 22
    iget-wide v1, p2, La/crf;->a:J

    .line 23
    .line 24
    cmp-long p0, p0, v1

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    return v0
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
    iget-wide v0, p0, La/crf;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-object v2, p0, La/crf;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v2, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/crf;->c:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/crf;->d:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/crf;->e:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/crf;->f:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/crf;->g:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget p0, p0, La/crf;->h:I

    .line 53
    .line 54
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr p0, v0

    .line 59
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
    instance-of p0, p1, La/crf;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/crf;

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
    check-cast p1, La/crf;

    .line 21
    .line 22
    iget-object v0, p1, La/crf;->b:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v1, La/xqf;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/xqf;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p2, La/crf;

    .line 30
    .line 31
    iget-object v0, p2, La/crf;->b:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v2, La/xqf;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/xqf;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, La/yqf;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v1, La/yqf;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-boolean v0, p1, La/crf;->c:Z

    .line 55
    .line 56
    new-instance v1, La/wqf;

    .line 57
    .line 58
    invoke-direct {v1, v0}, La/wqf;-><init>(Z)V

    .line 59
    .line 60
    .line 61
    iget-boolean v0, p2, La/crf;->c:Z

    .line 62
    .line 63
    new-instance v2, La/wqf;

    .line 64
    .line 65
    invoke-direct {v2, v0}, La/wqf;-><init>(Z)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget v0, p1, La/crf;->d:I

    .line 72
    .line 73
    new-instance v1, La/zqf;

    .line 74
    .line 75
    invoke-direct {v1, v0}, La/zqf;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iget v0, p2, La/crf;->d:I

    .line 79
    .line 80
    new-instance v2, La/zqf;

    .line 81
    .line 82
    invoke-direct {v2, v0}, La/zqf;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget v0, p1, La/crf;->e:I

    .line 89
    .line 90
    new-instance v1, La/vqf;

    .line 91
    .line 92
    invoke-direct {v1, v0}, La/vqf;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iget v0, p2, La/crf;->e:I

    .line 96
    .line 97
    new-instance v2, La/vqf;

    .line 98
    .line 99
    invoke-direct {v2, v0}, La/vqf;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget v0, p1, La/crf;->f:I

    .line 106
    .line 107
    new-instance v1, La/tqf;

    .line 108
    .line 109
    invoke-direct {v1, v0}, La/tqf;-><init>(I)V

    .line 110
    .line 111
    .line 112
    iget v0, p2, La/crf;->f:I

    .line 113
    .line 114
    new-instance v2, La/tqf;

    .line 115
    .line 116
    invoke-direct {v2, v0}, La/tqf;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget v0, p1, La/crf;->g:I

    .line 123
    .line 124
    new-instance v1, La/arf;

    .line 125
    .line 126
    invoke-direct {v1, v0}, La/arf;-><init>(I)V

    .line 127
    .line 128
    .line 129
    iget v0, p2, La/crf;->g:I

    .line 130
    .line 131
    new-instance v2, La/arf;

    .line 132
    .line 133
    invoke-direct {v2, v0}, La/arf;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget p1, p1, La/crf;->h:I

    .line 140
    .line 141
    new-instance v0, La/uqf;

    .line 142
    .line 143
    invoke-direct {v0, p1}, La/uqf;-><init>(I)V

    .line 144
    .line 145
    .line 146
    iget p1, p2, La/crf;->h:I

    .line 147
    .line 148
    new-instance p2, La/uqf;

    .line 149
    .line 150
    invoke-direct {p2, p1}, La/uqf;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-nez p1, :cond_0

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_0
    const/4 p0, 0x0

    .line 164
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "Round(value="

    .line 2
    .line 3
    iget-object v1, p0, La/crf;->b:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ")"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v1, p0, La/crf;->c:Z

    .line 12
    .line 13
    const-string v3, "MultipleThree(value="

    .line 14
    .line 15
    invoke-static {v3, v2, v1}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v3, p0, La/crf;->d:I

    .line 20
    .line 21
    const-string v4, "TerroristsWinMethodIcon(value="

    .line 22
    .line 23
    invoke-static {v3, v4, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget v4, p0, La/crf;->e:I

    .line 28
    .line 29
    const-string v5, "CounterTerroristsWinMethodIcon(value="

    .line 30
    .line 31
    invoke-static {v4, v5, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, p0, La/crf;->f:I

    .line 36
    .line 37
    const-string v6, "ColorRoundStatsIndicator(value="

    .line 38
    .line 39
    invoke-static {v5, v6, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    iget v6, p0, La/crf;->g:I

    .line 44
    .line 45
    const-string v7, "TextBackgroundColorIndicator(value="

    .line 46
    .line 47
    invoke-static {v6, v7, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget v7, p0, La/crf;->h:I

    .line 52
    .line 53
    const-string v8, "ColorRoundText(value="

    .line 54
    .line 55
    invoke-static {v7, v8, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    const-string v8, "Cs2RoundStatisticsItemUiModel(id="

    .line 60
    .line 61
    const-string v9, ", round="

    .line 62
    .line 63
    iget-wide v10, p0, La/crf;->a:J

    .line 64
    .line 65
    invoke-static {v10, v11, v8, v9, v0}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string v0, ", roundIndicatorAlpha=RoundIndicatorAlpha(value=1.0), multipleThree="

    .line 70
    .line 71
    const-string v8, ", terroristsWinMethodIcon="

    .line 72
    .line 73
    invoke-static {p0, v0, v1, v8, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v0, ", counterTerroristsWinMethodIcon="

    .line 77
    .line 78
    const-string v1, ", colorRoundStatsIndicator="

    .line 79
    .line 80
    invoke-static {p0, v0, v4, v1, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v0, ", textBackgroundColorIndicator="

    .line 84
    .line 85
    const-string v1, ", colorRoundText="

    .line 86
    .line 87
    invoke-static {p0, v0, v6, v1, v7}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method
