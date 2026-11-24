.class public final La/yje0;
.super La/v8b;
.source "SourceFile"

# interfaces
.implements La/bke0;


# instance fields
.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 4

    .line 1
    new-instance v0, La/f9b;

    .line 2
    .line 3
    invoke-direct {v0, p2}, La/f9b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/g9b;

    .line 7
    .line 8
    invoke-direct {v1, p3}, La/g9b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    new-array v2, v2, [La/i9b;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    aput-object v0, v2, v3

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aput-object v1, v2, v0

    .line 19
    .line 20
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/16 v2, 0xe

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {p0, v2, v3, v1, v0}, La/v8b;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    iput p1, p0, La/yje0;->d:I

    .line 35
    .line 36
    iput p2, p0, La/yje0;->e:I

    .line 37
    .line 38
    iput p3, p0, La/yje0;->f:I

    .line 39
    .line 40
    iput p4, p0, La/yje0;->g:I

    .line 41
    .line 42
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, La/yje0;

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
    check-cast p1, La/yje0;

    .line 12
    .line 13
    iget v1, p0, La/yje0;->d:I

    .line 14
    .line 15
    iget v3, p1, La/yje0;->d:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, La/yje0;->e:I

    .line 21
    .line 22
    iget v3, p1, La/yje0;->e:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, La/yje0;->f:I

    .line 28
    .line 29
    iget v3, p1, La/yje0;->f:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget p0, p0, La/yje0;->g:I

    .line 35
    .line 36
    iget p1, p1, La/yje0;->g:I

    .line 37
    .line 38
    if-eq p0, p1, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/yje0;->d:I

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
    iget v2, p0, La/yje0;->e:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/yje0;->f:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, La/yje0;->g:I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

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
    .locals 5

    .line 1
    const-string v0, ", iconWidth="

    .line 2
    .line 3
    const-string v1, ", spaceWidth="

    .line 4
    .line 5
    const-string v2, "RefereeTeamsColumnHeaderImage(iconRes="

    .line 6
    .line 7
    iget v3, p0, La/yje0;->d:I

    .line 8
    .line 9
    iget v4, p0, La/yje0;->e:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", minWidthCell="

    .line 16
    .line 17
    const-string v2, ")"

    .line 18
    .line 19
    iget v3, p0, La/yje0;->f:I

    .line 20
    .line 21
    iget p0, p0, La/yje0;->g:I

    .line 22
    .line 23
    invoke-static {v3, p0, v1, v2, v0}, La/w6x;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
