.class public final La/xbm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ybm;


# instance fields
.field public final a:B

.field public final b:Ljava/lang/String;

.field public final c:La/o0x;

.field public final d:La/ubm;

.field public final e:I


# direct methods
.method public constructor <init>(JLjava/lang/String;La/o0x;La/ubm;I)V
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
    iput-byte p1, p0, La/xbm;->a:B

    .line 9
    .line 10
    iput-object p3, p0, La/xbm;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p4, p0, La/xbm;->c:La/o0x;

    .line 13
    .line 14
    iput-object p5, p0, La/xbm;->d:La/ubm;

    .line 15
    .line 16
    iput p6, p0, La/xbm;->e:I

    .line 17
    .line 18
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
    instance-of v0, p1, La/xbm;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/xbm;

    .line 10
    .line 11
    iget-byte v0, p0, La/xbm;->a:B

    .line 12
    .line 13
    int-to-long v0, v0

    .line 14
    iget-byte v2, p1, La/xbm;->a:B

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
    iget-object v0, p0, La/xbm;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/xbm;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/xbm;->c:La/o0x;

    .line 34
    .line 35
    iget-object v1, p1, La/xbm;->c:La/o0x;

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
    iget-object v0, p0, La/xbm;->d:La/ubm;

    .line 45
    .line 46
    iget-object v1, p1, La/xbm;->d:La/ubm;

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget p0, p0, La/xbm;->e:I

    .line 52
    .line 53
    iget p1, p1, La/xbm;->e:I

    .line 54
    .line 55
    if-eq p0, p1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    sget-object p0, La/rbm;->a:La/rbm;

    .line 59
    .line 60
    invoke-virtual {p0, p0}, La/rbm;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_7

    .line 65
    .line 66
    :goto_0
    const/4 p0, 0x0

    .line 67
    return p0

    .line 68
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 69
    return p0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-byte p0, p0, La/xbm;->a:B

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    return-wide v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-byte v0, p0, La/xbm;->a:B

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
    const/16 v1, 0x1f

    .line 9
    .line 10
    mul-int/2addr v0, v1

    .line 11
    iget-object v2, p0, La/xbm;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v2, p0, La/xbm;->c:La/o0x;

    .line 18
    .line 19
    invoke-static {v2, v0, v1}, La/w6x;->d(La/o0x;II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v2, p0, La/xbm;->d:La/ubm;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, v0

    .line 30
    mul-int/2addr v2, v1

    .line 31
    iget p0, p0, La/xbm;->e:I

    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    add-int/2addr p0, v2

    .line 38
    mul-int/2addr p0, v1

    .line 39
    const v0, 0x1cda50da

    .line 40
    .line 41
    .line 42
    add-int/2addr p0, v0

    .line 43
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-byte v0, p0, La/xbm;->a:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-string v2, "LabelWithIcon(id="

    .line 5
    .line 6
    const-string v3, ", label="

    .line 7
    .line 8
    iget-object v4, p0, La/xbm;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, ", icon="

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, La/xbm;->c:La/o0x;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", iconType="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/xbm;->d:La/ubm;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", placeholderRes="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget p0, p0, La/xbm;->e:I

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, ", chevronType="

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    sget-object p0, La/rbm;->a:La/rbm;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, ")"

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method
