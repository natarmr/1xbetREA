.class public final La/a3p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b3p;


# instance fields
.field public final a:La/imm;


# direct methods
.method public constructor <init>(La/imm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a3p;->a:La/imm;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()La/imm;
    .locals 0

    .line 1
    iget-object p0, p0, La/a3p;->a:La/imm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/a3p;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/a3p;

    .line 10
    .line 11
    iget-object p0, p0, La/a3p;->a:La/imm;

    .line 12
    .line 13
    iget-object p1, p1, La/a3p;->a:La/imm;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/imm;->equals(Ljava/lang/Object;)Z

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
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, La/a3p;->a:La/imm;

    .line 10
    .line 11
    invoke-virtual {p0}, La/imm;->hashCode()I

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
    .locals 2

    .line 1
    const-string v0, "Loading(countShimmers=10, dsNavigationBarUiModel="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    iget-object p0, p0, La/a3p;->a:La/imm;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, La/rz4;->k(La/imm;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
