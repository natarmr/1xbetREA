.class public final La/r7p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p9p0;

.field public final b:La/j7p0;

.field public final c:La/a4x;

.field public final d:Z


# direct methods
.method public constructor <init>(La/p9p0;La/j7p0;La/a4x;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/r7p0;->a:La/p9p0;

    .line 8
    .line 9
    iput-object p2, p0, La/r7p0;->b:La/j7p0;

    .line 10
    .line 11
    iput-object p3, p0, La/r7p0;->c:La/a4x;

    .line 12
    .line 13
    iput-boolean p4, p0, La/r7p0;->d:Z

    .line 14
    .line 15
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
    instance-of v0, p1, La/r7p0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/r7p0;

    .line 10
    .line 11
    iget-object v0, p0, La/r7p0;->a:La/p9p0;

    .line 12
    .line 13
    iget-object v1, p1, La/r7p0;->a:La/p9p0;

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
    iget-object v0, p0, La/r7p0;->b:La/j7p0;

    .line 23
    .line 24
    iget-object v1, p1, La/r7p0;->b:La/j7p0;

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
    iget-object v0, p0, La/r7p0;->c:La/a4x;

    .line 34
    .line 35
    iget-object v1, p1, La/r7p0;->c:La/a4x;

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
    iget-boolean p0, p0, La/r7p0;->d:Z

    .line 45
    .line 46
    iget-boolean p1, p1, La/r7p0;->d:Z

    .line 47
    .line 48
    if-eq p0, p1, :cond_5

    .line 49
    .line 50
    :goto_0
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 53
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/r7p0;->a:La/p9p0;

    .line 2
    .line 3
    iget-object v0, v0, La/p9p0;->a:La/imm;

    .line 4
    .line 5
    invoke-virtual {v0}, La/imm;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, La/r7p0;->b:La/j7p0;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, La/r7p0;->c:La/a4x;

    .line 21
    .line 22
    invoke-static {v0, v2, v1}, La/cs0;->b(La/a4x;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-boolean p0, p0, La/r7p0;->d:Z

    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v0

    .line 33
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TeamDetailsAchievementUiState(toolbarModel="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/r7p0;->a:La/p9p0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", contentUiModel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/r7p0;->b:La/j7p0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", uiItemList="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", loading="

    .line 29
    .line 30
    const-string v2, ")"

    .line 31
    .line 32
    iget-object v3, p0, La/r7p0;->c:La/a4x;

    .line 33
    .line 34
    iget-boolean p0, p0, La/r7p0;->d:Z

    .line 35
    .line 36
    invoke-static {v0, v3, v1, p0, v2}, La/rz4;->m(Ljava/lang/StringBuilder;La/a4x;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
