.class public final La/dus0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:La/a4x;

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:F

.field public final h:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/i4;ZLjava/lang/String;FF)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/dus0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, La/dus0;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, La/dus0;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p4, p0, La/dus0;->d:La/a4x;

    .line 20
    .line 21
    iput-boolean p5, p0, La/dus0;->e:Z

    .line 22
    .line 23
    iput-object p6, p0, La/dus0;->f:Ljava/lang/String;

    .line 24
    .line 25
    iput p7, p0, La/dus0;->g:F

    .line 26
    .line 27
    iput p8, p0, La/dus0;->h:F

    .line 28
    .line 29
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
    instance-of v0, p1, La/dus0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/dus0;

    .line 10
    .line 11
    iget-object v0, p0, La/dus0;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/dus0;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/dus0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/dus0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/dus0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/dus0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/dus0;->d:La/a4x;

    .line 45
    .line 46
    iget-object v1, p1, La/dus0;->d:La/a4x;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-boolean v0, p0, La/dus0;->e:Z

    .line 56
    .line 57
    iget-boolean v1, p1, La/dus0;->e:Z

    .line 58
    .line 59
    if-eq v0, v1, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object v0, p0, La/dus0;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p1, La/dus0;->f:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget v0, p0, La/dus0;->g:F

    .line 74
    .line 75
    iget v1, p1, La/dus0;->g:F

    .line 76
    .line 77
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget p0, p0, La/dus0;->h:F

    .line 85
    .line 86
    iget p1, p1, La/dus0;->h:F

    .line 87
    .line 88
    invoke-static {p0, p1}, La/ycl;->b(FF)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-nez p0, :cond_9

    .line 93
    .line 94
    :goto_0
    const/4 p0, 0x0

    .line 95
    return p0

    .line 96
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 97
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/dus0;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/dus0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/dus0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/dus0;->d:La/a4x;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/dus0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/dus0;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/dus0;->g:F

    .line 41
    .line 42
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget p0, p0, La/dus0;->h:F

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
    .locals 7

    .line 1
    iget v0, p0, La/dus0;->g:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/dus0;->h:F

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", score="

    .line 14
    .line 15
    const-string v3, ", speech="

    .line 16
    .line 17
    const-string v4, "TwentyOneDotaHeroUiModel(image="

    .line 18
    .line 19
    iget-object v5, p0, La/dus0;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, La/dus0;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v4, v5, v2, v6, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, ", cardList="

    .line 28
    .line 29
    const-string v4, ", winner="

    .line 30
    .line 31
    iget-object v5, p0, La/dus0;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v6, p0, La/dus0;->d:La/a4x;

    .line 34
    .line 35
    invoke-static {v2, v5, v3, v6, v4}, La/cs0;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;La/a4x;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v3, ", typefacePath="

    .line 39
    .line 40
    const-string v4, ", gameRowHeight="

    .line 41
    .line 42
    iget-object v5, p0, La/dus0;->f:Ljava/lang/String;

    .line 43
    .line 44
    iget-boolean p0, p0, La/dus0;->e:Z

    .line 45
    .line 46
    invoke-static {v3, v5, v4, v2, p0}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 47
    .line 48
    .line 49
    const-string p0, ", heroCardPadding="

    .line 50
    .line 51
    const-string v3, ")"

    .line 52
    .line 53
    invoke-static {v2, v0, p0, v1, v3}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
