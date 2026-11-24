.class public final La/xip;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:B

.field public final b:I

.field public final c:Z

.field public final d:Z


# direct methods
.method public constructor <init>(IIZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, La/xip;->a:B

    .line 5
    .line 6
    iput p2, p0, La/xip;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, La/xip;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, La/xip;->d:Z

    .line 11
    .line 12
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
    instance-of v0, p1, La/xip;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/xip;

    .line 10
    .line 11
    iget-byte v0, p0, La/xip;->a:B

    .line 12
    .line 13
    iget-byte v1, p1, La/xip;->a:B

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, La/xip;->b:I

    .line 19
    .line 20
    iget v1, p1, La/xip;->b:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean v0, p0, La/xip;->c:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/xip;->c:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-boolean p0, p0, La/xip;->d:Z

    .line 33
    .line 34
    iget-boolean p1, p1, La/xip;->d:Z

    .line 35
    .line 36
    if-eq p0, p1, :cond_5

    .line 37
    .line 38
    :goto_0
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-byte v0, p0, La/xip;->a:B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget v2, p0, La/xip;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/xip;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean p0, p0, La/xip;->d:Z

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", iconResId="

    .line 2
    .line 3
    const-string v1, ", selected="

    .line 4
    .line 5
    const-string v2, "FeedNavigationBarButtonModel(buttonId="

    .line 6
    .line 7
    iget-byte v3, p0, La/xip;->a:B

    .line 8
    .line 9
    iget v4, p0, La/xip;->b:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", clickable="

    .line 16
    .line 17
    const-string v2, ")"

    .line 18
    .line 19
    iget-boolean v3, p0, La/xip;->c:Z

    .line 20
    .line 21
    iget-boolean p0, p0, La/xip;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
