.class public final La/sgq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/khq0;


# instance fields
.field public final a:B

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:La/rqm;

.field public final h:La/rqm;

.field public final i:La/rqm;

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;ZZZLa/rqm;La/rqm;La/rqm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, La/sgq0;->a:B

    .line 5
    .line 6
    iput-object p2, p0, La/sgq0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, La/sgq0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p4, p0, La/sgq0;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/sgq0;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, La/sgq0;->f:Z

    .line 15
    .line 16
    iput-object p7, p0, La/sgq0;->g:La/rqm;

    .line 17
    .line 18
    iput-object p8, p0, La/sgq0;->h:La/rqm;

    .line 19
    .line 20
    iput-object p9, p0, La/sgq0;->i:La/rqm;

    .line 21
    .line 22
    new-instance p5, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, " "

    .line 31
    .line 32
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-static {p5, p1, p2}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/sgq0;->j:Ljava/lang/String;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/sgq0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/sgq0;

    .line 10
    .line 11
    iget-byte v0, p0, La/sgq0;->a:B

    .line 12
    .line 13
    iget-byte v1, p1, La/sgq0;->a:B

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/sgq0;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, La/sgq0;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/sgq0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/sgq0;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/sgq0;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/sgq0;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-boolean v0, p0, La/sgq0;->e:Z

    .line 48
    .line 49
    iget-boolean v1, p1, La/sgq0;->e:Z

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-boolean v0, p0, La/sgq0;->f:Z

    .line 55
    .line 56
    iget-boolean v1, p1, La/sgq0;->f:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-object v0, p0, La/sgq0;->g:La/rqm;

    .line 62
    .line 63
    iget-object v1, p1, La/sgq0;->g:La/rqm;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, La/rqm;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-object v0, p0, La/sgq0;->h:La/rqm;

    .line 73
    .line 74
    iget-object v1, p1, La/sgq0;->h:La/rqm;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, La/rqm;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_9

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget-object p0, p0, La/sgq0;->i:La/rqm;

    .line 84
    .line 85
    iget-object p1, p1, La/sgq0;->i:La/rqm;

    .line 86
    .line 87
    invoke-virtual {p0, p1}, La/rqm;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-nez p0, :cond_a

    .line 92
    .line 93
    :goto_0
    const/4 p0, 0x0

    .line 94
    return p0

    .line 95
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 96
    return p0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/sgq0;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-byte v0, p0, La/sgq0;->a:B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-object v2, p0, La/sgq0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/sgq0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/sgq0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/sgq0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/sgq0;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/sgq0;->g:La/rqm;

    .line 41
    .line 42
    invoke-virtual {v2}, La/rqm;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object v0, p0, La/sgq0;->h:La/rqm;

    .line 49
    .line 50
    invoke-virtual {v0}, La/rqm;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/2addr v0, v2

    .line 55
    mul-int/2addr v0, v1

    .line 56
    iget-object p0, p0, La/sgq0;->i:La/rqm;

    .line 57
    .line 58
    invoke-virtual {p0}, La/rqm;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v0

    .line 63
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", startDateText="

    .line 2
    .line 3
    const-string v1, ", endDateText="

    .line 4
    .line 5
    iget-byte v2, p0, La/sgq0;->a:B

    .line 6
    .line 7
    const-string v3, "TimeCustomFilterUiModel(id="

    .line 8
    .line 9
    iget-object v4, p0, La/sgq0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", selected="

    .line 16
    .line 17
    const-string v2, ", startDateTextIconVisible="

    .line 18
    .line 19
    iget-object v3, p0, La/sgq0;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v4, p0, La/sgq0;->d:Z

    .line 22
    .line 23
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", endDateTextIconVisible="

    .line 27
    .line 28
    const-string v2, ", containerCellStyle="

    .line 29
    .line 30
    iget-boolean v3, p0, La/sgq0;->e:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/sgq0;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, La/sgq0;->g:La/rqm;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", startDateStyle="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, La/sgq0;->h:La/rqm;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", endDateStyle="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, La/sgq0;->i:La/rqm;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, ")"

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
