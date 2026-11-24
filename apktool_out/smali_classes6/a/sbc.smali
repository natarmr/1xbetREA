.class public final La/sbc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    long-to-int p2, p2

    .line 8
    iput-boolean p2, p0, La/sbc;->a:Z

    .line 9
    .line 10
    iput-object p1, p0, La/sbc;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p4, p0, La/sbc;->c:Z

    .line 13
    .line 14
    return-void
.end method

.method public static a(La/sbc;Z)La/sbc;
    .locals 3

    .line 1
    iget-boolean v0, p0, La/sbc;->a:Z

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    iget-object p0, p0, La/sbc;->b:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v2, La/sbc;

    .line 10
    .line 11
    invoke-direct {v2, p0, v0, v1, p1}, La/sbc;-><init>(Ljava/lang/String;JZ)V

    .line 12
    .line 13
    .line 14
    return-object v2
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/sbc;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/sbc;

    .line 10
    .line 11
    iget-boolean v0, p0, La/sbc;->a:Z

    .line 12
    .line 13
    int-to-long v0, v0

    .line 14
    iget-boolean v2, p1, La/sbc;->a:Z

    .line 15
    .line 16
    int-to-long v2, v2

    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/sbc;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/sbc;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-boolean p0, p0, La/sbc;->c:Z

    .line 34
    .line 35
    iget-boolean p1, p1, La/sbc;->c:Z

    .line 36
    .line 37
    if-eq p0, p1, :cond_4

    .line 38
    .line 39
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/sbc;->a:Z

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    mul-int/2addr v0, v1

    .line 11
    iget-object v2, p0, La/sbc;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-boolean p0, p0, La/sbc;->c:Z

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    add-int/2addr p0, v0

    .line 24
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-boolean v0, p0, La/sbc;->a:Z

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-string v2, "ChipUiModel(chipId="

    .line 5
    .line 6
    const-string v3, ", chipTitle="

    .line 7
    .line 8
    iget-object v4, p0, La/sbc;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, ", isSelected="

    .line 15
    .line 16
    const-string v2, ")"

    .line 17
    .line 18
    iget-boolean p0, p0, La/sbc;->c:Z

    .line 19
    .line 20
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
