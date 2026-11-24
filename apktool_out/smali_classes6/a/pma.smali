.class public final La/pma;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rma;


# instance fields
.field public final a:La/vzm;

.field public final b:La/vzm;

.field public final c:La/jwm;

.field public final d:La/jwm;

.field public final e:La/jwm;


# direct methods
.method public constructor <init>(La/vzm;La/vzm;La/jwm;La/jwm;La/jwm;)V
    .locals 1

    .line 1
    sget-object v0, La/uso0;->a:La/uso0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/pma;->a:La/vzm;

    .line 7
    .line 8
    iput-object p2, p0, La/pma;->b:La/vzm;

    .line 9
    .line 10
    iput-object p3, p0, La/pma;->c:La/jwm;

    .line 11
    .line 12
    iput-object p4, p0, La/pma;->d:La/jwm;

    .line 13
    .line 14
    iput-object p5, p0, La/pma;->e:La/jwm;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, La/pma;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/pma;

    .line 11
    .line 12
    iget-object v1, p0, La/pma;->a:La/vzm;

    .line 13
    .line 14
    iget-object v2, p1, La/pma;->a:La/vzm;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, La/vzm;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v1, p0, La/pma;->b:La/vzm;

    .line 24
    .line 25
    iget-object v2, p1, La/pma;->b:La/vzm;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, La/vzm;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v1, p0, La/pma;->c:La/jwm;

    .line 35
    .line 36
    iget-object v2, p1, La/pma;->c:La/jwm;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, La/jwm;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget-object v1, p0, La/pma;->d:La/jwm;

    .line 46
    .line 47
    iget-object v2, p1, La/pma;->d:La/jwm;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, La/jwm;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_5

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    iget-object p0, p0, La/pma;->e:La/jwm;

    .line 57
    .line 58
    iget-object p1, p1, La/pma;->e:La/jwm;

    .line 59
    .line 60
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_6

    .line 65
    .line 66
    :goto_0
    const/4 p0, 0x0

    .line 67
    return p0

    .line 68
    :cond_6
    sget-object p0, La/uso0;->a:La/uso0;

    .line 69
    .line 70
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/pma;->a:La/vzm;

    .line 2
    .line 3
    invoke-virtual {v0}, La/vzm;->hashCode()I

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
    iget-object v2, p0, La/pma;->b:La/vzm;

    .line 11
    .line 12
    invoke-virtual {v2}, La/vzm;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/pma;->c:La/jwm;

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, La/b1j;->d(La/jwm;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/pma;->d:La/jwm;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, La/b1j;->d(La/jwm;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object p0, p0, La/pma;->e:La/jwm;

    .line 31
    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, La/jwm;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    :goto_0
    add-int/2addr v0, p0

    .line 41
    mul-int/2addr v0, v1

    .line 42
    sget-object p0, La/uso0;->a:La/uso0;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v0

    .line 49
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, La/uso0;->a:La/uso0;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "TwoOpponents(firstOpponentModel="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, La/pma;->a:La/vzm;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", secondOpponentModel="

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, La/pma;->b:La/vzm;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ", infoLabelOne="

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, ", infoLabelTwo="

    .line 31
    .line 32
    const-string v3, ", infoLabelThree="

    .line 33
    .line 34
    iget-object v4, p0, La/pma;->c:La/jwm;

    .line 35
    .line 36
    iget-object v5, p0, La/pma;->d:La/jwm;

    .line 37
    .line 38
    invoke-static {v1, v4, v2, v5, v3}, La/b1j;->A(Ljava/lang/StringBuilder;La/jwm;Ljava/lang/String;La/jwm;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, La/pma;->e:La/jwm;

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p0, ", tagWinVisibilityState="

    .line 47
    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, ")"

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method
