.class public final La/csr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final e:La/csr;


# instance fields
.field public final a:La/bsr;

.field public final b:Ljava/lang/String;

.field public final c:La/dsr;

.field public final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/csr;

    .line 2
    .line 3
    new-instance v1, La/bsr;

    .line 4
    .line 5
    sget-object v2, La/esr;->c:La/esr;

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide/16 v5, 0x0

    .line 10
    .line 11
    invoke-direct/range {v1 .. v6}, La/bsr;-><init>(La/esr;JD)V

    .line 12
    .line 13
    .line 14
    sget-object v3, La/dsr;->b:La/dsr;

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    const-string v2, ""

    .line 19
    .line 20
    invoke-direct/range {v0 .. v5}, La/csr;-><init>(La/bsr;Ljava/lang/String;La/dsr;J)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/csr;->e:La/csr;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(La/bsr;Ljava/lang/String;La/dsr;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/csr;->a:La/bsr;

    .line 5
    .line 6
    iput-object p2, p0, La/csr;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, La/csr;->c:La/dsr;

    .line 9
    .line 10
    iput-wide p4, p0, La/csr;->d:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 5

    .line 1
    sget-object v0, La/csr;->e:La/csr;

    .line 2
    .line 3
    iget-object v1, v0, La/csr;->a:La/bsr;

    .line 4
    .line 5
    iget-object v1, v1, La/bsr;->a:La/esr;

    .line 6
    .line 7
    iget-object v2, p0, La/csr;->a:La/bsr;

    .line 8
    .line 9
    iget-object v3, v2, La/bsr;->a:La/esr;

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget-object v1, v0, La/csr;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, La/csr;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, v0, La/csr;->a:La/bsr;

    .line 24
    .line 25
    iget-wide v3, v1, La/bsr;->b:J

    .line 26
    .line 27
    iget-wide v1, v2, La/bsr;->b:J

    .line 28
    .line 29
    cmp-long v1, v3, v1

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    iget-object v1, v0, La/csr;->c:La/dsr;

    .line 34
    .line 35
    iget-object v2, p0, La/csr;->c:La/dsr;

    .line 36
    .line 37
    if-ne v1, v2, :cond_0

    .line 38
    .line 39
    iget-wide v0, v0, La/csr;->d:J

    .line 40
    .line 41
    iget-wide v2, p0, La/csr;->d:J

    .line 42
    .line 43
    cmp-long p0, v0, v2

    .line 44
    .line 45
    if-nez p0, :cond_0

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_0
    const/4 p0, 0x0

    .line 50
    return p0
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
    instance-of v0, p1, La/csr;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/csr;

    .line 10
    .line 11
    iget-object v0, p0, La/csr;->a:La/bsr;

    .line 12
    .line 13
    iget-object v1, p1, La/csr;->a:La/bsr;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/bsr;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/csr;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/csr;->b:Ljava/lang/String;

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
    iget-object v0, p0, La/csr;->c:La/dsr;

    .line 34
    .line 35
    iget-object v1, p1, La/csr;->c:La/dsr;

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-wide v0, p0, La/csr;->d:J

    .line 41
    .line 42
    iget-wide p0, p1, La/csr;->d:J

    .line 43
    .line 44
    cmp-long p0, v0, p0

    .line 45
    .line 46
    if-eqz p0, :cond_5

    .line 47
    .line 48
    :goto_0
    const/4 p0, 0x0

    .line 49
    return p0

    .line 50
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 51
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/csr;->a:La/bsr;

    .line 2
    .line 3
    invoke-virtual {v0}, La/bsr;->hashCode()I

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
    iget-object v2, p0, La/csr;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/csr;->c:La/dsr;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-wide v0, p0, La/csr;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v2

    .line 31
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GameBonus(bonusIdentifierDetails="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/csr;->a:La/bsr;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", bonusDescription="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/csr;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", bonusEnabled="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/csr;->c:La/dsr;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", count="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, La/csr;->d:J

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
