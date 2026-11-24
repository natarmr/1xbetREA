.class public final La/wa8;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:F

.field public final d:F

.field public final e:I


# direct methods
.method public constructor <init>(FFI)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, La/p4;-><init>(BZ)V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/wa8;->c:F

    .line 8
    .line 9
    iput p2, p0, La/wa8;->d:F

    .line 10
    .line 11
    iput p3, p0, La/wa8;->e:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/wa8;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/wa8;

    .line 10
    .line 11
    iget v0, p1, La/wa8;->c:F

    .line 12
    .line 13
    iget v1, p0, La/wa8;->c:F

    .line 14
    .line 15
    cmpg-float v0, v1, v0

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget v0, p0, La/wa8;->d:F

    .line 20
    .line 21
    iget v1, p1, La/wa8;->d:F

    .line 22
    .line 23
    cmpg-float v0, v0, v1

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget p0, p0, La/wa8;->e:I

    .line 28
    .line 29
    iget p1, p1, La/wa8;->e:I

    .line 30
    .line 31
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    :goto_0
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/wa8;->c:F

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
    iget v2, p0, La/wa8;->d:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget p0, p0, La/wa8;->e:I

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, La/wa8;->e:I

    .line 2
    .line 3
    invoke-static {v0}, La/knm0;->u(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", radiusY="

    .line 8
    .line 9
    const-string v2, ", edgeTreatment="

    .line 10
    .line 11
    iget v3, p0, La/wa8;->c:F

    .line 12
    .line 13
    iget p0, p0, La/wa8;->d:F

    .line 14
    .line 15
    const-string v4, "BlurEffect(renderEffect=null, radiusX="

    .line 16
    .line 17
    invoke-static {v3, p0, v4, v1, v2}, La/dw9;->s(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v1, ")"

    .line 22
    .line 23
    invoke-static {p0, v0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final u0()Landroid/graphics/RenderEffect;
    .locals 4

    .line 1
    iget v0, p0, La/wa8;->c:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v2, v0, v1

    .line 5
    .line 6
    iget v3, p0, La/wa8;->d:F

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    cmpg-float v1, v3, v1

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, La/tl50;->e()Landroid/graphics/RenderEffect;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    iget p0, p0, La/wa8;->e:I

    .line 20
    .line 21
    invoke-static {p0}, La/knx;->R(I)Landroid/graphics/Shader$TileMode;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {v0, v3, p0}, La/tl50;->g(FFLandroid/graphics/Shader$TileMode;)Landroid/graphics/RenderEffect;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
