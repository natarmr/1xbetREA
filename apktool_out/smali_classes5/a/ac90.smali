.class public final La/ac90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kc90;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IJ)V
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
    iput p2, p0, La/ac90;->a:I

    .line 8
    .line 9
    iput-wide p3, p0, La/ac90;->b:J

    .line 10
    .line 11
    iput-object p1, p0, La/ac90;->c:Ljava/lang/String;

    .line 12
    .line 13
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
    instance-of v1, p1, La/ac90;

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
    check-cast p1, La/ac90;

    .line 12
    .line 13
    iget v1, p0, La/ac90;->a:I

    .line 14
    .line 15
    iget v3, p1, La/ac90;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-wide v3, p1, La/ac90;->b:J

    .line 21
    .line 22
    sget v1, La/y3d;->h:I

    .line 23
    .line 24
    iget-wide v5, p0, La/ac90;->b:J

    .line 25
    .line 26
    invoke-static {v5, v6, v3, v4}, La/h2t0;->a(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object p0, p0, La/ac90;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object p1, p1, La/ac90;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    return v0
.end method

.method public final getKey()I
    .locals 0

    .line 1
    iget p0, p0, La/ac90;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/ac90;->a:I

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
    sget v2, La/y3d;->h:I

    .line 11
    .line 12
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 13
    .line 14
    iget-wide v2, p0, La/ac90;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object p0, p0, La/ac90;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v0

    .line 27
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-wide v0, p0, La/ac90;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", textColor="

    .line 8
    .line 9
    const-string v2, ", penaltyNumber="

    .line 10
    .line 11
    iget v3, p0, La/ac90;->a:I

    .line 12
    .line 13
    const-string v4, "PenaltyExpected(key="

    .line 14
    .line 15
    invoke-static {v3, v4, v1, v0, v2}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, ")"

    .line 20
    .line 21
    iget-object p0, p0, La/ac90;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
