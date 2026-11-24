.class public final La/odd;
.super La/pby;
.source "SourceFile"

# interfaces
.implements La/ndd;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, La/pby;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, La/pby;->K(La/bby;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final await(La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, La/wne;->a:La/wne;

    .line 6
    .line 7
    return-object p0
.end method

.method public final b0(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    new-instance v0, La/udd;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, La/udd;-><init>(Ljava/lang/Throwable;Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/pby;->N(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final getOnAwait()La/i1i0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/pby;->E()La/n660;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
