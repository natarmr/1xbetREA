.class public final La/q3a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t3a0;


# instance fields
.field public final a:La/imm;

.field public final b:La/a4x;

.field public final c:I

.field public final d:La/m1e0;

.field public final e:La/mdm;


# direct methods
.method public constructor <init>(La/imm;La/a4x;ILa/m1e0;La/mdm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/q3a0;->a:La/imm;

    .line 5
    .line 6
    iput-object p2, p0, La/q3a0;->b:La/a4x;

    .line 7
    .line 8
    iput p3, p0, La/q3a0;->c:I

    .line 9
    .line 10
    iput-object p4, p0, La/q3a0;->d:La/m1e0;

    .line 11
    .line 12
    iput-object p5, p0, La/q3a0;->e:La/mdm;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()La/imm;
    .locals 0

    .line 1
    iget-object p0, p0, La/q3a0;->a:La/imm;

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
    instance-of v0, p1, La/q3a0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/q3a0;

    .line 10
    .line 11
    iget-object v0, p0, La/q3a0;->a:La/imm;

    .line 12
    .line 13
    iget-object v1, p1, La/q3a0;->a:La/imm;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/imm;->equals(Ljava/lang/Object;)Z

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
    sget-object v0, La/axh0;->a:La/axh0;

    .line 23
    .line 24
    invoke-virtual {v0, v0}, La/axh0;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, La/q3a0;->b:La/a4x;

    .line 32
    .line 33
    iget-object v1, p1, La/q3a0;->b:La/a4x;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget v0, p0, La/q3a0;->c:I

    .line 43
    .line 44
    iget v1, p1, La/q3a0;->c:I

    .line 45
    .line 46
    if-eq v0, v1, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-object v0, p0, La/q3a0;->d:La/m1e0;

    .line 50
    .line 51
    iget-object v1, p1, La/q3a0;->d:La/m1e0;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, La/m1e0;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget-object p0, p0, La/q3a0;->e:La/mdm;

    .line 61
    .line 62
    iget-object p1, p1, La/q3a0;->e:La/mdm;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_7

    .line 69
    .line 70
    :goto_0
    const/4 p0, 0x0

    .line 71
    return p0

    .line 72
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 73
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/q3a0;->a:La/imm;

    .line 2
    .line 3
    invoke-virtual {v0}, La/imm;->hashCode()I

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
    const v2, -0x5885288e

    .line 11
    .line 12
    .line 13
    add-int/2addr v0, v2

    .line 14
    mul-int/2addr v0, v1

    .line 15
    iget-object v2, p0, La/q3a0;->b:La/a4x;

    .line 16
    .line 17
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v2, p0, La/q3a0;->c:I

    .line 22
    .line 23
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v2, p0, La/q3a0;->d:La/m1e0;

    .line 28
    .line 29
    invoke-virtual {v2}, La/m1e0;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v2, v0

    .line 34
    mul-int/2addr v2, v1

    .line 35
    iget-object p0, p0, La/q3a0;->e:La/mdm;

    .line 36
    .line 37
    invoke-virtual {p0}, La/mdm;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/2addr p0, v2

    .line 42
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ContentEmptySubTabs(dsNavigationBarUiModel="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/q3a0;->a:La/imm;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", segmentedControlStyle="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget-object v1, La/axh0;->a:La/axh0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", mainTabsTitleList="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/q3a0;->b:La/a4x;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", currentMainTabPosition="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, La/q3a0;->c:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", rankCardUiModel="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/q3a0;->d:La/m1e0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", dsEmptyConfig="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, La/q3a0;->e:La/mdm;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ")"

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
