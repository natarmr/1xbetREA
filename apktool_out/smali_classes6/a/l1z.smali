.class public final La/l1z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m1z;


# instance fields
.field public final a:La/t0z;

.field public final b:La/f9m0;

.field public final c:Z

.field public final d:La/n3q;

.field public final e:I

.field public final f:La/a4x;

.field public final g:La/a4x;

.field public final h:La/a4x;

.field public final i:La/csv;

.field public final j:La/mdm;


# direct methods
.method public constructor <init>(La/t0z;La/f9m0;ZLa/n3q;ILa/i4;La/a4x;La/a4x;La/csv;La/mdm;)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/l1z;->a:La/t0z;

    .line 14
    .line 15
    iput-object p2, p0, La/l1z;->b:La/f9m0;

    .line 16
    .line 17
    iput-boolean p3, p0, La/l1z;->c:Z

    .line 18
    .line 19
    iput-object p4, p0, La/l1z;->d:La/n3q;

    .line 20
    .line 21
    iput p5, p0, La/l1z;->e:I

    .line 22
    .line 23
    iput-object p6, p0, La/l1z;->f:La/a4x;

    .line 24
    .line 25
    iput-object p7, p0, La/l1z;->g:La/a4x;

    .line 26
    .line 27
    iput-object p8, p0, La/l1z;->h:La/a4x;

    .line 28
    .line 29
    iput-object p9, p0, La/l1z;->i:La/csv;

    .line 30
    .line 31
    iput-object p10, p0, La/l1z;->j:La/mdm;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/l1z;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public final b()La/t0z;
    .locals 0

    .line 1
    iget-object p0, p0, La/l1z;->a:La/t0z;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/f9m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l1z;->b:La/f9m0;

    .line 2
    .line 3
    return-object p0
.end method

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
    instance-of v0, p1, La/l1z;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/l1z;

    .line 12
    .line 13
    iget-object v0, p0, La/l1z;->a:La/t0z;

    .line 14
    .line 15
    iget-object v1, p1, La/l1z;->a:La/t0z;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/t0z;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/l1z;->b:La/f9m0;

    .line 25
    .line 26
    iget-object v1, p1, La/l1z;->b:La/f9m0;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/f9m0;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/l1z;->c:Z

    .line 36
    .line 37
    iget-boolean v1, p1, La/l1z;->c:Z

    .line 38
    .line 39
    if-eq v0, v1, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-object v0, p0, La/l1z;->d:La/n3q;

    .line 43
    .line 44
    iget-object v1, p1, La/l1z;->d:La/n3q;

    .line 45
    .line 46
    if-eq v0, v1, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget v0, p0, La/l1z;->e:I

    .line 50
    .line 51
    iget v1, p1, La/l1z;->e:I

    .line 52
    .line 53
    if-eq v0, v1, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-object v0, p0, La/l1z;->f:La/a4x;

    .line 57
    .line 58
    iget-object v1, p1, La/l1z;->f:La/a4x;

    .line 59
    .line 60
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-object v0, p0, La/l1z;->g:La/a4x;

    .line 68
    .line 69
    iget-object v1, p1, La/l1z;->g:La/a4x;

    .line 70
    .line 71
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_8

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    iget-object v0, p0, La/l1z;->h:La/a4x;

    .line 79
    .line 80
    iget-object v1, p1, La/l1z;->h:La/a4x;

    .line 81
    .line 82
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_9

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_9
    iget-object v0, p0, La/l1z;->i:La/csv;

    .line 90
    .line 91
    iget-object v1, p1, La/l1z;->i:La/csv;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, La/csv;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_a

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_a
    iget-object p0, p0, La/l1z;->j:La/mdm;

    .line 101
    .line 102
    iget-object p1, p1, La/l1z;->j:La/mdm;

    .line 103
    .line 104
    invoke-virtual {p0, p1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_b

    .line 109
    .line 110
    :goto_0
    const/4 p0, 0x0

    .line 111
    return p0

    .line 112
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 113
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/l1z;->a:La/t0z;

    .line 2
    .line 3
    invoke-virtual {v0}, La/t0z;->hashCode()I

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
    iget-object v2, p0, La/l1z;->b:La/f9m0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/f9m0;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-boolean v0, p0, La/l1z;->c:Z

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/l1z;->d:La/n3q;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v2, v0

    .line 31
    mul-int/2addr v2, v1

    .line 32
    iget v0, p0, La/l1z;->e:I

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/l1z;->f:La/a4x;

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/l1z;->g:La/a4x;

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/l1z;->h:La/a4x;

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, La/l1z;->i:La/csv;

    .line 57
    .line 58
    invoke-virtual {v2}, La/csv;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/2addr v2, v0

    .line 63
    mul-int/2addr v2, v1

    .line 64
    iget-object p0, p0, La/l1z;->j:La/mdm;

    .line 65
    .line 66
    invoke-virtual {p0}, La/mdm;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    add-int/2addr p0, v2

    .line 71
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Success(headerUiState="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/l1z;->a:La/t0z;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", appBarUiModel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/l1z;->b:La/f9m0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", rtlSupport="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, La/l1z;->c:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", filterType="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/l1z;->d:La/n3q;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", selectedTab="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, La/l1z;->e:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", tabs="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/l1z;->f:La/a4x;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", firstTeamEventList="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", secondTeamEventList="

    .line 69
    .line 70
    const-string v2, ", headerSummaryUiModel="

    .line 71
    .line 72
    iget-object v3, p0, La/l1z;->g:La/a4x;

    .line 73
    .line 74
    iget-object v4, p0, La/l1z;->h:La/a4x;

    .line 75
    .line 76
    invoke-static {v0, v3, v1, v4, v2}, La/hne;->y(Ljava/lang/StringBuilder;La/a4x;Ljava/lang/String;La/a4x;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, La/l1z;->i:La/csv;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", emptyLottieConfig="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, La/l1z;->j:La/mdm;

    .line 90
    .line 91
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p0, ")"

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method
