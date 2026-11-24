.class public final La/gac;
.super La/eby;
.source "SourceFile"

# interfaces
.implements La/fac;


# instance fields
.field public final e:La/jac;


# direct methods
.method public constructor <init>(La/jac;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/hu00;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gac;->e:La/jac;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/eby;->k()La/pby;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La/pby;->x(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final getParent()La/bby;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/eby;->k()La/pby;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/eby;->k()La/pby;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/gac;->e:La/jac;

    .line 6
    .line 7
    check-cast p0, La/pby;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/pby;->r(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method
