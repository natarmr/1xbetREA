.class public final La/ovg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rvg0;


# instance fields
.field public final a:D

.field public final b:Ljava/lang/String;

.field public final c:D

.field public final d:D

.field public final e:Z


# direct methods
.method public constructor <init>(DLjava/lang/String;DDZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/ovg0;->a:D

    .line 5
    .line 6
    iput-object p3, p0, La/ovg0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p4, p0, La/ovg0;->c:D

    .line 9
    .line 10
    iput-wide p6, p0, La/ovg0;->d:D

    .line 11
    .line 12
    iput-boolean p8, p0, La/ovg0;->e:Z

    .line 13
    .line 14
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
    instance-of v0, p1, La/ovg0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/ovg0;

    .line 10
    .line 11
    iget-wide v0, p0, La/ovg0;->a:D

    .line 12
    .line 13
    iget-wide v2, p1, La/ovg0;->a:D

    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/ovg0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/ovg0;->b:Ljava/lang/String;

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
    iget-wide v0, p0, La/ovg0;->c:D

    .line 34
    .line 35
    iget-wide v2, p1, La/ovg0;->c:D

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-wide v0, p0, La/ovg0;->d:D

    .line 45
    .line 46
    iget-wide v2, p1, La/ovg0;->d:D

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-boolean p0, p0, La/ovg0;->e:Z

    .line 56
    .line 57
    iget-boolean p1, p1, La/ovg0;->e:Z

    .line 58
    .line 59
    if-eq p0, p1, :cond_6

    .line 60
    .line 61
    :goto_0
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 64
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/ovg0;->a:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

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
    iget-object v2, p0, La/ovg0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/ovg0;->c:D

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/ovg0;->d:D

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean p0, p0, La/ovg0;->e:Z

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ShowSaleDialog(downGradeSum="

    .line 2
    .line 3
    const-string v1, ", currency="

    .line 4
    .line 5
    iget-wide v2, p0, La/ovg0;->a:D

    .line 6
    .line 7
    iget-object v4, p0, La/ovg0;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v2, v3, v1, v4}, La/vqd;->s(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", saleSum="

    .line 14
    .line 15
    const-string v2, ", autoSaleSum="

    .line 16
    .line 17
    iget-wide v3, p0, La/ovg0;->c:D

    .line 18
    .line 19
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", isAutoSale="

    .line 23
    .line 24
    iget-wide v2, p0, La/ovg0;->d:D

    .line 25
    .line 26
    iget-boolean p0, p0, La/ovg0;->e:Z

    .line 27
    .line 28
    invoke-static {v0, v2, v3, v1, p0}, La/rz4;->x(Ljava/lang/StringBuilder;DLjava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    const-string p0, ")"

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
