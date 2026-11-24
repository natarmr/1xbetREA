.class public final La/fsi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vjn;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/fsi0;->a:I

    .line 5
    .line 6
    iput p2, p0, La/fsi0;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/z55;)V
    .locals 3

    .line 1
    iget-object v0, p1, La/z55;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/tyc;

    .line 4
    .line 5
    invoke-virtual {v0}, La/tyc;->B()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, La/fsi0;->a:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v1, v2, v0}, La/l1e0;->d(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p1, La/z55;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, La/tyc;

    .line 19
    .line 20
    invoke-virtual {v1}, La/tyc;->B()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget p0, p0, La/fsi0;->b:I

    .line 25
    .line 26
    invoke-static {p0, v2, v1}, La/l1e0;->d(III)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ge v0, p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v0, p0}, La/z55;->q(II)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {p1, p0, v0}, La/z55;->q(II)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/fsi0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/fsi0;

    .line 12
    .line 13
    iget v1, p1, La/fsi0;->a:I

    .line 14
    .line 15
    iget v3, p0, La/fsi0;->a:I

    .line 16
    .line 17
    if-eq v3, v1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget p0, p0, La/fsi0;->b:I

    .line 21
    .line 22
    iget p1, p1, La/fsi0;->b:I

    .line 23
    .line 24
    if-eq p0, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, La/fsi0;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget p0, p0, La/fsi0;->b:I

    .line 6
    .line 7
    add-int/2addr v0, p0

    .line 8
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ", end="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    const-string v2, "SetSelectionCommand(start="

    .line 6
    .line 7
    iget v3, p0, La/fsi0;->a:I

    .line 8
    .line 9
    iget p0, p0, La/fsi0;->b:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, p0}, La/ohs0;->m(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
