.class public final La/euc0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:La/n0x;

.field public final d:La/n0x;

.field public final e:Lkotlin/jvm/functions/Function2;

.field public final f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(JLa/n0x;La/n0x;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, La/ksc0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, La/ksc0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/ljc0;

    .line 8
    .line 9
    const/16 v2, 0xe

    .line 10
    .line 11
    invoke-direct {v1, v2}, La/ljc0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, La/euc0;->a:J

    .line 21
    .line 22
    iput-object p5, p0, La/euc0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p3, p0, La/euc0;->c:La/n0x;

    .line 25
    .line 26
    iput-object p4, p0, La/euc0;->d:La/n0x;

    .line 27
    .line 28
    iput-object v0, p0, La/euc0;->e:Lkotlin/jvm/functions/Function2;

    .line 29
    .line 30
    iput-object v1, p0, La/euc0;->f:Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
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
    instance-of v0, p1, La/euc0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/euc0;

    .line 10
    .line 11
    iget-wide v0, p0, La/euc0;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/euc0;->a:J

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
    iget-object v0, p0, La/euc0;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, La/euc0;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, La/euc0;->c:La/n0x;

    .line 32
    .line 33
    iget-object v1, p1, La/euc0;->c:La/n0x;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, La/n0x;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-object v0, p0, La/euc0;->d:La/n0x;

    .line 43
    .line 44
    iget-object v1, p1, La/euc0;->d:La/n0x;

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-object v0, p0, La/euc0;->e:Lkotlin/jvm/functions/Function2;

    .line 54
    .line 55
    iget-object v1, p1, La/euc0;->e:Lkotlin/jvm/functions/Function2;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-object p0, p0, La/euc0;->f:Lkotlin/jvm/functions/Function1;

    .line 65
    .line 66
    iget-object p1, p1, La/euc0;->f:Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_7

    .line 73
    .line 74
    :goto_0
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 77
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/euc0;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-object v2, p0, La/euc0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v2, 0x3c1

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static {v3, v0, v2}, La/twn;->a(III)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v2, p0, La/euc0;->c:La/n0x;

    .line 24
    .line 25
    invoke-static {v2, v0, v1}, La/f140;->f(La/n0x;II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v2, p0, La/euc0;->d:La/n0x;

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v2}, La/n0x;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    :goto_0
    add-int/2addr v0, v3

    .line 39
    mul-int/2addr v0, v1

    .line 40
    iget-object v2, p0, La/euc0;->e:Lkotlin/jvm/functions/Function2;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object p0, p0, La/euc0;->f:Lkotlin/jvm/functions/Function1;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/2addr p0, v2

    .line 55
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "PromoStoreCollectionItemModel(promoId="

    .line 2
    .line 3
    const-string v1, ", label="

    .line 4
    .line 5
    iget-wide v2, p0, La/euc0;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/euc0;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", count=0, unit=, picture="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/euc0;->c:La/n0x;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", pictureFallback="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/euc0;->d:La/n0x;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", onLoaded="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/euc0;->e:Lkotlin/jvm/functions/Function2;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", onError="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/euc0;->f:Lkotlin/jvm/functions/Function1;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ")"

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
