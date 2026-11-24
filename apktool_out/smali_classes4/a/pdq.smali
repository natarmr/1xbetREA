.class public final La/pdq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:La/mdm;

.field public final b:J

.field public final c:I


# direct methods
.method public constructor <init>(La/mdm;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pdq;->a:La/mdm;

    .line 5
    .line 6
    iput-wide p2, p0, La/pdq;->b:J

    .line 7
    .line 8
    iput p4, p0, La/pdq;->c:I

    .line 9
    .line 10
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
    instance-of v1, p1, La/pdq;

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
    check-cast p1, La/pdq;

    .line 12
    .line 13
    iget-object v1, p0, La/pdq;->a:La/mdm;

    .line 14
    .line 15
    iget-object v3, p1, La/pdq;->a:La/mdm;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-wide v3, p0, La/pdq;->b:J

    .line 25
    .line 26
    iget-wide v5, p1, La/pdq;->b:J

    .line 27
    .line 28
    invoke-static {v3, v4, v5, v6}, La/wen;->d(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget p0, p0, La/pdq;->c:I

    .line 36
    .line 37
    iget p1, p1, La/pdq;->c:I

    .line 38
    .line 39
    if-eq p0, p1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/pdq;->a:La/mdm;

    .line 2
    .line 3
    invoke-virtual {v0}, La/mdm;->hashCode()I

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
    sget-object v2, La/wen;->b:La/uen;

    .line 11
    .line 12
    iget-wide v2, p0, La/pdq;->b:J

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget p0, p0, La/pdq;->c:I

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-wide v0, p0, La/pdq;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/wen;->m(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "FindLiveUiModel(lottieConfig="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, La/pdq;->a:La/mdm;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, ", before="

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", gameStatusRes="

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v0, ")"

    .line 33
    .line 34
    iget p0, p0, La/pdq;->c:I

    .line 35
    .line 36
    invoke-static {p0, v0, v1}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
