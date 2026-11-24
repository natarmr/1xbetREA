.class public final La/fsd0;
.super La/v8b;
.source "SourceFile"

# interfaces
.implements La/isd0;


# instance fields
.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v0, La/h9b;

    .line 2
    .line 3
    invoke-direct {v0, p4}, La/h9b;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/g9b;

    .line 7
    .line 8
    invoke-direct {v1, p2}, La/g9b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/f9b;

    .line 12
    .line 13
    invoke-direct {v2, p1}, La/f9b;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v3, La/g9b;

    .line 17
    .line 18
    invoke-direct {v3, p2}, La/g9b;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v4, La/h9b;

    .line 22
    .line 23
    invoke-direct {v4, p5}, La/h9b;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x5

    .line 27
    new-array v5, v5, [La/i9b;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    aput-object v0, v5, v6

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    aput-object v1, v5, v0

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    aput-object v2, v5, v0

    .line 37
    .line 38
    const/4 v0, 0x3

    .line 39
    aput-object v3, v5, v0

    .line 40
    .line 41
    const/4 v0, 0x4

    .line 42
    aput-object v4, v5, v0

    .line 43
    .line 44
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const/4 v2, 0x0

    .line 53
    const/16 v3, 0x16

    .line 54
    .line 55
    invoke-direct {p0, v3, v1, v2, v0}, La/v8b;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    iput-object p4, p0, La/fsd0;->d:Ljava/lang/String;

    .line 59
    .line 60
    iput-object p5, p0, La/fsd0;->e:Ljava/lang/String;

    .line 61
    .line 62
    iput-object p6, p0, La/fsd0;->f:Ljava/lang/String;

    .line 63
    .line 64
    iput p1, p0, La/fsd0;->g:I

    .line 65
    .line 66
    iput p2, p0, La/fsd0;->h:I

    .line 67
    .line 68
    iput p3, p0, La/fsd0;->i:I

    .line 69
    .line 70
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
    instance-of v0, p1, La/fsd0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/fsd0;

    .line 10
    .line 11
    iget-object v0, p0, La/fsd0;->d:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/fsd0;->d:Ljava/lang/String;

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
    iget-object v0, p0, La/fsd0;->e:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/fsd0;->e:Ljava/lang/String;

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
    iget-object v0, p0, La/fsd0;->f:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/fsd0;->f:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/fsd0;->g:I

    .line 45
    .line 46
    iget v1, p1, La/fsd0;->g:I

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget v0, p0, La/fsd0;->h:I

    .line 52
    .line 53
    iget v1, p1, La/fsd0;->h:I

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget p0, p0, La/fsd0;->i:I

    .line 59
    .line 60
    iget p1, p1, La/fsd0;->i:I

    .line 61
    .line 62
    if-eq p0, p1, :cond_7

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
    iget-object v0, p0, La/fsd0;->d:Ljava/lang/String;

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
    iget-object v2, p0, La/fsd0;->e:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/fsd0;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/fsd0;->g:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/fsd0;->h:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget p0, p0, La/fsd0;->i:I

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

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
    .locals 5

    .line 1
    const-string v0, ", pilotName="

    .line 2
    .line 3
    const-string v1, ", countryImage="

    .line 4
    .line 5
    const-string v2, "PilotRowHeader(position="

    .line 6
    .line 7
    iget-object v3, p0, La/fsd0;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/fsd0;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", iconWidth="

    .line 16
    .line 17
    const-string v2, ", spaceWidth="

    .line 18
    .line 19
    iget v3, p0, La/fsd0;->g:I

    .line 20
    .line 21
    iget-object v4, p0, La/fsd0;->f:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", maxCellWidth="

    .line 27
    .line 28
    const-string v2, ")"

    .line 29
    .line 30
    iget v3, p0, La/fsd0;->h:I

    .line 31
    .line 32
    iget p0, p0, La/fsd0;->i:I

    .line 33
    .line 34
    invoke-static {v3, p0, v1, v2, v0}, La/w6x;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
