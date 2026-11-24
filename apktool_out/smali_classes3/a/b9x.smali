.class public final La/b9x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:La/ugg0;


# direct methods
.method public constructor <init>(JLa/ugg0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/b9x;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/b9x;->b:La/ugg0;

    .line 7
    .line 8
    return-void
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
    instance-of v0, p1, La/b9x;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/b9x;

    .line 10
    .line 11
    iget-wide v0, p1, La/b9x;->a:J

    .line 12
    .line 13
    sget v2, La/y3d;->h:I

    .line 14
    .line 15
    iget-wide v2, p0, La/b9x;->a:J

    .line 16
    .line 17
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object p0, p0, La/b9x;->b:La/ugg0;

    .line 25
    .line 26
    iget-object p1, p1, La/b9x;->b:La/ugg0;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/ugg0;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    :goto_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const v0, 0x7f080996

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    mul-int/lit16 v0, v0, 0x3c1

    .line 9
    .line 10
    sget v1, La/y3d;->h:I

    .line 11
    .line 12
    sget-object v1, La/h2t0;->b:La/g2t0;

    .line 13
    .line 14
    const/16 v1, 0x1f

    .line 15
    .line 16
    iget-wide v2, p0, La/b9x;->a:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object p0, p0, La/b9x;->b:La/ugg0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/ugg0;->hashCode()I

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
    iget-wide v0, p0, La/b9x;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", iconTint=null, backgroundColor="

    .line 8
    .line 9
    const-string v2, ", shape="

    .line 10
    .line 11
    const v3, 0x7f080996

    .line 12
    .line 13
    .line 14
    const-string v4, "InfoLabelIconUiModel(iconRes="

    .line 15
    .line 16
    invoke-static {v3, v4, v1, v0, v2}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object p0, p0, La/b9x;->b:La/ugg0;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, ")"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
