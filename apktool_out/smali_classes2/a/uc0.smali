.class public final La/uc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:S

.field public final f:Z

.field public final g:Ljava/util/List;

.field public final h:Ljava/lang/String;

.field public final i:Z


# direct methods
.method public constructor <init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)V
    .locals 1

    .line 1
    sget-object v0, La/gz8;->a:La/gz8;

    .line 2
    .line 3
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-wide p2, p0, La/uc0;->a:J

    .line 13
    .line 14
    iput-wide p4, p0, La/uc0;->b:J

    .line 15
    .line 16
    iput-object p6, p0, La/uc0;->c:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p7, p0, La/uc0;->d:Ljava/lang/String;

    .line 19
    .line 20
    iput-short p1, p0, La/uc0;->e:S

    .line 21
    .line 22
    iput-boolean p10, p0, La/uc0;->f:Z

    .line 23
    .line 24
    iput-object p9, p0, La/uc0;->g:Ljava/util/List;

    .line 25
    .line 26
    iput-object p8, p0, La/uc0;->h:Ljava/lang/String;

    .line 27
    .line 28
    iput-boolean p11, p0, La/uc0;->i:Z

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/uc0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/uc0;

    .line 10
    .line 11
    iget-wide v0, p0, La/uc0;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/uc0;->a:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-wide v0, p0, La/uc0;->b:J

    .line 21
    .line 22
    iget-wide v2, p1, La/uc0;->b:J

    .line 23
    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/uc0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/uc0;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, La/uc0;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p1, La/uc0;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-short v0, p0, La/uc0;->e:S

    .line 52
    .line 53
    iget-short v1, p1, La/uc0;->e:S

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean v0, p0, La/uc0;->f:Z

    .line 59
    .line 60
    iget-boolean v1, p1, La/uc0;->f:Z

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    sget-object v0, La/gz8;->a:La/gz8;

    .line 66
    .line 67
    iget-object v0, p0, La/uc0;->g:Ljava/util/List;

    .line 68
    .line 69
    iget-object v1, p1, La/uc0;->g:Ljava/util/List;

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
    iget-object v0, p0, La/uc0;->h:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v1, p1, La/uc0;->h:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean p0, p0, La/uc0;->i:Z

    .line 90
    .line 91
    iget-boolean p1, p1, La/uc0;->i:Z

    .line 92
    .line 93
    if-eq p0, p1, :cond_a

    .line 94
    .line 95
    :goto_0
    const/4 p0, 0x0

    .line 96
    return p0

    .line 97
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 98
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/uc0;->a:J

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
    iget-wide v2, p0, La/uc0;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/uc0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/uc0;->d:Ljava/lang/String;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :goto_0
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-short v2, p0, La/uc0;->e:S

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/uc0;->f:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sget-object v2, La/gz8;->a:La/gz8;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-int/2addr v2, v0

    .line 53
    mul-int/2addr v2, v1

    .line 54
    iget-object v0, p0, La/uc0;->g:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/uc0;->h:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean p0, p0, La/uc0;->i:Z

    .line 67
    .line 68
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    add-int/2addr p0, v0

    .line 73
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, La/gz8;->a:La/gz8;

    .line 2
    .line 3
    const-string v1, "AggregatorBrandItemModel(partitionId="

    .line 4
    .line 5
    const-string v2, ", brandId="

    .line 6
    .line 7
    iget-wide v3, p0, La/uc0;->a:J

    .line 8
    .line 9
    invoke-static {v3, v4, v1, v2}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", brandName="

    .line 14
    .line 15
    iget-wide v3, p0, La/uc0;->b:J

    .line 16
    .line 17
    iget-object v5, p0, La/uc0;->c:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1, v3, v4, v2, v5}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v2, ", imgBanner="

    .line 23
    .line 24
    const-string v3, ", subCategoryId="

    .line 25
    .line 26
    iget-short v4, p0, La/uc0;->e:S

    .line 27
    .line 28
    iget-object v5, p0, La/uc0;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v4, v2, v5, v3, v1}, La/axq;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 31
    .line 32
    .line 33
    const-string v2, ", hasAggregatorBrandsFullInfo="

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v2, p0, La/uc0;->f:Z

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, ", viewType="

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, ", partitions="

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, La/uc0;->g:Ljava/util/List;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, ", description="

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, La/uc0;->h:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", fromPopularSearch="

    .line 72
    .line 73
    const-string v2, ")"

    .line 74
    .line 75
    iget-boolean p0, p0, La/uc0;->i:Z

    .line 76
    .line 77
    invoke-static {v1, v0, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
