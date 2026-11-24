.class public final La/kmj;
.super La/upj;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Z


# direct methods
.method public constructor <init>(IJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, La/kmj;->a:J

    .line 5
    .line 6
    iput p1, p0, La/kmj;->b:I

    .line 7
    .line 8
    iput-boolean p4, p0, La/kmj;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/kmj;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/kmj;

    .line 11
    .line 12
    iget-wide v1, p0, La/kmj;->a:J

    .line 13
    .line 14
    iget-wide v3, p1, La/kmj;->a:J

    .line 15
    .line 16
    cmp-long v1, v1, v3

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget v1, p0, La/kmj;->b:I

    .line 22
    .line 23
    iget v2, p1, La/kmj;->b:I

    .line 24
    .line 25
    if-eq v1, v2, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_3
    iget-boolean p0, p0, La/kmj;->c:Z

    .line 29
    .line 30
    iget-boolean p1, p1, La/kmj;->c:Z

    .line 31
    .line 32
    if-eq p0, p1, :cond_4

    .line 33
    .line 34
    :goto_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/kmj;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget v2, p0, La/kmj;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean p0, p0, La/kmj;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, p0}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/2addr v0, p0

    .line 28
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "CyberDiscipline(sportId="

    .line 2
    .line 3
    const-string v1, ", cyberType="

    .line 4
    .line 5
    iget v2, p0, La/kmj;->b:I

    .line 6
    .line 7
    iget-wide v3, p0, La/kmj;->a:J

    .line 8
    .line 9
    invoke-static {v2, v3, v4, v0, v1}, La/brm0;->q(IJLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", randomDiscipline="

    .line 14
    .line 15
    const-string v2, ", hasBackStack=false)"

    .line 16
    .line 17
    iget-boolean p0, p0, La/kmj;->c:Z

    .line 18
    .line 19
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
