.class public final La/wqy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/util/Set;

.field public final d:La/pcy;


# direct methods
.method public constructor <init>(Ljava/util/Set;La/pcy;)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    const v1, 0x17c2043c

    .line 13
    .line 14
    .line 15
    iput v1, p0, La/wqy;->a:I

    .line 16
    .line 17
    iput-object v0, p0, La/wqy;->b:Ljava/lang/Integer;

    .line 18
    .line 19
    iput-object p1, p0, La/wqy;->c:Ljava/util/Set;

    .line 20
    .line 21
    iput-object p2, p0, La/wqy;->d:La/pcy;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, La/wqy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, La/wqy;->a:I

    .line 6
    .line 7
    int-to-long v0, p0

    .line 8
    check-cast p1, La/wqy;

    .line 9
    .line 10
    iget p0, p1, La/wqy;->a:I

    .line 11
    .line 12
    int-to-long p0, p0

    .line 13
    cmp-long p0, v0, p0

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget p0, p0, La/wqy;->a:I

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, La/wqy;->a:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    iget-object p0, p0, La/wqy;->b:Ljava/lang/Integer;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    const-string p0, " without alias"

    .line 9
    .line 10
    invoke-static {v0, v1, p0}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, " with alias "

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
