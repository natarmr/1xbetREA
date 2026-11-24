.class public final La/qx30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sx30;


# instance fields
.field public final a:La/o0x;

.field public final b:J

.field public final c:La/miz;

.field public final d:I

.field public final e:J

.field public final f:F


# direct methods
.method public constructor <init>(La/o0x;JLa/miz;IFI)V
    .locals 1

    .line 1
    and-int/lit8 v0, p7, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, La/s6t0;->a:La/pz40;

    .line 6
    .line 7
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-object p2, p2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 12
    .line 13
    invoke-virtual {p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    and-int/lit8 p7, p7, 0x20

    .line 18
    .line 19
    if-eqz p7, :cond_1

    .line 20
    .line 21
    sget-object p6, La/qmk;->a:La/zcl;

    .line 22
    .line 23
    const/high16 p6, 0x41c00000    # 24.0f

    .line 24
    .line 25
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/qx30;->a:La/o0x;

    .line 29
    .line 30
    iput-wide p2, p0, La/qx30;->b:J

    .line 31
    .line 32
    iput-object p4, p0, La/qx30;->c:La/miz;

    .line 33
    .line 34
    iput p5, p0, La/qx30;->d:I

    .line 35
    .line 36
    iput-wide p2, p0, La/qx30;->e:J

    .line 37
    .line 38
    iput p6, p0, La/qx30;->f:F

    .line 39
    .line 40
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
    instance-of v0, p1, La/qx30;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/qx30;

    .line 10
    .line 11
    iget-object v0, p0, La/qx30;->a:La/o0x;

    .line 12
    .line 13
    iget-object v1, p1, La/qx30;->a:La/o0x;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-wide v0, p1, La/qx30;->b:J

    .line 23
    .line 24
    sget v2, La/y3d;->h:I

    .line 25
    .line 26
    iget-wide v2, p0, La/qx30;->b:J

    .line 27
    .line 28
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-object v0, p0, La/qx30;->c:La/miz;

    .line 36
    .line 37
    iget-object v1, p1, La/qx30;->c:La/miz;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget v0, p0, La/qx30;->d:I

    .line 47
    .line 48
    iget v1, p1, La/qx30;->d:I

    .line 49
    .line 50
    if-eq v0, v1, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-wide v0, p0, La/qx30;->e:J

    .line 54
    .line 55
    iget-wide v2, p1, La/qx30;->e:J

    .line 56
    .line 57
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget p0, p0, La/qx30;->f:F

    .line 65
    .line 66
    iget p1, p1, La/qx30;->f:F

    .line 67
    .line 68
    invoke-static {p0, p1}, La/ycl;->b(FF)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_7

    .line 73
    .line 74
    :goto_0
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 77
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/qx30;->a:La/o0x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    sget v2, La/y3d;->h:I

    .line 11
    .line 12
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 13
    .line 14
    iget-wide v2, p0, La/qx30;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, La/qx30;->c:La/miz;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    mul-int/2addr v2, v1

    .line 28
    iget v0, p0, La/qx30;->d:I

    .line 29
    .line 30
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/qx30;->e:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget p0, p0, La/qx30;->f:F

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-wide v0, p0, La/qx30;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/qx30;->e:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, La/qx30;->f:F

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v4, "Icon(imageLink="

    .line 22
    .line 23
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, p0, La/qx30;->a:La/o0x;

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v4, ", imageTintColor="

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", badge="

    .line 40
    .line 41
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, La/qx30;->c:La/miz;

    .line 45
    .line 46
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, ", placeholderResId="

    .line 50
    .line 51
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget p0, p0, La/qx30;->d:I

    .line 55
    .line 56
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p0, ", placeholderTintColor="

    .line 60
    .line 61
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p0, ", iconSize="

    .line 65
    .line 66
    const-string v0, ")"

    .line 67
    .line 68
    invoke-static {v3, v1, p0, v2, v0}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
