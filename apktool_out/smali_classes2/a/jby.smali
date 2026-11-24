.class public final La/jby;
.super La/eby;
.source "SourceFile"


# instance fields
.field public final e:La/o2i0;

.field public final synthetic f:La/pby;


# direct methods
.method public constructor <init>(La/pby;La/o2i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jby;->f:La/pby;

    .line 2
    .line 3
    invoke-direct {p0}, La/hu00;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, La/jby;->e:La/o2i0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final l()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, La/jby;->f:La/pby;

    .line 2
    .line 3
    invoke-virtual {p1}, La/pby;->H()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, La/udd;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0}, La/qby;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    iget-object p0, p0, La/jby;->e:La/o2i0;

    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, La/o2i0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method
