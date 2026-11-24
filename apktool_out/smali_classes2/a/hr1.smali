.class public final La/hr1;
.super La/lr1;
.source "SourceFile"


# instance fields
.field public final c:J

.field public final d:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 2

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, 0x0

    .line 6
    .line 7
    :cond_0
    sget-object p3, La/nw80;->t:La/nw80;

    .line 8
    .line 9
    invoke-virtual {p3}, La/nw80;->getId()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-direct {p0, p1, p2, v0, v1}, La/hr1;-><init>(JJ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 2

    .line 17
    sget-object v0, La/mr1;->d:La/mr1;

    .line 18
    new-instance v1, La/fm1;

    invoke-direct {v1, p1, p2, p3, p4}, La/fm1;-><init>(JJ)V

    .line 19
    invoke-direct {p0, v0, v1}, La/lr1;-><init>(La/mr1;La/tm1;)V

    .line 20
    iput-wide p1, p0, La/hr1;->c:J

    .line 21
    iput-wide p3, p0, La/hr1;->d:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/hr1;

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
    check-cast p1, La/hr1;

    .line 12
    .line 13
    iget-wide v3, p0, La/hr1;->c:J

    .line 14
    .line 15
    iget-wide v5, p1, La/hr1;->c:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-wide v3, p0, La/hr1;->d:J

    .line 23
    .line 24
    iget-wide p0, p1, La/hr1;->d:J

    .line 25
    .line 26
    cmp-long p0, v3, p0

    .line 27
    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/hr1;->c:J

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
    iget-wide v1, p0, La/hr1;->d:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

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
    const-string v0, "MyAggregator(idToOpen="

    .line 2
    .line 3
    const-string v1, ", partitionId="

    .line 4
    .line 5
    iget-wide v2, p0, La/hr1;->c:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ")"

    .line 12
    .line 13
    iget-wide v2, p0, La/hr1;->d:J

    .line 14
    .line 15
    invoke-static {v2, v3, v1, v0}, La/brm0;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
