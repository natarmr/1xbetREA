.class public final La/s1n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/w1n;

.field public final b:La/w1n;

.field public final c:La/v1n;

.field public final d:La/jwm;

.field public final e:La/jwm;

.field public final f:La/jwm;

.field public final g:Z


# direct methods
.method public constructor <init>(La/w1n;La/w1n;La/v1n;La/jwm;La/jwm;La/jwm;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/s1n;->a:La/w1n;

    .line 5
    .line 6
    iput-object p2, p0, La/s1n;->b:La/w1n;

    .line 7
    .line 8
    iput-object p3, p0, La/s1n;->c:La/v1n;

    .line 9
    .line 10
    iput-object p4, p0, La/s1n;->d:La/jwm;

    .line 11
    .line 12
    iput-object p5, p0, La/s1n;->e:La/jwm;

    .line 13
    .line 14
    iput-object p6, p0, La/s1n;->f:La/jwm;

    .line 15
    .line 16
    iput-boolean p7, p0, La/s1n;->g:Z

    .line 17
    .line 18
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
    instance-of v0, p1, La/s1n;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/s1n;

    .line 10
    .line 11
    iget-object v0, p0, La/s1n;->a:La/w1n;

    .line 12
    .line 13
    iget-object v1, p1, La/s1n;->a:La/w1n;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/w1n;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/s1n;->b:La/w1n;

    .line 23
    .line 24
    iget-object v1, p1, La/s1n;->b:La/w1n;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/w1n;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/s1n;->c:La/v1n;

    .line 34
    .line 35
    iget-object v1, p1, La/s1n;->c:La/v1n;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/v1n;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/s1n;->d:La/jwm;

    .line 45
    .line 46
    iget-object v1, p1, La/s1n;->d:La/jwm;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, La/jwm;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, La/s1n;->e:La/jwm;

    .line 56
    .line 57
    iget-object v1, p1, La/s1n;->e:La/jwm;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/jwm;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-object v0, p0, La/s1n;->f:La/jwm;

    .line 67
    .line 68
    iget-object v1, p1, La/s1n;->f:La/jwm;

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-boolean p0, p0, La/s1n;->g:Z

    .line 78
    .line 79
    iget-boolean p1, p1, La/s1n;->g:Z

    .line 80
    .line 81
    if-eq p0, p1, :cond_8

    .line 82
    .line 83
    :goto_0
    const/4 p0, 0x0

    .line 84
    return p0

    .line 85
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 86
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/s1n;->a:La/w1n;

    .line 2
    .line 3
    invoke-virtual {v0}, La/w1n;->hashCode()I

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
    iget-object v2, p0, La/s1n;->b:La/w1n;

    .line 11
    .line 12
    invoke-virtual {v2}, La/w1n;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/s1n;->c:La/v1n;

    .line 19
    .line 20
    invoke-virtual {v0}, La/v1n;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, La/s1n;->d:La/jwm;

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, La/b1j;->d(La/jwm;II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/s1n;->e:La/jwm;

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, La/b1j;->d(La/jwm;II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/s1n;->f:La/jwm;

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v2}, La/jwm;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    :goto_0
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-boolean p0, p0, La/s1n;->g:Z

    .line 51
    .line 52
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr p0, v0

    .line 57
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "V4(teamOne="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/s1n;->a:La/w1n;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", teamTwo="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/s1n;->b:La/w1n;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", score="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/s1n;->c:La/v1n;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", infoOne="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/s1n;->d:La/jwm;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", infoTwo="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", infoThree="

    .line 49
    .line 50
    const-string v2, ", supportRtl="

    .line 51
    .line 52
    iget-object v3, p0, La/s1n;->e:La/jwm;

    .line 53
    .line 54
    iget-object v4, p0, La/s1n;->f:La/jwm;

    .line 55
    .line 56
    invoke-static {v0, v3, v1, v4, v2}, La/b1j;->A(Ljava/lang/StringBuilder;La/jwm;Ljava/lang/String;La/jwm;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v1, ")"

    .line 60
    .line 61
    iget-boolean p0, p0, La/s1n;->g:Z

    .line 62
    .line 63
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
