.class public final La/yzv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/j0w0;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F


# direct methods
.method public constructor <init>(FFFI)V
    .locals 2

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move p2, v1

    .line 12
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput p1, p0, La/yzv0;->a:F

    .line 16
    .line 17
    iput p2, p0, La/yzv0;->b:F

    .line 18
    .line 19
    iput p3, p0, La/yzv0;->c:F

    .line 20
    .line 21
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
    instance-of v0, p1, La/yzv0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/yzv0;

    .line 10
    .line 11
    iget v0, p0, La/yzv0;->a:F

    .line 12
    .line 13
    iget v1, p1, La/yzv0;->a:F

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
    goto :goto_0

    .line 30
    :cond_3
    iget v0, p0, La/yzv0;->b:F

    .line 31
    .line 32
    iget v1, p1, La/yzv0;->b:F

    .line 33
    .line 34
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget p0, p0, La/yzv0;->c:F

    .line 42
    .line 43
    iget p1, p1, La/yzv0;->c:F

    .line 44
    .line 45
    invoke-static {p0, p1}, La/ycl;->b(FF)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_5

    .line 50
    .line 51
    :goto_0
    const/4 p0, 0x0

    .line 52
    return p0

    .line 53
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 54
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/yzv0;->a:F

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
    iget v2, p0, La/yzv0;->b:F

    .line 16
    .line 17
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget p0, p0, La/yzv0;->c:F

    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    add-int/2addr p0, v0

    .line 28
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, La/yzv0;->a:F

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
    iget v2, p0, La/yzv0;->b:F

    .line 13
    .line 14
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget p0, p0, La/yzv0;->c:F

    .line 19
    .line 20
    invoke-static {p0}, La/ycl;->c(F)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v3, ", top="

    .line 25
    .line 26
    const-string v4, ", right="

    .line 27
    .line 28
    const-string v5, "Custom(left="

    .line 29
    .line 30
    invoke-static {v5, v0, v3, v1, v4}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, ", bottom="

    .line 35
    .line 36
    const-string v3, ")"

    .line 37
    .line 38
    invoke-static {v0, v2, v1, p0, v3}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
