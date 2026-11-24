.class public final La/lss;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qss;


# instance fields
.field public final a:La/mdm;

.field public final b:S


# direct methods
.method public constructor <init>(JLa/mdm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/lss;->a:La/mdm;

    .line 5
    .line 6
    long-to-int p1, p1

    .line 7
    iput-short p1, p0, La/lss;->b:S

    .line 8
    .line 9
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
    instance-of v0, p1, La/lss;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/lss;

    .line 10
    .line 11
    iget-object v0, p0, La/lss;->a:La/mdm;

    .line 12
    .line 13
    iget-object v1, p1, La/lss;->a:La/mdm;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

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
    iget-short p0, p0, La/lss;->b:S

    .line 23
    .line 24
    int-to-long v0, p0

    .line 25
    iget-short p0, p1, La/lss;->b:S

    .line 26
    .line 27
    int-to-long p0, p0

    .line 28
    cmp-long p0, v0, p0

    .line 29
    .line 30
    if-eqz p0, :cond_3

    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/lss;->a:La/mdm;

    .line 2
    .line 3
    invoke-virtual {v0}, La/mdm;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-short p0, p0, La/lss;->b:S

    .line 10
    .line 11
    int-to-long v1, p0

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/2addr p0, v0

    .line 17
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-short v0, p0, La/lss;->b:S

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v3, "Error(lottieConfig="

    .line 7
    .line 8
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/lss;->a:La/mdm;

    .line 12
    .line 13
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p0, ", countDownTimeMillis="

    .line 17
    .line 18
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, ")"

    .line 25
    .line 26
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method
