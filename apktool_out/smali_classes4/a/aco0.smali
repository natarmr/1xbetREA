.class public final La/aco0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:B


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    long-to-int p1, p1

    .line 5
    iput-byte p1, p0, La/aco0;->a:B

    .line 6
    .line 7
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
    instance-of v0, p1, La/aco0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/aco0;

    .line 10
    .line 11
    iget-byte p0, p0, La/aco0;->a:B

    .line 12
    .line 13
    int-to-long v0, p0

    .line 14
    iget-byte p0, p1, La/aco0;->a:B

    .line 15
    .line 16
    int-to-long p0, p0

    .line 17
    cmp-long p0, v0, p0

    .line 18
    .line 19
    if-eqz p0, :cond_2

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
    .locals 2

    .line 1
    iget-byte p0, p0, La/aco0;->a:B

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
    iget-byte p0, p0, La/aco0;->a:B

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    const-string p0, "TabMapModel(tabId="

    .line 5
    .line 6
    const-string v2, ")"

    .line 7
    .line 8
    invoke-static {v0, v1, p0, v2}, La/axq;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
