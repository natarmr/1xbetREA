.class public final La/l4m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m4m0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:J

.field public final d:F

.field public final e:B

.field public final f:F

.field public final g:F


# direct methods
.method public constructor <init>(Ljava/lang/String;JJFIFF)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/l4m0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-wide p2, p0, La/l4m0;->b:J

    .line 10
    .line 11
    iput-wide p4, p0, La/l4m0;->c:J

    .line 12
    .line 13
    iput p6, p0, La/l4m0;->d:F

    .line 14
    .line 15
    iput-byte p7, p0, La/l4m0;->e:B

    .line 16
    .line 17
    iput p8, p0, La/l4m0;->f:F

    .line 18
    .line 19
    iput p9, p0, La/l4m0;->g:F

    .line 20
    .line 21
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
    instance-of v0, p1, La/l4m0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/l4m0;

    .line 10
    .line 11
    iget-object v0, p0, La/l4m0;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/l4m0;->a:Ljava/lang/String;

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
    goto :goto_1

    .line 22
    :cond_2
    iget-wide v0, p1, La/l4m0;->b:J

    .line 23
    .line 24
    sget v2, La/y3d;->h:I

    .line 25
    .line 26
    iget-wide v2, p0, La/l4m0;->b:J

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
    goto :goto_1

    .line 35
    :cond_3
    iget-wide v0, p0, La/l4m0;->c:J

    .line 36
    .line 37
    iget-wide v2, p1, La/l4m0;->c:J

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, La/daq0;->a(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    iget v0, p0, La/l4m0;->d:F

    .line 47
    .line 48
    iget v1, p1, La/l4m0;->d:F

    .line 49
    .line 50
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    iget-byte v0, p0, La/l4m0;->e:B

    .line 58
    .line 59
    iget-byte v1, p1, La/l4m0;->e:B

    .line 60
    .line 61
    if-ne v0, v1, :cond_8

    .line 62
    .line 63
    iget v0, p0, La/l4m0;->f:F

    .line 64
    .line 65
    iget v1, p1, La/l4m0;->f:F

    .line 66
    .line 67
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_6

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_6
    iget p0, p0, La/l4m0;->g:F

    .line 75
    .line 76
    iget p1, p1, La/l4m0;->g:F

    .line 77
    .line 78
    invoke-static {p0, p1}, La/ycl;->b(FF)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-nez p0, :cond_7

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_7
    :goto_0
    const/4 p0, 0x1

    .line 86
    return p0

    .line 87
    :cond_8
    :goto_1
    const/4 p0, 0x0

    .line 88
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/l4m0;->a:Ljava/lang/String;

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
    sget v2, La/y3d;->h:I

    .line 11
    .line 12
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 13
    .line 14
    iget-wide v2, p0, La/l4m0;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sget-object v2, La/daq0;->b:[La/eaq0;

    .line 21
    .line 22
    iget-wide v2, p0, La/l4m0;->c:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/l4m0;->d:F

    .line 29
    .line 30
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-byte v2, p0, La/l4m0;->e:B

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/l4m0;->f:F

    .line 41
    .line 42
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget p0, p0, La/l4m0;->g:F

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

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
    .locals 9

    .line 1
    iget-wide v0, p0, La/l4m0;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/l4m0;->c:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/daq0;->f(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, La/l4m0;->d:F

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-byte v3, p0, La/l4m0;->e:B

    .line 20
    .line 21
    invoke-static {v3}, La/f2q0;->a(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v4, p0, La/l4m0;->f:F

    .line 26
    .line 27
    invoke-static {v4}, La/ycl;->c(F)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget v5, p0, La/l4m0;->g:F

    .line 32
    .line 33
    invoke-static {v5}, La/ycl;->c(F)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v6, ", background="

    .line 38
    .line 39
    const-string v7, ", textSize="

    .line 40
    .line 41
    const-string v8, "ValueCellUiModel(title="

    .line 42
    .line 43
    iget-object p0, p0, La/l4m0;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v8, p0, v6, v0, v7}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, ", width="

    .line 50
    .line 51
    const-string v6, ", align="

    .line 52
    .line 53
    invoke-static {p0, v1, v0, v2, v6}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, ", startPadding="

    .line 57
    .line 58
    const-string v1, ", verticalPadding="

    .line 59
    .line 60
    invoke-static {p0, v3, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, ")"

    .line 64
    .line 65
    invoke-static {p0, v5, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
