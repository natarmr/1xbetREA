.class public final La/s9y;
.super La/q9y;
.source "SourceFile"

# interfaces
.implements La/diy;
.implements La/ciy;


# instance fields
.field public final c:La/a8z;

.field public final d:La/t9y;


# direct methods
.method public constructor <init>(La/t9y;)V
    .locals 3

    .line 1
    invoke-direct {p0}, La/q9y;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/wez;->a:La/wez;

    .line 5
    .line 6
    new-instance v1, La/aaw;

    .line 7
    .line 8
    const/16 v2, 0xb

    .line 9
    .line 10
    invoke-direct {v1, p0, v2}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/s9y;->c:La/a8z;

    .line 18
    .line 19
    iput-object p1, p0, La/s9y;->d:La/t9y;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 2
    .line 3
    invoke-virtual {p0}, La/t9y;->a()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c()La/iiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/s9y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/s9y;

    .line 6
    .line 7
    iget-object p1, p1, La/s9y;->d:La/t9y;

    .line 8
    .line 9
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 10
    .line 11
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "<get-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 9
    .line 10
    invoke-virtual {p0}, La/t9y;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 p0, 0x3e

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 2
    .line 3
    invoke-virtual {p0}, La/t9y;->getParameters()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getReturnType()La/kiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 2
    .line 3
    invoke-virtual {p0}, La/t9y;->getReturnType()La/kiy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 2
    .line 3
    invoke-virtual {p0}, La/t9y;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 2
    .line 3
    invoke-virtual {p0}, La/t9y;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final p()La/t9y;
    .locals 0

    .line 1
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "getter of "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/s9y;->d:La/t9y;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final x()La/bv9;
    .locals 0

    .line 1
    iget-object p0, p0, La/s9y;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bv9;

    .line 8
    .line 9
    return-object p0
.end method
