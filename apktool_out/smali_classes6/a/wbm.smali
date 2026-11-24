.class public final La/wbm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ybm;


# instance fields
.field public final a:B

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
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
    long-to-int p1, p1

    .line 8
    iput-byte p1, p0, La/wbm;->a:B

    .line 9
    .line 10
    iput-object p3, p0, La/wbm;->b:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()La/tbm;
    .locals 0

    .line 1
    sget-object p0, La/rbm;->a:La/rbm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/wbm;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/wbm;

    .line 10
    .line 11
    iget-byte v0, p0, La/wbm;->a:B

    .line 12
    .line 13
    int-to-long v0, v0

    .line 14
    iget-byte v2, p1, La/wbm;->a:B

    .line 15
    .line 16
    int-to-long v2, v2

    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object p0, p0, La/wbm;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object p1, p1, La/wbm;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    sget-object p0, La/rbm;->a:La/rbm;

    .line 34
    .line 35
    invoke-virtual {p0, p0}, La/rbm;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_4

    .line 40
    .line 41
    :goto_0
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 44
    return p0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-byte p0, p0, La/wbm;->a:B

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    return-wide v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-byte v0, p0, La/wbm;->a:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object p0, p0, La/wbm;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/2addr p0, v0

    .line 17
    mul-int/lit8 p0, p0, 0x1f

    .line 18
    .line 19
    const v0, 0x1cda50da

    .line 20
    .line 21
    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-byte v0, p0, La/wbm;->a:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-string v2, "Label(id="

    .line 5
    .line 6
    const-string v3, ", label="

    .line 7
    .line 8
    iget-object p0, p0, La/wbm;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3, p0}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, ", chevronType="

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    sget-object v0, La/rbm;->a:La/rbm;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, ")"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method
