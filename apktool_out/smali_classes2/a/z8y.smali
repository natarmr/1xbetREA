.class public final La/z8y;
.super La/ere0;
.source "SourceFile"

# interfaces
.implements La/diy;


# instance fields
.field public final synthetic c:La/b9y;


# direct methods
.method public constructor <init>(La/b9y;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/z8y;->c:La/b9y;

    .line 2
    .line 3
    sget-object p1, La/rgy;->k:La/rgy;

    .line 4
    .line 5
    invoke-direct {p0, p1}, La/ere0;-><init>(La/rgy;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final G()La/bv9;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final H(La/ihy;La/rgy;)La/dre0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    const-string p1, "Property accessors can only be copied by copying the corresponding property"

    .line 10
    .line 11
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p0
.end method

.method public final K()La/ihy;
    .locals 0

    .line 1
    iget-object p0, p0, La/z8y;->c:La/b9y;

    .line 2
    .line 3
    iget-object p0, p0, La/b9y;->c:La/xgy;

    .line 4
    .line 5
    return-object p0
.end method

.method public final L()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/iiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/z8y;->c:La/b9y;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/z8y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/z8y;

    .line 6
    .line 7
    iget-object p1, p1, La/z8y;->c:La/b9y;

    .line 8
    .line 9
    iget-object p0, p0, La/z8y;->c:La/b9y;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/b9y;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

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

.method public final getAnnotations()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "<get-entries>"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReturnType()La/kiy;
    .locals 0

    .line 1
    iget-object p0, p0, La/z8y;->c:La/b9y;

    .line 2
    .line 3
    invoke-virtual {p0}, La/b9y;->getReturnType()La/kiy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVisibility()La/viy;
    .locals 0

    .line 1
    sget-object p0, La/viy;->a:La/viy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La/z8y;->c:La/b9y;

    .line 2
    .line 3
    invoke-virtual {p0}, La/b9y;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/z8y;->c:La/b9y;

    .line 2
    .line 3
    iget-object p0, p0, La/b9y;->d:La/a0o;

    .line 4
    .line 5
    return-object p0
.end method

.method public final isExternal()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isInfix()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isInline()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isOperator()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isSuspend()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m()La/fm40;
    .locals 0

    .line 1
    sget-object p0, La/fm40;->b:La/fm40;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "getter of "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/z8y;->c:La/b9y;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final x()La/bv9;
    .locals 0

    .line 1
    iget-object p0, p0, La/z8y;->c:La/b9y;

    .line 2
    .line 3
    iget-object p0, p0, La/b9y;->f:La/a9y;

    .line 4
    .line 5
    return-object p0
.end method
