.class public final La/t5x0;
.super La/fpw0;
.source "SourceFile"


# instance fields
.field public final a:La/x4w0;


# direct methods
.method public constructor <init>(La/x4w0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/t5x0;->a:La/x4w0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/t5x0;->a:La/x4w0;

    .line 2
    .line 3
    iget-object p0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/lpw0;

    .line 6
    .line 7
    sget-object v0, La/lpw0;->e:La/lpw0;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, La/t5x0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, La/t5x0;

    .line 7
    .line 8
    iget-object p1, p1, La/t5x0;->a:La/x4w0;

    .line 9
    .line 10
    iget-object p0, p0, La/t5x0;->a:La/x4w0;

    .line 11
    .line 12
    iget-object v0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/lpw0;

    .line 15
    .line 16
    iget-object v1, p1, La/x4w0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, La/lpw0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v1, p1, La/x4w0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object p0, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, La/sjw0;

    .line 43
    .line 44
    iget-object p1, p1, La/x4w0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, La/sjw0;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/sjw0;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 57
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object p0, p0, La/t5x0;->a:La/x4w0;

    .line 2
    .line 3
    iget-object v0, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/sjw0;

    .line 10
    .line 11
    iget-object p0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/lpw0;

    .line 14
    .line 15
    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p0, p0, La/t5x0;->a:La/x4w0;

    .line 2
    .line 3
    iget-object v0, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/lpw0;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "(typeUrl="

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ", outputPrefixType="

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, ")"

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
