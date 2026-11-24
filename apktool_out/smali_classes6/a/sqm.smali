.class public final La/sqm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:J

.field public final e:La/zcl;


# direct methods
.method public constructor <init>(FFFJLa/zcl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/sqm;->a:F

    .line 5
    .line 6
    iput p2, p0, La/sqm;->b:F

    .line 7
    .line 8
    iput p3, p0, La/sqm;->c:F

    .line 9
    .line 10
    iput-wide p4, p0, La/sqm;->d:J

    .line 11
    .line 12
    iput-object p6, p0, La/sqm;->e:La/zcl;

    .line 13
    .line 14
    return-void
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
    instance-of v0, p1, La/sqm;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/sqm;

    .line 10
    .line 11
    iget v0, p0, La/sqm;->a:F

    .line 12
    .line 13
    iget v1, p1, La/sqm;->a:F

    .line 14
    .line 15
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

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
    iget v0, p0, La/sqm;->b:F

    .line 23
    .line 24
    iget v1, p1, La/sqm;->b:F

    .line 25
    .line 26
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

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
    iget v0, p0, La/sqm;->c:F

    .line 34
    .line 35
    iget v1, p1, La/sqm;->c:F

    .line 36
    .line 37
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

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
    const/4 v0, 0x0

    .line 45
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    iget-wide v0, p1, La/sqm;->d:J

    .line 53
    .line 54
    sget v2, La/y3d;->h:I

    .line 55
    .line 56
    iget-wide v2, p0, La/sqm;->d:J

    .line 57
    .line 58
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-object p0, p0, La/sqm;->e:La/zcl;

    .line 66
    .line 67
    iget-object p1, p1, La/sqm;->e:La/zcl;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/zcl;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-nez p0, :cond_7

    .line 74
    .line 75
    :goto_0
    const/4 p0, 0x0

    .line 76
    return p0

    .line 77
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 78
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/sqm;->a:F

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
    iget v2, p0, La/sqm;->b:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/sqm;->c:F

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sget v2, La/y3d;->h:I

    .line 28
    .line 29
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 30
    .line 31
    iget-wide v2, p0, La/sqm;->d:J

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object p0, p0, La/sqm;->e:La/zcl;

    .line 38
    .line 39
    iget p0, p0, La/zcl;->a:F

    .line 40
    .line 41
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    add-int/2addr p0, v0

    .line 46
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, La/sqm;->a:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/sqm;->b:F

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, La/sqm;->c:F

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {v3}, La/ycl;->c(F)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-wide v4, p0, La/sqm;->d:J

    .line 25
    .line 26
    invoke-static {v4, v5}, La/y3d;->i(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, ", offsetY="

    .line 31
    .line 32
    const-string v6, ", blur="

    .line 33
    .line 34
    const-string v7, "DsShadowConfig(offsetX="

    .line 35
    .line 36
    invoke-static {v7, v0, v5, v1, v6}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, ", spread="

    .line 41
    .line 42
    const-string v5, ", color="

    .line 43
    .line 44
    invoke-static {v0, v2, v1, v3, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", radius="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, La/sqm;->e:La/zcl;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, ")"

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
