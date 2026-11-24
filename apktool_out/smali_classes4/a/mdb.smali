.class public final La/mdb;
.super La/odb;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public h:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, La/mdb;->a:J

    .line 11
    .line 12
    iput-object p3, p0, La/mdb;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p4, p0, La/mdb;->c:J

    .line 15
    .line 16
    iput-wide p6, p0, La/mdb;->d:J

    .line 17
    .line 18
    iput-object p8, p0, La/mdb;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, La/mdb;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, La/mdb;->g:Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean p11, p0, La/mdb;->h:Z

    .line 25
    .line 26
    return-void
.end method

.method public static c(La/mdb;JJLjava/lang/String;ZI)La/mdb;
    .locals 12

    .line 1
    move/from16 v0, p7

    .line 2
    .line 3
    iget-wide v1, p0, La/mdb;->a:J

    .line 4
    .line 5
    iget-object v3, p0, La/mdb;->b:Ljava/lang/String;

    .line 6
    .line 7
    and-int/lit8 v4, v0, 0x4

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    iget-wide v4, p0, La/mdb;->c:J

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v4, p1

    .line 15
    :goto_0
    and-int/lit8 v6, v0, 0x8

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    iget-wide v6, p0, La/mdb;->d:J

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-wide v6, p3

    .line 23
    :goto_1
    iget-object v8, p0, La/mdb;->e:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v9, p0, La/mdb;->f:Ljava/lang/String;

    .line 26
    .line 27
    and-int/lit8 v10, v0, 0x40

    .line 28
    .line 29
    if-eqz v10, :cond_2

    .line 30
    .line 31
    iget-object v10, p0, La/mdb;->g:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move-object/from16 v10, p5

    .line 35
    .line 36
    :goto_2
    and-int/lit16 v0, v0, 0x80

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-boolean v0, p0, La/mdb;->h:Z

    .line 41
    .line 42
    move v11, v0

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    move/from16 v11, p6

    .line 45
    .line 46
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v0, La/mdb;

    .line 59
    .line 60
    invoke-direct/range {v0 .. v11}, La/mdb;-><init>(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/mdb;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/mdb;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/mdb;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/mdb;

    .line 10
    .line 11
    iget-wide v0, p0, La/mdb;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/mdb;->a:J

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
    iget-object v0, p0, La/mdb;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, La/mdb;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-wide v0, p0, La/mdb;->c:J

    .line 32
    .line 33
    iget-wide v2, p1, La/mdb;->c:J

    .line 34
    .line 35
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-wide v0, p0, La/mdb;->d:J

    .line 41
    .line 42
    iget-wide v2, p1, La/mdb;->d:J

    .line 43
    .line 44
    cmp-long v0, v0, v2

    .line 45
    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-object v0, p0, La/mdb;->e:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, La/mdb;->e:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget-object v0, p0, La/mdb;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, La/mdb;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-object v0, p0, La/mdb;->g:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, p1, La/mdb;->g:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_8
    iget-boolean p0, p0, La/mdb;->h:Z

    .line 83
    .line 84
    iget-boolean p1, p1, La/mdb;->h:Z

    .line 85
    .line 86
    if-eq p0, p1, :cond_9

    .line 87
    .line 88
    :goto_0
    const/4 p0, 0x0

    .line 89
    return p0

    .line 90
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 91
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/mdb;->a:J

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
    iget-object v2, p0, La/mdb;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/mdb;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/mdb;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/mdb;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/mdb;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/mdb;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean p0, p0, La/mdb;->h:Z

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-boolean v0, p0, La/mdb;->h:Z

    .line 2
    .line 3
    const-string v1, "ChampSubItem(id="

    .line 4
    .line 5
    const-string v2, ", title="

    .line 6
    .line 7
    iget-wide v3, p0, La/mdb;->a:J

    .line 8
    .line 9
    iget-object v5, p0, La/mdb;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v3, v4, v1, v2, v5}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, ", sportId="

    .line 16
    .line 17
    const-string v3, ", subSportId="

    .line 18
    .line 19
    iget-wide v4, p0, La/mdb;->c:J

    .line 20
    .line 21
    invoke-static {v1, v2, v4, v5, v3}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v2, ", groupTitle="

    .line 25
    .line 26
    iget-wide v3, p0, La/mdb;->d:J

    .line 27
    .line 28
    iget-object v5, p0, La/mdb;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v1, v3, v4, v2, v5}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v2, ", image="

    .line 34
    .line 35
    const-string v3, ", gamesCount="

    .line 36
    .line 37
    iget-object v4, p0, La/mdb;->f:Ljava/lang/String;

    .line 38
    .line 39
    iget-object p0, p0, La/mdb;->g:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v1, v2, v4, v3, p0}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string p0, ", lastInGroup="

    .line 45
    .line 46
    const-string v2, ")"

    .line 47
    .line 48
    invoke-static {v1, p0, v0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
