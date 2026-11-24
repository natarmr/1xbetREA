.class public final La/xi40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:F

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:Ljava/util/List;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIIFIIILjava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, La/xi40;->a:J

    .line 8
    .line 9
    iput-object p3, p0, La/xi40;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p4, p0, La/xi40;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p5, p0, La/xi40;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p6, p0, La/xi40;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p7, p0, La/xi40;->f:J

    .line 18
    .line 19
    iput p9, p0, La/xi40;->g:I

    .line 20
    .line 21
    iput p10, p0, La/xi40;->h:I

    .line 22
    .line 23
    iput p11, p0, La/xi40;->i:I

    .line 24
    .line 25
    iput p12, p0, La/xi40;->j:F

    .line 26
    .line 27
    iput p13, p0, La/xi40;->k:I

    .line 28
    .line 29
    iput p14, p0, La/xi40;->l:I

    .line 30
    .line 31
    iput p15, p0, La/xi40;->m:I

    .line 32
    .line 33
    move-object/from16 p1, p16

    .line 34
    .line 35
    iput-object p1, p0, La/xi40;->n:Ljava/util/List;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    iget-wide v0, p0, La/xi40;->f:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-gtz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/xi40;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/xi40;

    .line 12
    .line 13
    iget-wide v0, p0, La/xi40;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/xi40;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, La/xi40;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, La/xi40;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_3
    iget-object v0, p0, La/xi40;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p1, La/xi40;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_4
    iget-object v0, p0, La/xi40;->d:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v1, p1, La/xi40;->d:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    iget-object v0, p0, La/xi40;->e:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, p1, La/xi40;->e:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_6
    iget-wide v0, p0, La/xi40;->f:J

    .line 70
    .line 71
    iget-wide v2, p1, La/xi40;->f:J

    .line 72
    .line 73
    cmp-long v0, v0, v2

    .line 74
    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_7
    iget v0, p0, La/xi40;->g:I

    .line 79
    .line 80
    iget v1, p1, La/xi40;->g:I

    .line 81
    .line 82
    if-eq v0, v1, :cond_8

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_8
    iget v0, p0, La/xi40;->h:I

    .line 86
    .line 87
    iget v1, p1, La/xi40;->h:I

    .line 88
    .line 89
    if-eq v0, v1, :cond_9

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_9
    iget v0, p0, La/xi40;->i:I

    .line 93
    .line 94
    iget v1, p1, La/xi40;->i:I

    .line 95
    .line 96
    if-eq v0, v1, :cond_a

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_a
    iget v0, p0, La/xi40;->j:F

    .line 100
    .line 101
    iget v1, p1, La/xi40;->j:F

    .line 102
    .line 103
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_b

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_b
    iget v0, p0, La/xi40;->k:I

    .line 111
    .line 112
    iget v1, p1, La/xi40;->k:I

    .line 113
    .line 114
    if-eq v0, v1, :cond_c

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_c
    iget v0, p0, La/xi40;->l:I

    .line 118
    .line 119
    iget v1, p1, La/xi40;->l:I

    .line 120
    .line 121
    if-eq v0, v1, :cond_d

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_d
    iget v0, p0, La/xi40;->m:I

    .line 125
    .line 126
    iget v1, p1, La/xi40;->m:I

    .line 127
    .line 128
    if-eq v0, v1, :cond_e

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_e
    iget-object p0, p0, La/xi40;->n:Ljava/util/List;

    .line 132
    .line 133
    iget-object p1, p1, La/xi40;->n:Ljava/util/List;

    .line 134
    .line 135
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-nez p0, :cond_f

    .line 140
    .line 141
    :goto_0
    const/4 p0, 0x0

    .line 142
    return p0

    .line 143
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 144
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/xi40;->a:J

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
    iget-object v2, p0, La/xi40;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/xi40;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/xi40;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/xi40;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/xi40;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/xi40;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/xi40;->h:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, La/xi40;->i:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, La/xi40;->j:F

    .line 59
    .line 60
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, La/xi40;->k:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v2, p0, La/xi40;->l:I

    .line 71
    .line 72
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, La/xi40;->m:I

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object p0, p0, La/xi40;->n:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    add-int/2addr p0, v0

    .line 89
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "MlbbHeroModel(heroId="

    .line 2
    .line 3
    const-string v1, ", heroName="

    .line 4
    .line 5
    iget-wide v2, p0, La/xi40;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/xi40;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", heroImage="

    .line 14
    .line 15
    const-string v2, ", heroBwImage="

    .line 16
    .line 17
    iget-object v3, p0, La/xi40;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v4, p0, La/xi40;->d:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", playerName="

    .line 25
    .line 26
    const-string v2, ", respawnTimer="

    .line 27
    .line 28
    iget-object v3, p0, La/xi40;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v3, v2}, La/hne;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v1, ", positionX="

    .line 34
    .line 35
    iget-wide v2, p0, La/xi40;->f:J

    .line 36
    .line 37
    iget v4, p0, La/xi40;->g:I

    .line 38
    .line 39
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", positionY="

    .line 43
    .line 44
    const-string v2, ", level="

    .line 45
    .line 46
    iget v3, p0, La/xi40;->h:I

    .line 47
    .line 48
    iget v4, p0, La/xi40;->i:I

    .line 49
    .line 50
    invoke-static {v3, v4, v1, v2, v0}, La/rw2;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 51
    .line 52
    .line 53
    const-string v1, ", gold="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, La/xi40;->j:F

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", kills="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v1, p0, La/xi40;->k:I

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", deaths="

    .line 74
    .line 75
    const-string v2, ", assists="

    .line 76
    .line 77
    iget v3, p0, La/xi40;->l:I

    .line 78
    .line 79
    iget v4, p0, La/xi40;->m:I

    .line 80
    .line 81
    invoke-static {v3, v4, v1, v2, v0}, La/rw2;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 82
    .line 83
    .line 84
    const-string v1, ", items="

    .line 85
    .line 86
    const-string v2, ")"

    .line 87
    .line 88
    iget-object p0, p0, La/xi40;->n:Ljava/util/List;

    .line 89
    .line 90
    invoke-static {v0, v1, p0, v2}, La/ohs0;->s(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method
