.class public final La/qzm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tzm;


# instance fields
.field public final a:La/wzm;

.field public final b:La/wzm;

.field public final c:Ljava/lang/String;

.field public final d:La/jwm;

.field public final e:La/jwm;

.field public final f:La/jwm;

.field public final g:Z


# direct methods
.method public constructor <init>(La/wzm;La/wzm;Ljava/lang/String;La/jwm;La/jwm;La/jwm;Z)V
    .locals 1

    .line 1
    sget-object v0, La/uso0;->a:La/uso0;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/qzm;->a:La/wzm;

    .line 10
    .line 11
    iput-object p2, p0, La/qzm;->b:La/wzm;

    .line 12
    .line 13
    iput-object p3, p0, La/qzm;->c:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, La/qzm;->d:La/jwm;

    .line 16
    .line 17
    iput-object p5, p0, La/qzm;->e:La/jwm;

    .line 18
    .line 19
    iput-object p6, p0, La/qzm;->f:La/jwm;

    .line 20
    .line 21
    iput-boolean p7, p0, La/qzm;->g:Z

    .line 22
    .line 23
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
    instance-of v0, p1, La/qzm;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/qzm;

    .line 10
    .line 11
    iget-object v0, p0, La/qzm;->a:La/wzm;

    .line 12
    .line 13
    iget-object v1, p1, La/qzm;->a:La/wzm;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/wzm;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/qzm;->b:La/wzm;

    .line 23
    .line 24
    iget-object v1, p1, La/qzm;->b:La/wzm;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/wzm;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/qzm;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/qzm;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/qzm;->d:La/jwm;

    .line 45
    .line 46
    iget-object v1, p1, La/qzm;->d:La/jwm;

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
    iget-object v0, p0, La/qzm;->e:La/jwm;

    .line 56
    .line 57
    iget-object v1, p1, La/qzm;->e:La/jwm;

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
    iget-object v0, p0, La/qzm;->f:La/jwm;

    .line 67
    .line 68
    iget-object v1, p1, La/qzm;->f:La/jwm;

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
    sget-object v0, La/uso0;->a:La/uso0;

    .line 78
    .line 79
    iget-boolean p0, p0, La/qzm;->g:Z

    .line 80
    .line 81
    iget-boolean p1, p1, La/qzm;->g:Z

    .line 82
    .line 83
    if-eq p0, p1, :cond_8

    .line 84
    .line 85
    :goto_0
    const/4 p0, 0x0

    .line 86
    return p0

    .line 87
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 88
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/qzm;->a:La/wzm;

    .line 2
    .line 3
    invoke-virtual {v0}, La/wzm;->hashCode()I

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
    iget-object v2, p0, La/qzm;->b:La/wzm;

    .line 11
    .line 12
    invoke-virtual {v2}, La/wzm;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/qzm;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/qzm;->d:La/jwm;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, La/b1j;->d(La/jwm;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/qzm;->e:La/jwm;

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, La/b1j;->d(La/jwm;II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/qzm;->f:La/jwm;

    .line 37
    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v2}, La/jwm;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    :goto_0
    add-int/2addr v0, v2

    .line 47
    mul-int/2addr v0, v1

    .line 48
    sget-object v2, La/uso0;->a:La/uso0;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    add-int/2addr v2, v0

    .line 55
    mul-int/2addr v2, v1

    .line 56
    iget-boolean p0, p0, La/qzm;->g:Z

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v2

    .line 63
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, La/uso0;->a:La/uso0;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "V2(firstOpponentModel="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, La/qzm;->a:La/wzm;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", secondOpponentModel="

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, La/qzm;->b:La/wzm;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ", scoreTitle="

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, La/qzm;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ", infoLabelOne="

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, La/qzm;->d:La/jwm;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, ", infoLabelTwo="

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v2, ", infoLabelThree="

    .line 51
    .line 52
    const-string v3, ", tagWinVisibilityState="

    .line 53
    .line 54
    iget-object v4, p0, La/qzm;->e:La/jwm;

    .line 55
    .line 56
    iget-object v5, p0, La/qzm;->f:La/jwm;

    .line 57
    .line 58
    invoke-static {v1, v4, v2, v5, v3}, La/b1j;->A(Ljava/lang/StringBuilder;La/jwm;Ljava/lang/String;La/jwm;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ", supportRtl="

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-boolean p0, p0, La/qzm;->g:Z

    .line 70
    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p0, ")"

    .line 75
    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
