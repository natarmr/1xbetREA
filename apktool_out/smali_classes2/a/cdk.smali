.class public abstract La/cdk;
.super La/ock;
.source "SourceFile"

# interfaces
.implements La/jhy;
.implements La/biy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, La/rgy;->k:La/rgy;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/ock;-><init>(La/rgy;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract A()La/b0d0;
.end method

.method public abstract B()La/rdk;
.end method

.method public final G()La/bv9;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final K()La/ihy;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/cdk;->B()La/rdk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/rdk;->h:La/ihy;

    .line 6
    .line 7
    return-object p0
.end method

.method public final L()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/cdk;->B()La/rdk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/rdk;->k:Ljava/lang/Object;

    .line 6
    .line 7
    return-object p0
.end method

.method public final isExternal()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/cdk;->A()La/b0d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, La/b0d0;->g:Z

    .line 6
    .line 7
    return p0
.end method

.method public final isInfix()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/cdk;->A()La/b0d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final isInline()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/cdk;->A()La/b0d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, La/b0d0;->j:Z

    .line 6
    .line 7
    return p0
.end method

.method public final isOperator()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/cdk;->A()La/b0d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final isSuspend()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/cdk;->A()La/b0d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0
.end method
