.class public final La/fsd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/bsd;

.field public final b:La/vdf;


# direct methods
.method public constructor <init>(La/bsd;La/vdf;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/fsd;->a:La/bsd;

    .line 11
    .line 12
    iput-object p2, p0, La/fsd;->b:La/vdf;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()La/v8d;
    .locals 0

    .line 1
    iget-object p0, p0, La/fsd;->a:La/bsd;

    .line 2
    .line 3
    iget-object p0, p0, La/bsd;->c:La/n0o0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/v8d;

    .line 10
    .line 11
    return-object p0
.end method

.method public final b()La/k0j0;
    .locals 0

    .line 1
    iget-object p0, p0, La/fsd;->a:La/bsd;

    .line 2
    .line 3
    iget-object p0, p0, La/bsd;->b:La/n0o0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/k0j0;

    .line 10
    .line 11
    return-object p0
.end method
