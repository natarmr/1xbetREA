.class public final La/fqj0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:La/ghn;

.field public final d:La/a4x;

.field public final e:J

.field public final f:La/zqm;


# direct methods
.method public constructor <init>(FFLa/ghn;La/a4x;JLa/zqm;)V
    .locals 1

    .line 1
    sget-object v0, La/kkf0;->a:La/kkf0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p1, p0, La/fqj0;->a:F

    .line 7
    .line 8
    iput p2, p0, La/fqj0;->b:F

    .line 9
    .line 10
    iput-object p3, p0, La/fqj0;->c:La/ghn;

    .line 11
    .line 12
    iput-object p4, p0, La/fqj0;->d:La/a4x;

    .line 13
    .line 14
    iput-wide p5, p0, La/fqj0;->e:J

    .line 15
    .line 16
    iput-object p7, p0, La/fqj0;->f:La/zqm;

    .line 17
    .line 18
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
    instance-of v0, p1, La/fqj0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/fqj0;

    .line 10
    .line 11
    iget v0, p0, La/fqj0;->a:F

    .line 12
    .line 13
    iget v1, p1, La/fqj0;->a:F

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget v0, p0, La/fqj0;->b:F

    .line 23
    .line 24
    iget v1, p1, La/fqj0;->b:F

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/fqj0;->c:La/ghn;

    .line 34
    .line 35
    iget-object v1, p1, La/fqj0;->c:La/ghn;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    sget-object v0, La/kkf0;->a:La/kkf0;

    .line 45
    .line 46
    iget-object v0, p0, La/fqj0;->d:La/a4x;

    .line 47
    .line 48
    iget-object v1, p1, La/fqj0;->d:La/a4x;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-wide v0, p1, La/fqj0;->e:J

    .line 58
    .line 59
    sget v2, La/y3d;->h:I

    .line 60
    .line 61
    iget-wide v2, p0, La/fqj0;->e:J

    .line 62
    .line 63
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_6

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_6
    iget-object p0, p0, La/fqj0;->f:La/zqm;

    .line 71
    .line 72
    iget-object p1, p1, La/fqj0;->f:La/zqm;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_7

    .line 79
    .line 80
    :goto_0
    const/4 p0, 0x0

    .line 81
    return p0

    .line 82
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 83
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/fqj0;->a:F

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
    iget v2, p0, La/fqj0;->b:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/fqj0;->c:La/ghn;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    sget-object v0, La/kkf0;->a:La/kkf0;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    const/16 v2, 0x9c4

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/16 v2, 0xc8

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/fqj0;->d:La/a4x;

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    sget v2, La/y3d;->h:I

    .line 51
    .line 52
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 53
    .line 54
    iget-wide v2, p0, La/fqj0;->e:J

    .line 55
    .line 56
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object p0, p0, La/fqj0;->f:La/zqm;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    add-int/2addr p0, v0

    .line 67
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, La/kkf0;->a:La/kkf0;

    .line 2
    .line 3
    iget-wide v1, p0, La/fqj0;->e:J

    .line 4
    .line 5
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, ", animationTargetValue="

    .line 10
    .line 11
    const-string v3, ", animationEasing="

    .line 12
    .line 13
    iget v4, p0, La/fqj0;->a:F

    .line 14
    .line 15
    iget v5, p0, La/fqj0;->b:F

    .line 16
    .line 17
    const-string v6, "ShimmerConfig(animationInitialValue="

    .line 18
    .line 19
    invoke-static {v4, v5, v6, v2, v3}, La/dw9;->s(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, La/fqj0;->c:La/ghn;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, ", animationRepeatMode="

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ", animationDuration=2500, animationDelay=200, effectColors="

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, La/fqj0;->d:La/a4x;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ", contentBackgroundColor="

    .line 47
    .line 48
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, ", effectDirection="

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, La/fqj0;->f:La/zqm;

    .line 60
    .line 61
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p0, ")"

    .line 65
    .line 66
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
