.class public final La/z2l;
.super La/a3l;
.source "SourceFile"


# instance fields
.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:F

.field public final e:F

.field public final f:La/j6l;


# direct methods
.method public constructor <init>(ZLjava/lang/String;FFLa/j6l;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/j6l;->a:La/j6l;

    .line 5
    .line 6
    if-ne p5, v0, :cond_0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const v0, 0x7f0804bc

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const v1, 0x7f0804bb

    .line 15
    .line 16
    .line 17
    if-ne p5, v0, :cond_1

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    :goto_0
    move v0, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v0, La/j6l;->b:La/j6l;

    .line 24
    .line 25
    if-ne p5, v0, :cond_2

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    const v0, 0x7f0804ba

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    if-ne p5, v0, :cond_3

    .line 34
    .line 35
    if-nez p1, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    const/4 v0, 0x0

    .line 39
    :goto_1
    invoke-direct {p0, v0}, La/a3l;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-boolean p1, p0, La/z2l;->b:Z

    .line 43
    .line 44
    iput-object p2, p0, La/z2l;->c:Ljava/lang/String;

    .line 45
    .line 46
    iput p3, p0, La/z2l;->d:F

    .line 47
    .line 48
    iput p4, p0, La/z2l;->e:F

    .line 49
    .line 50
    iput-object p5, p0, La/z2l;->f:La/j6l;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/z2l;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()F
    .locals 0

    .line 1
    iget p0, p0, La/z2l;->d:F

    .line 2
    .line 3
    return p0
.end method

.method public final c()F
    .locals 0

    .line 1
    iget p0, p0, La/z2l;->e:F

    .line 2
    .line 3
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/z2l;

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
    check-cast p1, La/z2l;

    .line 12
    .line 13
    iget-boolean v1, p0, La/z2l;->b:Z

    .line 14
    .line 15
    iget-boolean v3, p1, La/z2l;->b:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/z2l;->c:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, La/z2l;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget v1, p0, La/z2l;->d:F

    .line 32
    .line 33
    iget v3, p1, La/z2l;->d:F

    .line 34
    .line 35
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget v1, p0, La/z2l;->e:F

    .line 43
    .line 44
    iget v3, p1, La/z2l;->e:F

    .line 45
    .line 46
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object p0, p0, La/z2l;->f:La/j6l;

    .line 54
    .line 55
    iget-object p1, p1, La/z2l;->f:La/j6l;

    .line 56
    .line 57
    if-eq p0, p1, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/z2l;->b:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v2, p0, La/z2l;->c:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/z2l;->d:F

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/z2l;->e:F

    .line 23
    .line 24
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, La/z2l;->f:La/j6l;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", buildingName="

    .line 2
    .line 3
    const-string v1, ", positionX="

    .line 4
    .line 5
    const-string v2, "DotaBuildingTowerUiModel(active="

    .line 6
    .line 7
    iget-object v3, p0, La/z2l;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, La/z2l;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v4, v1}, La/axq;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", positionY="

    .line 16
    .line 17
    const-string v2, ", race="

    .line 18
    .line 19
    iget v3, p0, La/z2l;->d:F

    .line 20
    .line 21
    iget v4, p0, La/z2l;->e:F

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, La/vqd;->v(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/z2l;->f:La/j6l;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ")"

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
