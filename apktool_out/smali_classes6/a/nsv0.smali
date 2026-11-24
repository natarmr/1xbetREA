.class public final La/nsv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:F

.field public final e:F

.field public final f:F


# direct methods
.method public constructor <init>(IIIFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/nsv0;->a:I

    .line 5
    .line 6
    iput p2, p0, La/nsv0;->b:I

    .line 7
    .line 8
    iput p3, p0, La/nsv0;->c:I

    .line 9
    .line 10
    iput p4, p0, La/nsv0;->d:F

    .line 11
    .line 12
    iput p5, p0, La/nsv0;->e:F

    .line 13
    .line 14
    iput p6, p0, La/nsv0;->f:F

    .line 15
    .line 16
    return-void
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
    instance-of v0, p1, La/nsv0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/nsv0;

    .line 10
    .line 11
    iget v0, p0, La/nsv0;->a:I

    .line 12
    .line 13
    iget v1, p1, La/nsv0;->a:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, La/nsv0;->b:I

    .line 19
    .line 20
    iget v1, p1, La/nsv0;->b:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget v0, p0, La/nsv0;->c:I

    .line 26
    .line 27
    iget v1, p1, La/nsv0;->c:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget v0, p0, La/nsv0;->d:F

    .line 33
    .line 34
    iget v1, p1, La/nsv0;->d:F

    .line 35
    .line 36
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    iget v0, p0, La/nsv0;->e:F

    .line 44
    .line 45
    iget v1, p1, La/nsv0;->e:F

    .line 46
    .line 47
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget p0, p0, La/nsv0;->f:F

    .line 55
    .line 56
    iget p1, p1, La/nsv0;->f:F

    .line 57
    .line 58
    invoke-static {p0, p1}, La/ycl;->b(FF)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_7

    .line 63
    .line 64
    :goto_0
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/nsv0;->a:I

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
    iget v2, p0, La/nsv0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/nsv0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/nsv0;->d:F

    .line 23
    .line 24
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/nsv0;->e:F

    .line 29
    .line 30
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget p0, p0, La/nsv0;->f:F

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, La/nsv0;->d:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/nsv0;->e:F

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, La/nsv0;->f:F

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, ", topPx="

    .line 20
    .line 21
    const-string v4, ", bottomPx="

    .line 22
    .line 23
    const-string v5, "XBottomSheetBlockRect(heightPx="

    .line 24
    .line 25
    iget v6, p0, La/nsv0;->a:I

    .line 26
    .line 27
    iget v7, p0, La/nsv0;->b:I

    .line 28
    .line 29
    invoke-static {v5, v6, v3, v4, v7}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const-string v4, ", height="

    .line 34
    .line 35
    const-string v5, ", top="

    .line 36
    .line 37
    iget p0, p0, La/nsv0;->c:I

    .line 38
    .line 39
    invoke-static {p0, v4, v0, v5, v3}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 40
    .line 41
    .line 42
    const-string p0, ", bottom="

    .line 43
    .line 44
    const-string v0, ")"

    .line 45
    .line 46
    invoke-static {v3, v1, p0, v2, v0}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
