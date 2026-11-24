.class public final La/q5c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/r5c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:La/swp0;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/q5c;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, La/q5c;->b:I

    .line 7
    .line 8
    sget-object p1, La/obk0;->c:La/obk0;

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, La/q5c;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/q5c;->d:Ljava/util/List;

    .line 21
    .line 22
    new-instance p1, La/swp0;

    .line 23
    .line 24
    const-string p2, ""

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-direct {p1, p2, p2, v0}, La/swp0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/q5c;->e:La/swp0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final N()I
    .locals 0

    .line 1
    iget p0, p0, La/q5c;->b:I

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
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/q5c;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/q5c;

    .line 11
    .line 12
    iget-object v1, p0, La/q5c;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p1, La/q5c;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget p0, p0, La/q5c;->b:I

    .line 24
    .line 25
    iget p1, p1, La/q5c;->b:I

    .line 26
    .line 27
    if-eq p0, p1, :cond_3

    .line 28
    .line 29
    :goto_0
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_3
    return v0
.end method

.method public final getPhoneNumber()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/q5c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getToken()La/swp0;
    .locals 0

    .line 1
    iget-object p0, p0, La/q5c;->e:La/swp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, La/q5c;->a:Ljava/lang/String;

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
    iget p0, p0, La/q5c;->b:I

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/2addr v0, p0

    .line 22
    return v0
.end method

.method public final p()I
    .locals 0

    .line 1
    const/16 p0, 0xe

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ", smsTime="

    .line 2
    .line 3
    const-string v1, ", isRepeatFlow=false)"

    .line 4
    .line 5
    iget v2, p0, La/q5c;->b:I

    .line 6
    .line 7
    const-string v3, "AuthenticatorMigration(phoneNumber="

    .line 8
    .line 9
    iget-object p0, p0, La/q5c;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, p0, v0, v1}, La/dw9;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final u()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/q5c;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
