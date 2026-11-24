.class public final La/kr1;
.super La/lr1;
.source "SourceFile"


# instance fields
.field public final c:La/uc0;


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    new-instance v0, La/uc0;

    .line 2
    .line 3
    sget-object v1, La/nw80;->t:La/nw80;

    .line 4
    .line 5
    invoke-virtual {v1}, La/nw80;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    sget-object v1, La/gz8;->a:La/gz8;

    .line 10
    .line 11
    sget-object v9, La/iun;->a:La/iun;

    .line 12
    .line 13
    const-string v8, ""

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    const-wide/high16 v4, -0x8000000000000000L

    .line 18
    .line 19
    const-string v6, ""

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v10, 0x0

    .line 23
    invoke-direct/range {v0 .. v11}, La/uc0;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 24
    .line 25
    .line 26
    sget-object v1, La/mr1;->c:La/mr1;

    .line 27
    .line 28
    new-instance v2, La/km1;

    .line 29
    .line 30
    invoke-direct {v2, v0}, La/km1;-><init>(La/uc0;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v1, v2}, La/lr1;-><init>(La/mr1;La/tm1;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, La/kr1;->c:La/uc0;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/kr1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/kr1;

    .line 10
    .line 11
    iget-object p0, p0, La/kr1;->c:La/uc0;

    .line 12
    .line 13
    iget-object p1, p1, La/kr1;->c:La/uc0;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/uc0;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La/kr1;->c:La/uc0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/uc0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Providers(brandItemModel="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/kr1;->c:La/uc0;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ")"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
