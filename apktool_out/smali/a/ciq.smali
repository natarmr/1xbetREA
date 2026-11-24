.class public final La/ciq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vhv0;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/ciq;->a:F

    .line 5
    .line 6
    iput p2, p0, La/ciq;->b:F

    .line 7
    .line 8
    iput p3, p0, La/ciq;->c:F

    .line 9
    .line 10
    iput p4, p0, La/ciq;->d:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(La/w6k;La/k6z;)I
    .locals 0

    .line 1
    iget p0, p0, La/ciq;->a:F

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(La/w6k;)I
    .locals 0

    .line 1
    iget p0, p0, La/ciq;->d:F

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c(La/w6k;La/k6z;)I
    .locals 0

    .line 1
    iget p0, p0, La/ciq;->c:F

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d(La/w6k;)I
    .locals 0

    .line 1
    iget p0, p0, La/ciq;->b:F

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/ciq;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/ciq;

    .line 10
    .line 11
    iget v0, p1, La/ciq;->a:F

    .line 12
    .line 13
    iget v1, p0, La/ciq;->a:F

    .line 14
    .line 15
    invoke-static {v1, v0}, La/ycl;->b(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget v0, p0, La/ciq;->b:F

    .line 22
    .line 23
    iget v1, p1, La/ciq;->b:F

    .line 24
    .line 25
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget v0, p0, La/ciq;->c:F

    .line 32
    .line 33
    iget v1, p1, La/ciq;->c:F

    .line 34
    .line 35
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget p0, p0, La/ciq;->d:F

    .line 42
    .line 43
    iget p1, p1, La/ciq;->d:F

    .line 44
    .line 45
    invoke-static {p0, p1}, La/ycl;->b(FF)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    :goto_0
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 54
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/ciq;->a:F

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
    iget v2, p0, La/ciq;->b:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/ciq;->c:F

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, La/ciq;->d:F

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

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
    .locals 6

    .line 1
    iget v0, p0, La/ciq;->a:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/ciq;->b:F

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, La/ciq;->c:F

    .line 14
    .line 15
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget p0, p0, La/ciq;->d:F

    .line 20
    .line 21
    invoke-static {p0}, La/ycl;->c(F)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v3, ", top="

    .line 26
    .line 27
    const-string v4, ", right="

    .line 28
    .line 29
    const-string v5, "Insets(left="

    .line 30
    .line 31
    invoke-static {v5, v0, v3, v1, v4}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, ", bottom="

    .line 36
    .line 37
    const-string v3, ")"

    .line 38
    .line 39
    invoke-static {v0, v2, v1, p0, v3}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
