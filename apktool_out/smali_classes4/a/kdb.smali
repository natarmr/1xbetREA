.class public final La/kdb;
.super La/odb;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/List;

.field public final h:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, La/kdb;->a:J

    .line 11
    .line 12
    iput-object p3, p0, La/kdb;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p4, p0, La/kdb;->c:J

    .line 15
    .line 16
    iput-wide p6, p0, La/kdb;->d:J

    .line 17
    .line 18
    iput-object p8, p0, La/kdb;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, La/kdb;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, La/kdb;->g:Ljava/util/List;

    .line 23
    .line 24
    iput-boolean p11, p0, La/kdb;->h:Z

    .line 25
    .line 26
    return-void
.end method

.method public static c(La/kdb;JJLjava/lang/String;Ljava/util/ArrayList;ZI)La/kdb;
    .locals 12

    .line 1
    move/from16 v0, p8

    .line 2
    .line 3
    iget-wide v1, p0, La/kdb;->a:J

    .line 4
    .line 5
    iget-object v3, p0, La/kdb;->b:Ljava/lang/String;

    .line 6
    .line 7
    and-int/lit8 v4, v0, 0x4

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    iget-wide v4, p0, La/kdb;->c:J

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
    iget-wide v6, p0, La/kdb;->d:J

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-wide v6, p3

    .line 23
    :goto_1
    iget-object v8, p0, La/kdb;->e:Ljava/lang/String;

    .line 24
    .line 25
    and-int/lit8 v9, v0, 0x20

    .line 26
    .line 27
    if-eqz v9, :cond_2

    .line 28
    .line 29
    iget-object v9, p0, La/kdb;->f:Ljava/lang/String;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object/from16 v9, p5

    .line 33
    .line 34
    :goto_2
    and-int/lit16 v0, v0, 0x80

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-boolean p0, p0, La/kdb;->h:Z

    .line 39
    .line 40
    move v11, p0

    .line 41
    goto :goto_3

    .line 42
    :cond_3
    move/from16 v11, p7

    .line 43
    .line 44
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v0, La/kdb;

    .line 51
    .line 52
    move-object/from16 v10, p6

    .line 53
    .line 54
    invoke-direct/range {v0 .. v11}, La/kdb;-><init>(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/kdb;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/kdb;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, La/kdb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/kdb;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    iget-object v0, p0, La/kdb;->e:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p1, La/kdb;->e:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, La/kdb;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/kdb;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, La/kdb;->f:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v1, p1, La/kdb;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-boolean p0, p0, La/kdb;->h:Z

    .line 43
    .line 44
    iget-boolean p1, p1, La/kdb;->h:Z

    .line 45
    .line 46
    if-ne p0, p1, :cond_2

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/kdb;->e:Ljava/lang/String;

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
    iget-object v2, p0, La/kdb;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/kdb;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean p0, p0, La/kdb;->h:Z

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ChampGroupItem(id="

    .line 2
    .line 3
    const-string v1, ", title="

    .line 4
    .line 5
    iget-wide v2, p0, La/kdb;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/kdb;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", sportId="

    .line 14
    .line 15
    const-string v2, ", subSportId="

    .line 16
    .line 17
    iget-wide v3, p0, La/kdb;->c:J

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", image="

    .line 23
    .line 24
    iget-wide v2, p0, La/kdb;->d:J

    .line 25
    .line 26
    iget-object v4, p0, La/kdb;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", gamesCount="

    .line 32
    .line 33
    const-string v2, ", champSubItems="

    .line 34
    .line 35
    iget-object v3, p0, La/kdb;->f:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v4, p0, La/kdb;->g:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v1, v3, v2, v0, v4}, La/ua80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", expanded="

    .line 43
    .line 44
    const-string v2, ")"

    .line 45
    .line 46
    iget-boolean p0, p0, La/kdb;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
