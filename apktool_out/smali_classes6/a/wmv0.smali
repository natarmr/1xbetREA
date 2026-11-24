.class public final La/wmv0;
.super La/v8b;
.source "SourceFile"

# interfaces
.implements La/xmv0;


# instance fields
.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:La/k6d;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILa/k6d;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/g9b;

    .line 5
    .line 6
    invoke-direct {v0, p2}, La/g9b;-><init>(I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/h9b;

    .line 10
    .line 11
    invoke-direct {v1, p1}, La/h9b;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/g9b;

    .line 15
    .line 16
    invoke-direct {v2, p2}, La/g9b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    new-array v3, v3, [La/i9b;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    aput-object v0, v3, v4

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    aput-object v1, v3, v0

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    aput-object v2, v3, v0

    .line 30
    .line 31
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x0

    .line 36
    const/16 v2, 0x1e

    .line 37
    .line 38
    invoke-direct {p0, v2, v1, v1, v0}, La/v8b;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/wmv0;->d:Ljava/lang/String;

    .line 42
    .line 43
    iput p2, p0, La/wmv0;->e:I

    .line 44
    .line 45
    iput-object p3, p0, La/wmv0;->f:La/k6d;

    .line 46
    .line 47
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
    instance-of v0, p1, La/wmv0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/wmv0;

    .line 10
    .line 11
    iget-object v0, p0, La/wmv0;->d:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/wmv0;->d:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget v0, p0, La/wmv0;->e:I

    .line 23
    .line 24
    iget v1, p1, La/wmv0;->e:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object p0, p0, La/wmv0;->f:La/k6d;

    .line 30
    .line 31
    iget-object p1, p1, La/wmv0;->f:La/k6d;

    .line 32
    .line 33
    if-eq p0, p1, :cond_4

    .line 34
    .line 35
    :goto_0
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 38
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/wmv0;->d:Ljava/lang/String;

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
    iget v2, p0, La/wmv0;->e:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, La/wmv0;->f:La/k6d;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

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
    const-string v0, ", spaceWidth="

    .line 2
    .line 3
    const-string v1, ", type="

    .line 4
    .line 5
    iget v2, p0, La/wmv0;->e:I

    .line 6
    .line 7
    const-string v3, "WinterGamesResultsColumnHeader(title="

    .line 8
    .line 9
    iget-object v4, p0, La/wmv0;->d:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, La/kng0;->p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object p0, p0, La/wmv0;->f:La/k6d;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p0, ")"

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
