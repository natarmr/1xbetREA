.class public final La/cw5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:La/lel;

.field public final f:J


# direct methods
.method public constructor <init>(ZZZZLa/lel;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/cw5;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, La/cw5;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, La/cw5;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, La/cw5;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, La/cw5;->e:La/lel;

    .line 13
    .line 14
    iput-wide p6, p0, La/cw5;->f:J

    .line 15
    .line 16
    return-void
.end method

.method public static a(La/cw5;ZZZLa/lel;JI)La/cw5;
    .locals 8

    .line 1
    and-int/lit8 v0, p7, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, La/cw5;->a:Z

    .line 6
    .line 7
    :cond_0
    move v1, p1

    .line 8
    and-int/lit8 p1, p7, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-boolean p1, p0, La/cw5;->b:Z

    .line 13
    .line 14
    :goto_0
    move v2, p1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :goto_1
    and-int/lit8 p1, p7, 0x4

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-boolean p2, p0, La/cw5;->c:Z

    .line 23
    .line 24
    :cond_2
    move v3, p2

    .line 25
    and-int/lit8 p1, p7, 0x8

    .line 26
    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    iget-boolean p3, p0, La/cw5;->d:Z

    .line 30
    .line 31
    :cond_3
    move v4, p3

    .line 32
    and-int/lit8 p1, p7, 0x10

    .line 33
    .line 34
    if-eqz p1, :cond_4

    .line 35
    .line 36
    iget-object p4, p0, La/cw5;->e:La/lel;

    .line 37
    .line 38
    :cond_4
    move-object v5, p4

    .line 39
    and-int/lit8 p1, p7, 0x20

    .line 40
    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    iget-wide p5, p0, La/cw5;->f:J

    .line 44
    .line 45
    :cond_5
    move-wide v6, p5

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v0, La/cw5;

    .line 50
    .line 51
    invoke-direct/range {v0 .. v7}, La/cw5;-><init>(ZZZZLa/lel;J)V

    .line 52
    .line 53
    .line 54
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
    instance-of v0, p1, La/cw5;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/cw5;

    .line 10
    .line 11
    iget-boolean v0, p0, La/cw5;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/cw5;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, La/cw5;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, La/cw5;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean v0, p0, La/cw5;->c:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/cw5;->c:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-boolean v0, p0, La/cw5;->d:Z

    .line 33
    .line 34
    iget-boolean v1, p1, La/cw5;->d:Z

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-object v0, p0, La/cw5;->e:La/lel;

    .line 40
    .line 41
    iget-object v1, p1, La/cw5;->e:La/lel;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-wide v0, p1, La/cw5;->f:J

    .line 51
    .line 52
    sget p1, La/y3d;->h:I

    .line 53
    .line 54
    iget-wide p0, p0, La/cw5;->f:J

    .line 55
    .line 56
    invoke-static {p0, p1, v0, v1}, La/h2t0;->a(JJ)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_7

    .line 61
    .line 62
    :goto_0
    const/4 p0, 0x0

    .line 63
    return p0

    .line 64
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 65
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/cw5;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, La/cw5;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/cw5;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/cw5;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/cw5;->e:La/lel;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    sget v0, La/y3d;->h:I

    .line 37
    .line 38
    sget-object v0, La/h2t0;->b:La/g2t0;

    .line 39
    .line 40
    iget-wide v0, p0, La/cw5;->f:J

    .line 41
    .line 42
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v2

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, La/cw5;->f:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", applyNavigationBarsPadding="

    .line 8
    .line 9
    const-string v2, ", dragHandleVisible="

    .line 10
    .line 11
    const-string v3, "ScreenParameters(applyImePadding="

    .line 12
    .line 13
    iget-boolean v4, p0, La/cw5;->a:Z

    .line 14
    .line 15
    iget-boolean v5, p0, La/cw5;->b:Z

    .line 16
    .line 17
    invoke-static {v3, v1, v2, v4, v5}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, ", overlayBackground="

    .line 22
    .line 23
    const-string v3, ", dragHandleStyle="

    .line 24
    .line 25
    iget-boolean v4, p0, La/cw5;->c:Z

    .line 26
    .line 27
    iget-boolean v5, p0, La/cw5;->d:Z

    .line 28
    .line 29
    invoke-static {v2, v3, v1, v4, v5}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/cw5;->e:La/lel;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, ", backgroundColor="

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, ")"

    .line 46
    .line 47
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method
