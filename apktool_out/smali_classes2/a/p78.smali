.class public abstract La/p78;
.super La/b4e;
.source "SourceFile"


# virtual methods
.method public final c()La/b4e;
    .locals 0

    .line 1
    iget-object p0, p0, La/b4e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/b4e;

    .line 4
    .line 5
    check-cast p0, La/p78;

    .line 6
    .line 7
    return-object p0
.end method

.method public final e(La/b4e;)V
    .locals 1

    .line 1
    instance-of v0, p1, La/p78;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, La/b4e;->b:Ljava/lang/Object;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Parent of block must also be block (can not be inline)"

    .line 9
    .line 10
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
