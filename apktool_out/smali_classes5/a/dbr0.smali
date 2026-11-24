.class public final La/dbr0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:J

.field public final d:Z

.field public final e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

.field public final f:La/qar0;

.field public final g:La/wcr0;

.field public final h:Z


# direct methods
.method public constructor <init>(IZJZLorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;La/qar0;La/wcr0;Z)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/dbr0;->a:I

    .line 8
    .line 9
    iput-boolean p2, p0, La/dbr0;->b:Z

    .line 10
    .line 11
    iput-wide p3, p0, La/dbr0;->c:J

    .line 12
    .line 13
    iput-boolean p5, p0, La/dbr0;->d:Z

    .line 14
    .line 15
    iput-object p6, p0, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 16
    .line 17
    iput-object p7, p0, La/dbr0;->f:La/qar0;

    .line 18
    .line 19
    iput-object p8, p0, La/dbr0;->g:La/wcr0;

    .line 20
    .line 21
    iput-boolean p9, p0, La/dbr0;->h:Z

    .line 22
    .line 23
    return-void
.end method

.method public static a(La/dbr0;ZLorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;La/qar0;La/wcr0;I)La/dbr0;
    .locals 10

    .line 1
    iget v1, p0, La/dbr0;->a:I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    and-int/lit8 v0, p5, 0x4

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-boolean p1, p0, La/dbr0;->b:Z

    .line 11
    .line 12
    :cond_0
    move v2, p1

    .line 13
    iget-wide v3, p0, La/dbr0;->c:J

    .line 14
    .line 15
    and-int/lit8 p1, p5, 0x10

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-boolean p1, p0, La/dbr0;->d:Z

    .line 20
    .line 21
    :goto_0
    move v5, p1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :goto_1
    and-int/lit8 p1, p5, 0x20

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-object p2, p0, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 30
    .line 31
    :cond_2
    move-object v6, p2

    .line 32
    and-int/lit8 p1, p5, 0x40

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget-object p3, p0, La/dbr0;->f:La/qar0;

    .line 37
    .line 38
    :cond_3
    move-object v7, p3

    .line 39
    and-int/lit16 p1, p5, 0x80

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    iget-object p4, p0, La/dbr0;->g:La/wcr0;

    .line 44
    .line 45
    :cond_4
    move-object v8, p4

    .line 46
    iget-boolean v9, p0, La/dbr0;->h:Z

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v0, La/dbr0;

    .line 55
    .line 56
    invoke-direct/range {v0 .. v9}, La/dbr0;-><init>(IZJZLorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;La/qar0;La/wcr0;Z)V

    .line 57
    .line 58
    .line 59
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
    instance-of v0, p1, La/dbr0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/dbr0;

    .line 10
    .line 11
    iget v0, p0, La/dbr0;->a:I

    .line 12
    .line 13
    iget v1, p1, La/dbr0;->a:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, La/dbr0;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, La/dbr0;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-wide v0, p0, La/dbr0;->c:J

    .line 26
    .line 27
    iget-wide v2, p1, La/dbr0;->c:J

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-boolean v0, p0, La/dbr0;->d:Z

    .line 35
    .line 36
    iget-boolean v1, p1, La/dbr0;->d:Z

    .line 37
    .line 38
    if-eq v0, v1, :cond_5

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_5
    iget-object v0, p0, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 42
    .line 43
    iget-object v1, p1, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    iget-object v0, p0, La/dbr0;->f:La/qar0;

    .line 53
    .line 54
    iget-object v1, p1, La/dbr0;->f:La/qar0;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, La/qar0;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_7

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_7
    iget-object v0, p0, La/dbr0;->g:La/wcr0;

    .line 64
    .line 65
    iget-object v1, p1, La/dbr0;->g:La/wcr0;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, La/wcr0;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget-boolean p0, p0, La/dbr0;->h:Z

    .line 75
    .line 76
    iget-boolean p1, p1, La/dbr0;->h:Z

    .line 77
    .line 78
    if-eq p0, p1, :cond_9

    .line 79
    .line 80
    :goto_0
    const/4 p0, 0x0

    .line 81
    return p0

    .line 82
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 83
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/dbr0;->a:I

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
    const/4 v2, 0x1

    .line 11
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-boolean v2, p0, La/dbr0;->b:Z

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-wide v2, p0, La/dbr0;->c:J

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-boolean v2, p0, La/dbr0;->d:Z

    .line 28
    .line 29
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v2, p0, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 34
    .line 35
    invoke-virtual {v2}, Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v0

    .line 40
    mul-int/2addr v2, v1

    .line 41
    iget-object v0, p0, La/dbr0;->f:La/qar0;

    .line 42
    .line 43
    invoke-virtual {v0}, La/qar0;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/2addr v0, v2

    .line 48
    mul-int/2addr v0, v1

    .line 49
    iget-object v2, p0, La/dbr0;->g:La/wcr0;

    .line 50
    .line 51
    invoke-virtual {v2}, La/wcr0;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    add-int/2addr v2, v0

    .line 56
    mul-int/2addr v2, v1

    .line 57
    iget-boolean p0, p0, La/dbr0;->h:Z

    .line 58
    .line 59
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    add-int/2addr p0, v2

    .line 64
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isNetworkAvailable=true, isLoading="

    .line 2
    .line 3
    const-string v1, ", sportId="

    .line 4
    .line 5
    iget v2, p0, La/dbr0;->a:I

    .line 6
    .line 7
    const-string v3, "TopPlayersState(eventId="

    .line 8
    .line 9
    iget-boolean v4, p0, La/dbr0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/h97;->l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isFirstTabClick="

    .line 16
    .line 17
    iget-wide v2, p0, La/dbr0;->c:J

    .line 18
    .line 19
    iget-boolean v4, p0, La/dbr0;->d:Z

    .line 20
    .line 21
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", searchModel="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/dbr0;->e:Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", lottieModel="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La/dbr0;->f:La/qar0;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", tabsModel="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, La/dbr0;->g:La/wcr0;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", supportRtl="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-boolean p0, p0, La/dbr0;->h:Z

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p0, ")"

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
