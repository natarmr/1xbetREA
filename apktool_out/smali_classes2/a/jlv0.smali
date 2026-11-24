.class public final La/jlv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/b9a0;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:D

.field public final i:D

.field public final j:D

.field public final k:D

.field public final l:D

.field public final m:I

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/b9a0;->g:La/b9a0;

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(La/b9a0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIDDDDDILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/jlv0;->a:La/b9a0;

    .line 8
    .line 9
    iput-object p2, p0, La/jlv0;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/jlv0;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/jlv0;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput p5, p0, La/jlv0;->e:I

    .line 16
    .line 17
    iput p6, p0, La/jlv0;->f:I

    .line 18
    .line 19
    iput p7, p0, La/jlv0;->g:I

    .line 20
    .line 21
    iput-wide p8, p0, La/jlv0;->h:D

    .line 22
    .line 23
    iput-wide p10, p0, La/jlv0;->i:D

    .line 24
    .line 25
    iput-wide p12, p0, La/jlv0;->j:D

    .line 26
    .line 27
    iput-wide p14, p0, La/jlv0;->k:D

    .line 28
    .line 29
    move-wide/from16 p1, p16

    .line 30
    .line 31
    iput-wide p1, p0, La/jlv0;->l:D

    .line 32
    .line 33
    move/from16 p1, p18

    .line 34
    .line 35
    iput p1, p0, La/jlv0;->m:I

    .line 36
    .line 37
    move-object/from16 p1, p19

    .line 38
    .line 39
    iput-object p1, p0, La/jlv0;->n:Ljava/lang/String;

    .line 40
    .line 41
    move-object/from16 p1, p20

    .line 42
    .line 43
    iput-object p1, p0, La/jlv0;->o:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
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
    instance-of v0, p1, La/jlv0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/jlv0;

    .line 12
    .line 13
    iget-object v0, p0, La/jlv0;->a:La/b9a0;

    .line 14
    .line 15
    iget-object v1, p1, La/jlv0;->a:La/b9a0;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/jlv0;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, La/jlv0;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, La/jlv0;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/jlv0;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, La/jlv0;->d:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, La/jlv0;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_5
    iget v0, p0, La/jlv0;->e:I

    .line 62
    .line 63
    iget v1, p1, La/jlv0;->e:I

    .line 64
    .line 65
    if-eq v0, v1, :cond_6

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_6
    iget v0, p0, La/jlv0;->f:I

    .line 70
    .line 71
    iget v1, p1, La/jlv0;->f:I

    .line 72
    .line 73
    if-eq v0, v1, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget v0, p0, La/jlv0;->g:I

    .line 77
    .line 78
    iget v1, p1, La/jlv0;->g:I

    .line 79
    .line 80
    if-eq v0, v1, :cond_8

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_8
    iget-wide v0, p0, La/jlv0;->h:D

    .line 84
    .line 85
    iget-wide v2, p1, La/jlv0;->h:D

    .line 86
    .line 87
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-wide v0, p0, La/jlv0;->i:D

    .line 95
    .line 96
    iget-wide v2, p1, La/jlv0;->i:D

    .line 97
    .line 98
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_a
    iget-wide v0, p0, La/jlv0;->j:D

    .line 106
    .line 107
    iget-wide v2, p1, La/jlv0;->j:D

    .line 108
    .line 109
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_b

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_b
    iget-wide v0, p0, La/jlv0;->k:D

    .line 117
    .line 118
    iget-wide v2, p1, La/jlv0;->k:D

    .line 119
    .line 120
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_c

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_c
    iget-wide v0, p0, La/jlv0;->l:D

    .line 128
    .line 129
    iget-wide v2, p1, La/jlv0;->l:D

    .line 130
    .line 131
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_d

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_d
    iget v0, p0, La/jlv0;->m:I

    .line 139
    .line 140
    iget v1, p1, La/jlv0;->m:I

    .line 141
    .line 142
    if-eq v0, v1, :cond_e

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_e
    iget-object v0, p0, La/jlv0;->n:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v1, p1, La/jlv0;->n:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_f

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_f
    iget-object p0, p0, La/jlv0;->o:Ljava/lang/String;

    .line 157
    .line 158
    iget-object p1, p1, La/jlv0;->o:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-nez p0, :cond_10

    .line 165
    .line 166
    :goto_0
    const/4 p0, 0x0

    .line 167
    return p0

    .line 168
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 169
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/jlv0;->a:La/b9a0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/b9a0;->hashCode()I

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
    iget-object v2, p0, La/jlv0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/jlv0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/jlv0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/jlv0;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/jlv0;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/jlv0;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/jlv0;->h:D

    .line 47
    .line 48
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, La/jlv0;->i:D

    .line 53
    .line 54
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-wide v2, p0, La/jlv0;->j:D

    .line 59
    .line 60
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-wide v2, p0, La/jlv0;->k:D

    .line 65
    .line 66
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-wide v2, p0, La/jlv0;->l:D

    .line 71
    .line 72
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, La/jlv0;->m:I

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/jlv0;->n:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object p0, p0, La/jlv0;->o:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    add-int/2addr p0, v0

    .line 95
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "WinterGameResultModel(player="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/jlv0;->a:La/b9a0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", position="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/jlv0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", totalTime="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", diffTime="

    .line 29
    .line 30
    const-string v2, ", shooting1="

    .line 31
    .line 32
    iget-object v3, p0, La/jlv0;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, La/jlv0;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", shooting2="

    .line 40
    .line 41
    const-string v2, ", diffCircle="

    .line 42
    .line 43
    iget v3, p0, La/jlv0;->e:I

    .line 44
    .line 45
    iget v4, p0, La/jlv0;->f:I

    .line 46
    .line 47
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 48
    .line 49
    .line 50
    iget v1, p0, La/jlv0;->g:I

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", totalScore="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-wide v1, p0, La/jlv0;->h:D

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", run1Meters="

    .line 66
    .line 67
    const-string v2, ", run2Meters="

    .line 68
    .line 69
    iget-wide v3, p0, La/jlv0;->i:D

    .line 70
    .line 71
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-wide v1, p0, La/jlv0;->j:D

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", score1="

    .line 80
    .line 81
    const-string v2, ", score2="

    .line 82
    .line 83
    iget-wide v3, p0, La/jlv0;->k:D

    .line 84
    .line 85
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v1, ", jumps="

    .line 89
    .line 90
    iget-wide v2, p0, La/jlv0;->l:D

    .line 91
    .line 92
    iget v4, p0, La/jlv0;->m:I

    .line 93
    .line 94
    invoke-static {v0, v2, v3, v1, v4}, La/rz4;->w(Ljava/lang/StringBuilder;DLjava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    const-string v1, ", run1Time="

    .line 98
    .line 99
    const-string v2, ", run2Time="

    .line 100
    .line 101
    iget-object v3, p0, La/jlv0;->n:Ljava/lang/String;

    .line 102
    .line 103
    iget-object p0, p0, La/jlv0;->o:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v0, v1, v3, v2, p0}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string p0, ")"

    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method
