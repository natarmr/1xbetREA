.class public final La/h4d;
.super La/a4d;
.source "SourceFile"


# instance fields
.field public b:[F


# virtual methods
.method public final a()[F
    .locals 3

    .line 1
    iget-object v0, p0, La/h4d;->b:[F

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/a4d;->a:Landroid/graphics/ColorFilter;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/graphics/ColorMatrixColorFilter;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x1a

    .line 12
    .line 13
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    if-gt v1, v2, :cond_0

    .line 16
    .line 17
    check-cast v0, Landroid/graphics/ColorMatrixColorFilter;

    .line 18
    .line 19
    new-instance v1, Landroid/graphics/ColorMatrix;

    .line 20
    .line 21
    invoke-direct {v1}, Landroid/graphics/ColorMatrix;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, La/y24;->i(Landroid/graphics/ColorMatrixColorFilter;Landroid/graphics/ColorMatrix;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/graphics/ColorMatrix;->getArray()[F

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/h4d;->b:[F

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    const-string p0, "Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version"

    .line 35
    .line 36
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0

    .line 41
    :cond_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/h4d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0}, La/h4d;->a()[F

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p1, La/h4d;

    .line 16
    .line 17
    invoke-virtual {p1}, La/h4d;->a()[F

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([F[F)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_2

    .line 26
    .line 27
    return v2

    .line 28
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La/h4d;->b:[F

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([F)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, La/h4d;->b:[F

    .line 2
    .line 3
    const-string v0, ")"

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "null"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "ColorMatrix(values="

    .line 15
    .line 16
    invoke-static {v1, p0, v0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    const-string v1, "ColorMatrixColorFilter(colorMatrix="

    .line 21
    .line 22
    invoke-static {v1, p0, v0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
