.class public final La/yjw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Z

.field public final c:La/sff0;

.field public final d:Z

.field public final e:Ljava/util/Locale;

.field public final f:Z

.field public final g:Z

.field public final h:La/viw;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLa/sff0;ZLjava/util/Locale;ZZLa/viw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/yjw;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-boolean p2, p0, La/yjw;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, La/yjw;->c:La/sff0;

    .line 9
    .line 10
    iput-boolean p4, p0, La/yjw;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, La/yjw;->e:Ljava/util/Locale;

    .line 13
    .line 14
    iput-boolean p6, p0, La/yjw;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, La/yjw;->g:Z

    .line 17
    .line 18
    iput-object p8, p0, La/yjw;->h:La/viw;

    .line 19
    .line 20
    return-void
.end method

.method public static a(La/yjw;ZLa/viw;I)La/yjw;
    .locals 9

    .line 1
    iget-object v1, p0, La/yjw;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-boolean v2, p0, La/yjw;->b:Z

    .line 4
    .line 5
    iget-object v3, p0, La/yjw;->c:La/sff0;

    .line 6
    .line 7
    iget-boolean v4, p0, La/yjw;->d:Z

    .line 8
    .line 9
    iget-object v5, p0, La/yjw;->e:Ljava/util/Locale;

    .line 10
    .line 11
    iget-boolean v6, p0, La/yjw;->f:Z

    .line 12
    .line 13
    and-int/lit8 v0, p3, 0x40

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-boolean p1, p0, La/yjw;->g:Z

    .line 18
    .line 19
    :cond_0
    move v7, p1

    .line 20
    and-int/lit16 p1, p3, 0x80

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p2, p0, La/yjw;->h:La/viw;

    .line 25
    .line 26
    :cond_1
    move-object v8, p2

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, La/yjw;

    .line 31
    .line 32
    invoke-direct/range {v0 .. v8}, La/yjw;-><init>(Ljava/util/List;ZLa/sff0;ZLjava/util/Locale;ZZLa/viw;)V

    .line 33
    .line 34
    .line 35
    return-object v0
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
    instance-of v0, p1, La/yjw;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/yjw;

    .line 10
    .line 11
    iget-object v0, p0, La/yjw;->a:Ljava/util/List;

    .line 12
    .line 13
    iget-object v1, p1, La/yjw;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/yjw;->b:Z

    .line 23
    .line 24
    iget-boolean v1, p1, La/yjw;->b:Z

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/yjw;->c:La/sff0;

    .line 30
    .line 31
    iget-object v1, p1, La/yjw;->c:La/sff0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/sff0;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/yjw;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/yjw;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-object v0, p0, La/yjw;->e:Ljava/util/Locale;

    .line 48
    .line 49
    iget-object v1, p1, La/yjw;->e:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean v0, p0, La/yjw;->f:Z

    .line 59
    .line 60
    iget-boolean v1, p1, La/yjw;->f:Z

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-boolean v0, p0, La/yjw;->g:Z

    .line 66
    .line 67
    iget-boolean v1, p1, La/yjw;->g:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-object p0, p0, La/yjw;->h:La/viw;

    .line 73
    .line 74
    iget-object p1, p1, La/yjw;->h:La/viw;

    .line 75
    .line 76
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_9

    .line 81
    .line 82
    :goto_0
    const/4 p0, 0x0

    .line 83
    return p0

    .line 84
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 85
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/yjw;->a:Ljava/util/List;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-boolean v3, p0, La/yjw;->b:Z

    .line 16
    .line 17
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v3, p0, La/yjw;->c:La/sff0;

    .line 22
    .line 23
    invoke-static {v3, v1, v2}, La/cs0;->c(La/sff0;II)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-boolean v3, p0, La/yjw;->d:Z

    .line 28
    .line 29
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v3, p0, La/yjw;->e:Ljava/util/Locale;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/util/Locale;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/2addr v3, v1

    .line 40
    mul-int/2addr v3, v2

    .line 41
    iget-boolean v1, p0, La/yjw;->f:Z

    .line 42
    .line 43
    invoke-static {v3, v2, v1}, La/brm0;->e(IIZ)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-boolean v3, p0, La/yjw;->g:Z

    .line 48
    .line 49
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iget-object p0, p0, La/yjw;->h:La/viw;

    .line 54
    .line 55
    if-nez p0, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {p0}, La/viw;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    :goto_1
    add-int/2addr v1, v0

    .line 63
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HomeStateModel(specialEventList="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/yjw;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", bettingDisabled="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, La/yjw;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", remoteConfigModel="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/yjw;->c:La/sff0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", tablet="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, La/yjw;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", currentLocale="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/yjw;->e:Ljava/util/Locale;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", supportRtl="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean v1, p0, La/yjw;->f:Z

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", connected="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-boolean v1, p0, La/yjw;->g:Z

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", scenarioModel="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, La/yjw;->h:La/viw;

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p0, ")"

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method
