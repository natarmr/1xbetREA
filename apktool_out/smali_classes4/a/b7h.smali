.class public final La/b7h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:I

.field public final g:La/a7h;

.field public final h:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;ZZZILa/a7h;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/b7h;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/b7h;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p4, p0, La/b7h;->c:Z

    .line 9
    .line 10
    iput-boolean p5, p0, La/b7h;->d:Z

    .line 11
    .line 12
    iput-boolean p6, p0, La/b7h;->e:Z

    .line 13
    .line 14
    iput p7, p0, La/b7h;->f:I

    .line 15
    .line 16
    iput-object p8, p0, La/b7h;->g:La/a7h;

    .line 17
    .line 18
    iput-boolean p9, p0, La/b7h;->h:Z

    .line 19
    .line 20
    return-void
.end method

.method public static a(La/b7h;)La/b7h;
    .locals 10

    .line 1
    iget-wide v1, p0, La/b7h;->a:J

    .line 2
    .line 3
    iget-object v3, p0, La/b7h;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v5, p0, La/b7h;->d:Z

    .line 6
    .line 7
    iget-boolean v6, p0, La/b7h;->e:Z

    .line 8
    .line 9
    iget v7, p0, La/b7h;->f:I

    .line 10
    .line 11
    iget-object v8, p0, La/b7h;->g:La/a7h;

    .line 12
    .line 13
    iget-boolean v9, p0, La/b7h;->h:Z

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, La/b7h;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-direct/range {v0 .. v9}, La/b7h;-><init>(JLjava/lang/String;ZZZILa/a7h;Z)V

    .line 22
    .line 23
    .line 24
    return-object v0
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
    instance-of v0, p1, La/b7h;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/b7h;

    .line 10
    .line 11
    iget-wide v0, p0, La/b7h;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/b7h;->a:J

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
    iget-object v0, p0, La/b7h;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, La/b7h;->b:Ljava/lang/String;

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
    goto :goto_0

    .line 31
    :cond_3
    iget-boolean v0, p0, La/b7h;->c:Z

    .line 32
    .line 33
    iget-boolean v1, p1, La/b7h;->c:Z

    .line 34
    .line 35
    if-eq v0, v1, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget-boolean v0, p0, La/b7h;->d:Z

    .line 39
    .line 40
    iget-boolean v1, p1, La/b7h;->d:Z

    .line 41
    .line 42
    if-eq v0, v1, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    iget-boolean v0, p0, La/b7h;->e:Z

    .line 46
    .line 47
    iget-boolean v1, p1, La/b7h;->e:Z

    .line 48
    .line 49
    if-eq v0, v1, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    iget v0, p0, La/b7h;->f:I

    .line 53
    .line 54
    iget v1, p1, La/b7h;->f:I

    .line 55
    .line 56
    if-eq v0, v1, :cond_7

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_7
    iget-object v0, p0, La/b7h;->g:La/a7h;

    .line 60
    .line 61
    iget-object v1, p1, La/b7h;->g:La/a7h;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, La/a7h;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_8

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_8
    iget-boolean p0, p0, La/b7h;->h:Z

    .line 71
    .line 72
    iget-boolean p1, p1, La/b7h;->h:Z

    .line 73
    .line 74
    if-eq p0, p1, :cond_9

    .line 75
    .line 76
    :goto_0
    const/4 p0, 0x0

    .line 77
    return p0

    .line 78
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 79
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/b7h;->a:J

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
    iget-object v2, p0, La/b7h;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/b7h;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/b7h;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/b7h;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/b7h;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/b7h;->g:La/a7h;

    .line 41
    .line 42
    iget-object v2, v2, La/a7h;->a:La/a4x;

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean p0, p0, La/b7h;->h:Z

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/2addr p0, v0

    .line 55
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "CyberMarketsGroupUiModel(id="

    .line 2
    .line 3
    const-string v1, ", title="

    .line 4
    .line 5
    iget-wide v2, p0, La/b7h;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/b7h;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", isExpanded="

    .line 14
    .line 15
    const-string v2, ", isPinned="

    .line 16
    .line 17
    iget-boolean v3, p0, La/b7h;->c:Z

    .line 18
    .line 19
    iget-boolean v4, p0, La/b7h;->d:Z

    .line 20
    .line 21
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", hasSpecialSign="

    .line 25
    .line 26
    const-string v2, ", countMarkets="

    .line 27
    .line 28
    iget v3, p0, La/b7h;->f:I

    .line 29
    .line 30
    iget-boolean v4, p0, La/b7h;->e:Z

    .line 31
    .line 32
    invoke-static {v3, v1, v2, v0, v4}, La/cs0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 33
    .line 34
    .line 35
    const-string v1, ", content="

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, La/b7h;->g:La/a7h;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ", supportRtl="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-boolean p0, p0, La/b7h;->h:Z

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ")"

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
