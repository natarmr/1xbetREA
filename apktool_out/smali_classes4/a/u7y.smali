.class public final La/u7y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/o7y;

.field public final b:La/t2y;

.field public final c:Ljava/util/List;

.field public final d:J

.field public final e:Z


# direct methods
.method public constructor <init>(La/o7y;La/t2y;Ljava/util/List;JZ)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/u7y;->a:La/o7y;

    .line 8
    .line 9
    iput-object p2, p0, La/u7y;->b:La/t2y;

    .line 10
    .line 11
    iput-object p3, p0, La/u7y;->c:Ljava/util/List;

    .line 12
    .line 13
    iput-wide p4, p0, La/u7y;->d:J

    .line 14
    .line 15
    iput-boolean p6, p0, La/u7y;->e:Z

    .line 16
    .line 17
    return-void
.end method

.method public static a(La/u7y;La/o7y;Ljava/util/List;JZI)La/u7y;
    .locals 7

    .line 1
    and-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, La/u7y;->a:La/o7y;

    .line 6
    .line 7
    :cond_0
    move-object v1, p1

    .line 8
    iget-object v2, p0, La/u7y;->b:La/t2y;

    .line 9
    .line 10
    and-int/lit8 p1, p6, 0x4

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, La/u7y;->c:Ljava/util/List;

    .line 15
    .line 16
    :cond_1
    move-object v3, p2

    .line 17
    and-int/lit8 p1, p6, 0x10

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-boolean p5, p0, La/u7y;->e:Z

    .line 22
    .line 23
    :cond_2
    move v6, p5

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, La/u7y;

    .line 31
    .line 32
    move-wide v4, p3

    .line 33
    invoke-direct/range {v0 .. v6}, La/u7y;-><init>(La/o7y;La/t2y;Ljava/util/List;JZ)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/u7y;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/u7y;

    .line 10
    .line 11
    iget-object v0, p0, La/u7y;->a:La/o7y;

    .line 12
    .line 13
    iget-object v1, p1, La/u7y;->a:La/o7y;

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
    iget-object v0, p0, La/u7y;->b:La/t2y;

    .line 23
    .line 24
    iget-object v1, p1, La/u7y;->b:La/t2y;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/t2y;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/u7y;->c:Ljava/util/List;

    .line 34
    .line 35
    iget-object v1, p1, La/u7y;->c:Ljava/util/List;

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
    iget-wide v0, p0, La/u7y;->d:J

    .line 45
    .line 46
    iget-wide v2, p1, La/u7y;->d:J

    .line 47
    .line 48
    cmp-long v0, v0, v2

    .line 49
    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-boolean p0, p0, La/u7y;->e:Z

    .line 54
    .line 55
    iget-boolean p1, p1, La/u7y;->e:Z

    .line 56
    .line 57
    if-eq p0, p1, :cond_6

    .line 58
    .line 59
    :goto_0
    const/4 p0, 0x0

    .line 60
    return p0

    .line 61
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 62
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/u7y;->a:La/o7y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, La/u7y;->b:La/t2y;

    .line 11
    .line 12
    invoke-virtual {v2}, La/t2y;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/u7y;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v2, p0, La/u7y;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean p0, p0, La/u7y;->e:Z

    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "JackpotState(screen="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/u7y;->a:La/o7y;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", imageUrls="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/u7y;->b:La/t2y;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", periods="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/u7y;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", countDownTimeMillis="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, La/u7y;->d:J

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", serverError="

    .line 44
    .line 45
    const-string v2, ")"

    .line 46
    .line 47
    iget-boolean p0, p0, La/u7y;->e:Z

    .line 48
    .line 49
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
