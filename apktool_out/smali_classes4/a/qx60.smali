.class public final La/qx60;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/sc50;

.field public final b:La/gep;

.field public final c:La/cfp;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:La/kg;

.field public final h:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(La/sc50;La/gep;La/cfp;ZZZLa/kg;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qx60;->a:La/sc50;

    .line 5
    .line 6
    iput-object p2, p0, La/qx60;->b:La/gep;

    .line 7
    .line 8
    iput-object p3, p0, La/qx60;->c:La/cfp;

    .line 9
    .line 10
    iput-boolean p4, p0, La/qx60;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/qx60;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, La/qx60;->f:Z

    .line 15
    .line 16
    iput-object p7, p0, La/qx60;->g:La/kg;

    .line 17
    .line 18
    iput-object p8, p0, La/qx60;->h:Ljava/lang/Throwable;

    .line 19
    .line 20
    return-void
.end method

.method public static a(La/qx60;La/gep;La/cfp;ZZZLjava/lang/Throwable;I)La/qx60;
    .locals 9

    .line 1
    move/from16 v0, p7

    .line 2
    .line 3
    iget-object v1, p0, La/qx60;->a:La/sc50;

    .line 4
    .line 5
    and-int/lit8 v2, v0, 0x2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, La/qx60;->b:La/gep;

    .line 10
    .line 11
    :cond_0
    move-object v2, p1

    .line 12
    and-int/lit8 p1, v0, 0x4

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p2, p0, La/qx60;->c:La/cfp;

    .line 17
    .line 18
    :cond_1
    move-object v3, p2

    .line 19
    and-int/lit8 p1, v0, 0x8

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-boolean p3, p0, La/qx60;->d:Z

    .line 24
    .line 25
    :cond_2
    move v4, p3

    .line 26
    and-int/lit8 p1, v0, 0x10

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    iget-boolean p4, p0, La/qx60;->e:Z

    .line 31
    .line 32
    :cond_3
    move v5, p4

    .line 33
    and-int/lit8 p1, v0, 0x20

    .line 34
    .line 35
    if-eqz p1, :cond_4

    .line 36
    .line 37
    iget-boolean p5, p0, La/qx60;->f:Z

    .line 38
    .line 39
    :cond_4
    move v6, p5

    .line 40
    iget-object v7, p0, La/qx60;->g:La/kg;

    .line 41
    .line 42
    and-int/lit16 p1, v0, 0x80

    .line 43
    .line 44
    if-eqz p1, :cond_5

    .line 45
    .line 46
    iget-object p1, p0, La/qx60;->h:Ljava/lang/Throwable;

    .line 47
    .line 48
    move-object v8, p1

    .line 49
    goto :goto_0

    .line 50
    :cond_5
    move-object v8, p6

    .line 51
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v0, La/qx60;

    .line 55
    .line 56
    invoke-direct/range {v0 .. v8}, La/qx60;-><init>(La/sc50;La/gep;La/cfp;ZZZLa/kg;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
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
    instance-of v0, p1, La/qx60;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/qx60;

    .line 10
    .line 11
    iget-object v0, p0, La/qx60;->a:La/sc50;

    .line 12
    .line 13
    iget-object v1, p1, La/qx60;->a:La/sc50;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/sc50;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/qx60;->b:La/gep;

    .line 23
    .line 24
    iget-object v1, p1, La/qx60;->b:La/gep;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/gep;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/qx60;->c:La/cfp;

    .line 34
    .line 35
    iget-object v1, p1, La/qx60;->c:La/cfp;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/cfp;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/qx60;->d:Z

    .line 45
    .line 46
    iget-boolean v1, p1, La/qx60;->d:Z

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-boolean v0, p0, La/qx60;->e:Z

    .line 52
    .line 53
    iget-boolean v1, p1, La/qx60;->e:Z

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean v0, p0, La/qx60;->f:Z

    .line 59
    .line 60
    iget-boolean v1, p1, La/qx60;->f:Z

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-object v0, p0, La/qx60;->g:La/kg;

    .line 66
    .line 67
    iget-object v1, p1, La/qx60;->g:La/kg;

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-object p0, p0, La/qx60;->h:Ljava/lang/Throwable;

    .line 73
    .line 74
    iget-object p1, p1, La/qx60;->h:Ljava/lang/Throwable;

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
    .locals 3

    .line 1
    iget-object v0, p0, La/qx60;->a:La/sc50;

    .line 2
    .line 3
    invoke-virtual {v0}, La/sc50;->hashCode()I

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
    iget-object v2, p0, La/qx60;->b:La/gep;

    .line 11
    .line 12
    invoke-virtual {v2}, La/gep;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/qx60;->c:La/cfp;

    .line 19
    .line 20
    invoke-virtual {v0}, La/cfp;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-boolean v2, p0, La/qx60;->d:Z

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-boolean v2, p0, La/qx60;->e:Z

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-boolean v2, p0, La/qx60;->f:Z

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/qx60;->g:La/kg;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    mul-int/2addr v2, v1

    .line 52
    iget-object p0, p0, La/qx60;->h:Ljava/lang/Throwable;

    .line 53
    .line 54
    if-nez p0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    :goto_0
    add-int/2addr v2, p0

    .line 63
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "OneXGamesFavoritesState(navigationBarState="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/qx60;->a:La/sc50;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", balanceState="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/qx60;->b:La/gep;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", gamesState="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/qx60;->c:La/cfp;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", isConnected="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, La/qx60;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", previousConnected="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", isAuthorized="

    .line 49
    .line 50
    const-string v2, ", accountSelectionStyle="

    .line 51
    .line 52
    iget-boolean v3, p0, La/qx60;->e:Z

    .line 53
    .line 54
    iget-boolean v4, p0, La/qx60;->f:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, La/qx60;->g:La/kg;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", error="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, La/qx60;->h:Ljava/lang/Throwable;

    .line 70
    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p0, ")"

    .line 75
    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
