.class public final La/deo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:La/u6n;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:La/t6n;

.field public final g:Z

.field public final h:J

.field public final i:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;La/u6n;Ljava/lang/String;Ljava/lang/String;La/t6n;ZJLjava/util/Map;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/deo0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/deo0;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/deo0;->c:La/u6n;

    .line 12
    .line 13
    iput-object p4, p0, La/deo0;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, La/deo0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, La/deo0;->f:La/t6n;

    .line 18
    .line 19
    iput-boolean p7, p0, La/deo0;->g:Z

    .line 20
    .line 21
    iput-wide p8, p0, La/deo0;->h:J

    .line 22
    .line 23
    iput-object p10, p0, La/deo0;->i:Ljava/util/Map;

    .line 24
    .line 25
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
    instance-of v0, p1, La/deo0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/deo0;

    .line 11
    .line 12
    iget-object v0, p0, La/deo0;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p1, La/deo0;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v0, p0, La/deo0;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, La/deo0;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v0, p0, La/deo0;->c:La/u6n;

    .line 35
    .line 36
    iget-object v1, p1, La/deo0;->c:La/u6n;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, La/u6n;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget-object v0, p0, La/deo0;->d:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p1, La/deo0;->d:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    iget-object v0, p0, La/deo0;->e:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v1, p1, La/deo0;->e:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_6

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_6
    iget-object v0, p0, La/deo0;->f:La/t6n;

    .line 68
    .line 69
    iget-object v1, p1, La/deo0;->f:La/t6n;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, La/t6n;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_7

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_7
    iget-boolean v0, p0, La/deo0;->g:Z

    .line 79
    .line 80
    iget-boolean v1, p1, La/deo0;->g:Z

    .line 81
    .line 82
    if-eq v0, v1, :cond_8

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_8
    iget-wide v0, p1, La/deo0;->h:J

    .line 86
    .line 87
    sget v2, La/y3d;->h:I

    .line 88
    .line 89
    iget-wide v2, p0, La/deo0;->h:J

    .line 90
    .line 91
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-object p0, p0, La/deo0;->i:Ljava/util/Map;

    .line 99
    .line 100
    iget-object p1, p1, La/deo0;->i:Ljava/util/Map;

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_a

    .line 107
    .line 108
    :goto_0
    const/4 p0, 0x0

    .line 109
    return p0

    .line 110
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 111
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/deo0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, La/deo0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/deo0;->c:La/u6n;

    .line 17
    .line 18
    invoke-virtual {v2}, La/u6n;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object v0, p0, La/deo0;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/deo0;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/deo0;->f:La/t6n;

    .line 37
    .line 38
    invoke-virtual {v2}, La/t6n;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/2addr v2, v1

    .line 44
    iget-boolean v0, p0, La/deo0;->g:Z

    .line 45
    .line 46
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    sget v2, La/y3d;->h:I

    .line 51
    .line 52
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 53
    .line 54
    iget-wide v2, p0, La/deo0;->h:J

    .line 55
    .line 56
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object p0, p0, La/deo0;->i:Ljava/util/Map;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    add-int/2addr p0, v0

    .line 67
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, La/deo0;->h:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", number="

    .line 8
    .line 9
    const-string v2, ", logo="

    .line 10
    .line 11
    const-string v3, "TabTopPlayerUiModel(id="

    .line 12
    .line 13
    iget-object v4, p0, La/deo0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v5, p0, La/deo0;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3, v4, v1, v5, v2}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, La/deo0;->c:La/u6n;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, ", name="

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, La/deo0;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, ", country="

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, La/deo0;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, ", countryLogo="

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, La/deo0;->f:La/t6n;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, ", isSelected="

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v2, ", background="

    .line 62
    .line 63
    const-string v3, ", statisticByColumn="

    .line 64
    .line 65
    iget-boolean v4, p0, La/deo0;->g:Z

    .line 66
    .line 67
    invoke-static {v2, v0, v3, v1, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, La/deo0;->i:Ljava/util/Map;

    .line 71
    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p0, ")"

    .line 76
    .line 77
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method
