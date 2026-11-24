.class public final La/p5c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/r5c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Z

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:La/swp0;


# direct methods
.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p5c;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, La/p5c;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, La/p5c;->c:Z

    .line 9
    .line 10
    sget-object p1, La/obk0;->c:La/obk0;

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iput-object p2, p0, La/p5c;->d:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/p5c;->e:Ljava/util/List;

    .line 23
    .line 24
    new-instance p1, La/swp0;

    .line 25
    .line 26
    const-string p2, ""

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-direct {p1, p2, p2, p3}, La/swp0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/p5c;->f:La/swp0;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final N()I
    .locals 0

    .line 1
    iget p0, p0, La/p5c;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final P()La/obk0;
    .locals 0

    .line 1
    sget-object p0, La/obk0;->c:La/obk0;

    .line 2
    .line 3
    return-object p0
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
    instance-of v0, p1, La/p5c;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/p5c;

    .line 10
    .line 11
    iget-object v0, p0, La/p5c;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/p5c;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/p5c;->b:I

    .line 23
    .line 24
    iget v1, p1, La/p5c;->b:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-boolean p0, p0, La/p5c;->c:Z

    .line 30
    .line 31
    iget-boolean p1, p1, La/p5c;->c:Z

    .line 32
    .line 33
    if-eq p0, p1, :cond_4

    .line 34
    .line 35
    :goto_0
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 38
    return p0
.end method

.method public final getPhoneNumber()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/p5c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getToken()La/swp0;
    .locals 0

    .line 1
    iget-object p0, p0, La/p5c;->f:La/swp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/p5c;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget v2, p0, La/p5c;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean p0, p0, La/p5c;->c:Z

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final p()I
    .locals 0

    .line 1
    const/16 p0, 0xd

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", smsTime="

    .line 2
    .line 3
    const-string v1, ", isRepeatFlow="

    .line 4
    .line 5
    iget v2, p0, La/p5c;->b:I

    .line 6
    .line 7
    const-string v3, "AuthenticatorConfirmation(phoneNumber="

    .line 8
    .line 9
    iget-object v4, p0, La/p5c;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, La/kng0;->p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ")"

    .line 16
    .line 17
    iget-boolean p0, p0, La/p5c;->c:Z

    .line 18
    .line 19
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final u()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/p5c;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/p5c;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
