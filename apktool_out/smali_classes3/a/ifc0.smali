.class public final La/ifc0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/azc0;

.field public final b:La/wyc0;

.field public final c:La/plc0;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z


# direct methods
.method public constructor <init>(La/azc0;La/wyc0;La/plc0;ZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ifc0;->a:La/azc0;

    .line 5
    .line 6
    iput-object p2, p0, La/ifc0;->b:La/wyc0;

    .line 7
    .line 8
    iput-object p3, p0, La/ifc0;->c:La/plc0;

    .line 9
    .line 10
    iput-boolean p4, p0, La/ifc0;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/ifc0;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, La/ifc0;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, La/ifc0;->g:Z

    .line 17
    .line 18
    return-void
.end method

.method public static a(La/ifc0;La/azc0;La/plc0;ZZZZI)La/ifc0;
    .locals 8

    .line 1
    sget-object v1, La/wyc0;->a:La/wyc0;

    .line 2
    .line 3
    and-int/lit8 v2, p7, 0x1

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, La/ifc0;->a:La/azc0;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v2, p1

    .line 11
    :goto_0
    and-int/lit8 v3, p7, 0x2

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, La/ifc0;->b:La/wyc0;

    .line 16
    .line 17
    :cond_1
    and-int/lit8 v3, p7, 0x4

    .line 18
    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    iget-object v3, p0, La/ifc0;->c:La/plc0;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    move-object v3, p2

    .line 25
    :goto_1
    and-int/lit8 v4, p7, 0x8

    .line 26
    .line 27
    if-eqz v4, :cond_3

    .line 28
    .line 29
    iget-boolean v4, p0, La/ifc0;->d:Z

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_3
    move v4, p3

    .line 33
    :goto_2
    and-int/lit8 v5, p7, 0x10

    .line 34
    .line 35
    if-eqz v5, :cond_4

    .line 36
    .line 37
    iget-boolean v5, p0, La/ifc0;->e:Z

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_4
    move v5, p4

    .line 41
    :goto_3
    and-int/lit8 v6, p7, 0x20

    .line 42
    .line 43
    if-eqz v6, :cond_5

    .line 44
    .line 45
    iget-boolean v6, p0, La/ifc0;->f:Z

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_5
    move v6, p5

    .line 49
    :goto_4
    and-int/lit8 v7, p7, 0x40

    .line 50
    .line 51
    if-eqz v7, :cond_6

    .line 52
    .line 53
    iget-boolean v0, p0, La/ifc0;->g:Z

    .line 54
    .line 55
    goto :goto_5

    .line 56
    :cond_6
    move v0, p6

    .line 57
    :goto_5
    new-instance v7, La/ifc0;

    .line 58
    .line 59
    move p7, v0

    .line 60
    move-object p2, v1

    .line 61
    move-object p1, v2

    .line 62
    move-object p3, v3

    .line 63
    move p4, v4

    .line 64
    move p5, v5

    .line 65
    move p6, v6

    .line 66
    move-object p0, v7

    .line 67
    invoke-direct/range {p0 .. p7}, La/ifc0;-><init>(La/azc0;La/wyc0;La/plc0;ZZZZ)V

    .line 68
    .line 69
    .line 70
    move-object v0, p0

    .line 71
    return-object v0
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
    instance-of v0, p1, La/ifc0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/ifc0;

    .line 10
    .line 11
    iget-object v0, p0, La/ifc0;->a:La/azc0;

    .line 12
    .line 13
    iget-object v1, p1, La/ifc0;->a:La/azc0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/azc0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/ifc0;->b:La/wyc0;

    .line 23
    .line 24
    iget-object v1, p1, La/ifc0;->b:La/wyc0;

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/ifc0;->c:La/plc0;

    .line 30
    .line 31
    iget-object v1, p1, La/ifc0;->c:La/plc0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/plc0;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-boolean v0, p0, La/ifc0;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/ifc0;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-boolean v0, p0, La/ifc0;->e:Z

    .line 48
    .line 49
    iget-boolean v1, p1, La/ifc0;->e:Z

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-boolean v0, p0, La/ifc0;->f:Z

    .line 55
    .line 56
    iget-boolean v1, p1, La/ifc0;->f:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-boolean p0, p0, La/ifc0;->g:Z

    .line 62
    .line 63
    iget-boolean p1, p1, La/ifc0;->g:Z

    .line 64
    .line 65
    if-eq p0, p1, :cond_8

    .line 66
    .line 67
    :goto_0
    const/4 p0, 0x0

    .line 68
    return p0

    .line 69
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 70
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/ifc0;->a:La/azc0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/azc0;->hashCode()I

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
    iget-object v2, p0, La/ifc0;->b:La/wyc0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/ifc0;->c:La/plc0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/plc0;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-boolean v2, p0, La/ifc0;->d:Z

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-boolean v2, p0, La/ifc0;->e:Z

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-boolean v2, p0, La/ifc0;->f:Z

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-boolean p0, p0, La/ifc0;->g:Z

    .line 45
    .line 46
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    add-int/2addr p0, v0

    .line 51
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PromoCodeStateModel(promoCodeFieldUiState="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ifc0;->a:La/azc0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", promoCodeFieldStyle="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/ifc0;->b:La/wyc0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", promoInfoStateModel="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/ifc0;->c:La/plc0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", hasMultiBalanceInfoLineText="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, La/ifc0;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", makeBetBtnEnabled="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", marketIsOpen="

    .line 49
    .line 50
    const-string v2, ", isVisibleState="

    .line 51
    .line 52
    iget-boolean v3, p0, La/ifc0;->e:Z

    .line 53
    .line 54
    iget-boolean v4, p0, La/ifc0;->f:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    const-string v1, ")"

    .line 60
    .line 61
    iget-boolean p0, p0, La/ifc0;->g:Z

    .line 62
    .line 63
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
