.class public final La/xa50;
.super La/cb50;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Z


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    .line 11
    const-string v0, ""

    const/4 v1, 0x0

    .line 12
    invoke-direct {p0, v0, v1}, La/xa50;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const-string v0, "COUPON"

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/cb50;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/xa50;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p2, p0, La/xa50;->c:Z

    .line 9
    .line 10
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
    instance-of v0, p1, La/xa50;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/xa50;

    .line 10
    .line 11
    iget-object v0, p0, La/xa50;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/xa50;->b:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean p0, p0, La/xa50;->c:Z

    .line 23
    .line 24
    iget-boolean p1, p1, La/xa50;->c:Z

    .line 25
    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/xa50;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean p0, p0, La/xa50;->c:Z

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
    const-string v0, ", afterBet="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    const-string v2, "Coupon(couponIdToOpen="

    .line 6
    .line 7
    iget-object v3, p0, La/xa50;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean p0, p0, La/xa50;->c:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, p0, v1}, La/ua80;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
