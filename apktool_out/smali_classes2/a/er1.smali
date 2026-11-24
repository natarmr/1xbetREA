.class public final La/er1;
.super La/lr1;
.source "SourceFile"


# instance fields
.field public final c:J

.field public final d:Z


# direct methods
.method public constructor <init>(ZJ)V
    .locals 2

    .line 1
    sget-object v0, La/mr1;->c:La/mr1;

    .line 2
    .line 3
    new-instance v1, La/zl1;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3}, La/zl1;-><init>(ZJ)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0, v1}, La/lr1;-><init>(La/mr1;La/tm1;)V

    .line 9
    .line 10
    .line 11
    iput-wide p2, p0, La/er1;->c:J

    .line 12
    .line 13
    iput-boolean p1, p0, La/er1;->d:Z

    .line 14
    .line 15
    return-void
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
    instance-of v0, p1, La/er1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/er1;

    .line 10
    .line 11
    iget-wide v0, p0, La/er1;->c:J

    .line 12
    .line 13
    iget-wide v2, p1, La/er1;->c:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-boolean p0, p0, La/er1;->d:Z

    .line 21
    .line 22
    iget-boolean p1, p1, La/er1;->d:Z

    .line 23
    .line 24
    if-eq p0, p1, :cond_3

    .line 25
    .line 26
    :goto_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, La/er1;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean p0, p0, La/er1;->d:Z

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "Brands(brandId="

    .line 2
    .line 3
    const-string v1, ", fromDeeplink="

    .line 4
    .line 5
    iget-wide v2, p0, La/er1;->c:J

    .line 6
    .line 7
    iget-boolean p0, p0, La/er1;->d:Z

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, p0}, La/kng0;->r(JLjava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, ")"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
