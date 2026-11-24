.class public final La/imj;
.super La/upj;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/imj;->a:I

    .line 5
    .line 6
    iput-boolean p2, p0, La/imj;->b:Z

    .line 7
    .line 8
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
    instance-of v0, p1, La/imj;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/imj;

    .line 10
    .line 11
    iget v0, p0, La/imj;->a:I

    .line 12
    .line 13
    iget v1, p1, La/imj;->a:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean p0, p0, La/imj;->b:Z

    .line 19
    .line 20
    iget-boolean p1, p1, La/imj;->b:Z

    .line 21
    .line 22
    if-eq p0, p1, :cond_3

    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    mul-int/2addr v0, v1

    .line 9
    iget v2, p0, La/imj;->a:I

    .line 10
    .line 11
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-boolean p0, p0, La/imj;->b:Z

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    add-int/2addr p0, v0

    .line 22
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ", isEsportsWorldCup="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    iget v2, p0, La/imj;->a:I

    .line 6
    .line 7
    const-string v3, "Cyber(hasBackStack=false, cyberType="

    .line 8
    .line 9
    iget-boolean p0, p0, La/imj;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, p0}, La/rz4;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
