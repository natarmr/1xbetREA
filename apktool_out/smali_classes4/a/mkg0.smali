.class public final La/mkg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/n0x;

.field public final b:La/zig0;

.field public final c:I

.field public final d:La/njg0;

.field public final e:La/njg0;

.field public final f:La/njg0;

.field public final g:La/pjg0;

.field public final h:La/pjg0;

.field public final i:La/pjg0;

.field public final j:La/okg0;


# direct methods
.method public constructor <init>(La/n0x;La/zig0;ILa/njg0;La/njg0;La/njg0;La/pjg0;La/pjg0;La/pjg0;La/okg0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/mkg0;->a:La/n0x;

    .line 5
    .line 6
    iput-object p2, p0, La/mkg0;->b:La/zig0;

    .line 7
    .line 8
    iput p3, p0, La/mkg0;->c:I

    .line 9
    .line 10
    iput-object p4, p0, La/mkg0;->d:La/njg0;

    .line 11
    .line 12
    iput-object p5, p0, La/mkg0;->e:La/njg0;

    .line 13
    .line 14
    iput-object p6, p0, La/mkg0;->f:La/njg0;

    .line 15
    .line 16
    iput-object p7, p0, La/mkg0;->g:La/pjg0;

    .line 17
    .line 18
    iput-object p8, p0, La/mkg0;->h:La/pjg0;

    .line 19
    .line 20
    iput-object p9, p0, La/mkg0;->i:La/pjg0;

    .line 21
    .line 22
    iput-object p10, p0, La/mkg0;->j:La/okg0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/mkg0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/mkg0;

    .line 12
    .line 13
    iget-object v0, p0, La/mkg0;->a:La/n0x;

    .line 14
    .line 15
    iget-object v1, p1, La/mkg0;->a:La/n0x;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/n0x;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, La/mkg0;->b:La/zig0;

    .line 25
    .line 26
    iget-object v1, p1, La/mkg0;->b:La/zig0;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget v0, p0, La/mkg0;->c:I

    .line 36
    .line 37
    iget v1, p1, La/mkg0;->c:I

    .line 38
    .line 39
    if-eq v0, v1, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-object v0, p0, La/mkg0;->d:La/njg0;

    .line 43
    .line 44
    iget-object v1, p1, La/mkg0;->d:La/njg0;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, La/njg0;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-object v0, p0, La/mkg0;->e:La/njg0;

    .line 54
    .line 55
    iget-object v1, p1, La/mkg0;->e:La/njg0;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, La/njg0;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-object v0, p0, La/mkg0;->f:La/njg0;

    .line 65
    .line 66
    iget-object v1, p1, La/mkg0;->f:La/njg0;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/njg0;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_7

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_7
    iget-object v0, p0, La/mkg0;->g:La/pjg0;

    .line 76
    .line 77
    iget-object v1, p1, La/mkg0;->g:La/pjg0;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, La/pjg0;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_8

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_8
    iget-object v0, p0, La/mkg0;->h:La/pjg0;

    .line 87
    .line 88
    iget-object v1, p1, La/mkg0;->h:La/pjg0;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, La/pjg0;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_9

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_9
    iget-object v0, p0, La/mkg0;->i:La/pjg0;

    .line 98
    .line 99
    iget-object v1, p1, La/mkg0;->i:La/pjg0;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, La/pjg0;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_a

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_a
    iget-object p0, p0, La/mkg0;->j:La/okg0;

    .line 109
    .line 110
    iget-object p1, p1, La/mkg0;->j:La/okg0;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/okg0;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_b

    .line 117
    .line 118
    :goto_0
    const/4 p0, 0x0

    .line 119
    return p0

    .line 120
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 121
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/mkg0;->a:La/n0x;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0x;->hashCode()I

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
    iget-object v2, p0, La/mkg0;->b:La/zig0;

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
    iget v0, p0, La/mkg0;->c:I

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/mkg0;->d:La/njg0;

    .line 25
    .line 26
    invoke-virtual {v2}, La/njg0;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v2, v0

    .line 31
    mul-int/2addr v2, v1

    .line 32
    iget-object v0, p0, La/mkg0;->e:La/njg0;

    .line 33
    .line 34
    invoke-virtual {v0}, La/njg0;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/2addr v0, v2

    .line 39
    mul-int/2addr v0, v1

    .line 40
    iget-object v2, p0, La/mkg0;->f:La/njg0;

    .line 41
    .line 42
    invoke-virtual {v2}, La/njg0;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object v0, p0, La/mkg0;->g:La/pjg0;

    .line 49
    .line 50
    invoke-virtual {v0}, La/pjg0;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/2addr v0, v2

    .line 55
    mul-int/2addr v0, v1

    .line 56
    iget-object v2, p0, La/mkg0;->h:La/pjg0;

    .line 57
    .line 58
    invoke-virtual {v2}, La/pjg0;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/2addr v2, v0

    .line 63
    mul-int/2addr v2, v1

    .line 64
    iget-object v0, p0, La/mkg0;->i:La/pjg0;

    .line 65
    .line 66
    invoke-virtual {v0}, La/pjg0;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    add-int/2addr v0, v2

    .line 71
    mul-int/2addr v0, v1

    .line 72
    iget-object p0, p0, La/mkg0;->j:La/okg0;

    .line 73
    .line 74
    invoke-virtual {p0}, La/okg0;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    add-int/2addr p0, v0

    .line 79
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "RpsTableUiModel(tableImage="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/mkg0;->a:La/n0x;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", gameState="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/mkg0;->b:La/zig0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", round="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, La/mkg0;->c:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", firstPlayerHand="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/mkg0;->d:La/njg0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", secondPlayerHand="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/mkg0;->e:La/njg0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", thirdPlayerHand="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/mkg0;->f:La/njg0;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", firstPlayerInfo="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/mkg0;->g:La/pjg0;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", secondPlayerInfo="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/mkg0;->h:La/pjg0;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", thirdPlayerInfo="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, La/mkg0;->i:La/pjg0;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", winnerInfo="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/mkg0;->j:La/okg0;

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p0, ")"

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method
