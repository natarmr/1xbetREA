.class public final La/osv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:B

.field public final b:Ljava/lang/String;

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    long-to-int p3, p3

    .line 5
    iput-byte p3, p0, La/osv;->a:B

    .line 6
    .line 7
    iput-object p1, p0, La/osv;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput p2, p0, La/osv;->c:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/osv;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/osv;

    .line 10
    .line 11
    iget-byte v0, p0, La/osv;->a:B

    .line 12
    .line 13
    int-to-long v0, v0

    .line 14
    iget-byte v2, p1, La/osv;->a:B

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
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, La/osv;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/osv;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget p0, p0, La/osv;->c:I

    .line 34
    .line 35
    iget p1, p1, La/osv;->c:I

    .line 36
    .line 37
    if-ne p0, p1, :cond_4

    .line 38
    .line 39
    :goto_0
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/osv;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/osv;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p1, La/osv;

    .line 16
    .line 17
    iget-byte p0, p1, La/osv;->a:B

    .line 18
    .line 19
    int-to-long p0, p0

    .line 20
    check-cast p2, La/osv;

    .line 21
    .line 22
    iget-byte p2, p2, La/osv;->a:B

    .line 23
    .line 24
    int-to-long v0, p2

    .line 25
    cmp-long p0, p0, v0

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public final h(La/p6t0;La/p6t0;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2, p1, p2}, La/rw2;->y(La/p6t0;La/p6t0;La/p6t0;La/p6t0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-byte v0, p0, La/osv;->a:B

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
    const/4 v2, 0x0

    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/osv;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, La/osv;->c:I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final o(La/p6t0;La/p6t0;)Ljava/util/Collection;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/osv;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/osv;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast p1, La/osv;

    .line 21
    .line 22
    iget-object v0, p1, La/osv;->b:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v1, La/isv;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/isv;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p2, La/osv;

    .line 30
    .line 31
    iget-object v0, p2, La/osv;->b:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v2, La/isv;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/isv;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget p1, p1, La/osv;->c:I

    .line 42
    .line 43
    new-instance v0, La/jsv;

    .line 44
    .line 45
    invoke-direct {v0, p1}, La/jsv;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iget p1, p2, La/osv;->c:I

    .line 49
    .line 50
    new-instance p2, La/jsv;

    .line 51
    .line 52
    invoke-direct {p2, p1}, La/jsv;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_0

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_0
    const/4 p0, 0x0

    .line 66
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-byte v0, p0, La/osv;->a:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-string v2, "Name(value="

    .line 5
    .line 6
    iget-object v3, p0, La/osv;->b:Ljava/lang/String;

    .line 7
    .line 8
    const-string v4, ")"

    .line 9
    .line 10
    invoke-static {v2, v3, v4}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget p0, p0, La/osv;->c:I

    .line 15
    .line 16
    const-string v3, "TextColor(value="

    .line 17
    .line 18
    invoke-static {p0, v3, v4}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v3, "HeaderUiModel(id="

    .line 23
    .line 24
    const-string v5, ", needGreedManager=false, name="

    .line 25
    .line 26
    invoke-static {v0, v1, v3, v5, v2}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, ", textColor="

    .line 31
    .line 32
    invoke-static {v0, v1, p0, v4}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
