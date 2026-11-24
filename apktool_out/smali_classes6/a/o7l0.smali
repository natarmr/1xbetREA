.class public final La/o7l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7l0;


# instance fields
.field public final a:La/a2l0;

.field public final b:I

.field public final c:Ljava/lang/Integer;

.field public final d:La/t1l0;

.field public final e:La/z2l0;


# direct methods
.method public constructor <init>(La/a2l0;ILjava/lang/Integer;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/o7l0;->a:La/a2l0;

    .line 5
    .line 6
    iput p2, p0, La/o7l0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, La/o7l0;->c:Ljava/lang/Integer;

    .line 9
    .line 10
    new-instance v0, La/t1l0;

    .line 11
    .line 12
    sget-object v1, La/p1l0;->c:La/p1l0;

    .line 13
    .line 14
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 15
    .line 16
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 21
    .line 22
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    move-wide v3, v2

    .line 27
    new-instance v2, La/y3d;

    .line 28
    .line 29
    invoke-direct {v2, v3, v4}, La/y3d;-><init>(J)V

    .line 30
    .line 31
    .line 32
    const/16 v7, 0xc0

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    move-object v4, p3

    .line 38
    invoke-direct/range {v0 .. v7}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/o7l0;->d:La/t1l0;

    .line 42
    .line 43
    new-instance p1, La/z2l0;

    .line 44
    .line 45
    new-instance p3, La/fpe;

    .line 46
    .line 47
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 52
    .line 53
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    new-instance v2, La/y3d;

    .line 58
    .line 59
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    const/4 v1, 0x2

    .line 64
    invoke-direct {p3, v2, v0, v1}, La/fpe;-><init>(La/y3d;ZI)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 72
    .line 73
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    invoke-direct {p1, p3, p2, v0, v1}, La/z2l0;-><init>(La/fpe;IJ)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, La/o7l0;->e:La/z2l0;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/o7l0;->d:La/t1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/o7l0;->e:La/z2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/o7l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/o7l0;

    .line 10
    .line 11
    iget-object v0, p0, La/o7l0;->a:La/a2l0;

    .line 12
    .line 13
    iget-object v1, p1, La/o7l0;->a:La/a2l0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/a2l0;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/o7l0;->b:I

    .line 23
    .line 24
    iget v1, p1, La/o7l0;->b:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object p0, p0, La/o7l0;->c:Ljava/lang/Integer;

    .line 30
    .line 31
    iget-object p1, p1, La/o7l0;->c:Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/o7l0;->a:La/a2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/o7l0;->a:La/a2l0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/a2l0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, La/o7l0;->b:I

    .line 10
    .line 11
    const/16 v2, 0x3c1

    .line 12
    .line 13
    invoke-static {v1, v0, v2}, La/twn;->a(III)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object p0, p0, La/o7l0;->c:Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    add-int/2addr p0, v0

    .line 24
    mul-int/2addr p0, v2

    .line 25
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ResultChampionshipCounter(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/o7l0;->a:La/a2l0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", counterValue="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, La/o7l0;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", iconUrl=null, iconResId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", iconColor=null, badgeStyle=null)"

    .line 29
    .line 30
    iget-object p0, p0, La/o7l0;->c:Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-static {v0, p0, v1}, La/dw9;->q(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
