.class public final La/rfp;
.super La/t9p;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:La/ftr;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/ftr;)V
    .locals 1

    .line 1
    iget-object v0, p2, La/ftr;->a:La/a4x;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, La/t9p;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/rfp;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p2, p0, La/rfp;->c:La/ftr;

    .line 9
    .line 10
    return-void
.end method

.method public static c(La/rfp;La/ftr;)La/rfp;
    .locals 1

    .line 1
    iget-object v0, p0, La/rfp;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, La/rfp;

    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, La/rfp;-><init>(Ljava/lang/String;La/ftr;)V

    .line 9
    .line 10
    .line 11
    return-object p0
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
    instance-of v0, p1, La/rfp;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/rfp;

    .line 10
    .line 11
    iget-object v0, p0, La/rfp;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/rfp;->b:Ljava/lang/String;

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
    iget-object p0, p0, La/rfp;->c:La/ftr;

    .line 23
    .line 24
    iget-object p1, p1, La/rfp;->c:La/ftr;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/ftr;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/rfp;->b:Ljava/lang/String;

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
    iget-object p0, p0, La/rfp;->c:La/ftr;

    .line 10
    .line 11
    iget-object p0, p0, La/ftr;->a:La/a4x;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FavouriteGameCardCollection(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/rfp;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", content="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/rfp;->c:La/ftr;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ")"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
