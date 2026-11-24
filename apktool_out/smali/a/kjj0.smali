.class public final La/kjj0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:J

.field public final c:B

.field public final d:J

.field public final e:F


# direct methods
.method public constructor <init>(FIJJ)V
    .locals 8

    .line 1
    and-int/lit8 p2, p2, 0x8

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const-wide/16 p5, 0x0

    .line 6
    .line 7
    :cond_0
    move-wide v2, p5

    .line 8
    const-wide/16 p5, 0x10

    .line 9
    .line 10
    cmp-long p2, p3, p5

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    :goto_0
    move-wide v6, p3

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    sget-wide p3, La/y3d;->b:J

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :goto_1
    const/4 v1, 0x3

    .line 20
    const/high16 v5, 0x3f800000    # 1.0f

    .line 21
    .line 22
    move-object v0, p0

    .line 23
    move v4, p1

    .line 24
    invoke-direct/range {v0 .. v7}, La/kjj0;-><init>(IJFFJ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(IJFFJ)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p4, p0, La/kjj0;->a:F

    .line 30
    iput-wide p2, p0, La/kjj0;->b:J

    .line 31
    iput-byte p1, p0, La/kjj0;->c:B

    .line 32
    iput-wide p6, p0, La/kjj0;->d:J

    const/4 p1, 0x0

    const/high16 p2, 0x3f800000    # 1.0f

    .line 33
    invoke-static {p5, p1, p2}, La/l1e0;->c(FFF)F

    move-result p1

    iput p1, p0, La/kjj0;->e:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/kjj0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/kjj0;

    .line 10
    .line 11
    iget v0, p1, La/kjj0;->a:F

    .line 12
    .line 13
    iget v1, p0, La/kjj0;->a:F

    .line 14
    .line 15
    invoke-static {v1, v0}, La/ycl;->b(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    const/4 v0, 0x0

    .line 23
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_3
    iget-wide v0, p0, La/kjj0;->b:J

    .line 31
    .line 32
    iget-wide v2, p1, La/kjj0;->b:J

    .line 33
    .line 34
    cmp-long v0, v0, v2

    .line 35
    .line 36
    if-nez v0, :cond_5

    .line 37
    .line 38
    iget v0, p0, La/kjj0;->e:F

    .line 39
    .line 40
    iget v1, p1, La/kjj0;->e:F

    .line 41
    .line 42
    cmpg-float v0, v0, v1

    .line 43
    .line 44
    if-nez v0, :cond_5

    .line 45
    .line 46
    iget-byte v0, p0, La/kjj0;->c:B

    .line 47
    .line 48
    iget-byte v1, p1, La/kjj0;->c:B

    .line 49
    .line 50
    if-ne v0, v1, :cond_5

    .line 51
    .line 52
    iget-wide v0, p1, La/kjj0;->d:J

    .line 53
    .line 54
    sget p1, La/y3d;->h:I

    .line 55
    .line 56
    iget-wide p0, p0, La/kjj0;->d:J

    .line 57
    .line 58
    invoke-static {p0, p1, v0, v1}, La/h2t0;->a(JJ)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/kjj0;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    const/4 v2, 0x0

    .line 11
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-wide v2, p0, La/kjj0;->b:J

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v2, p0, La/kjj0;->e:F

    .line 22
    .line 23
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-byte v2, p0, La/kjj0;->c:B

    .line 28
    .line 29
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sget v2, La/y3d;->h:I

    .line 34
    .line 35
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 36
    .line 37
    iget-wide v2, p0, La/kjj0;->d:J

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, La/kjj0;->a:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-wide v2, p0, La/kjj0;->b:J

    .line 13
    .line 14
    invoke-static {v2, v3}, La/adl;->c(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-byte v3, p0, La/kjj0;->c:B

    .line 19
    .line 20
    invoke-static {v3}, La/l78;->a(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-wide v4, p0, La/kjj0;->d:J

    .line 25
    .line 26
    invoke-static {v4, v5}, La/y3d;->i(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, ", spread="

    .line 31
    .line 32
    const-string v6, ", offset="

    .line 33
    .line 34
    const-string v7, "Shadow(radius="

    .line 35
    .line 36
    invoke-static {v7, v0, v5, v1, v6}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", alpha="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget p0, p0, La/kjj0;->e:F

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ", blendMode="

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, ", color="

    .line 59
    .line 60
    const-string v1, ", brush=null)"

    .line 61
    .line 62
    invoke-static {v0, v3, p0, v4, v1}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method
