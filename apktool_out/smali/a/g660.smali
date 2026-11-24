.class public final La/g660;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hms0;


# instance fields
.field public final a:La/cns0;

.field public final b:La/u1x;


# direct methods
.method public constructor <init>(La/cns0;La/u1x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/g660;->a:La/cns0;

    .line 5
    .line 6
    iput-object p2, p0, La/g660;->b:La/u1x;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/g660;->b:La/u1x;

    .line 2
    .line 3
    instance-of v1, v0, La/hhn0;

    .line 4
    .line 5
    iget-object p0, p0, La/g660;->a:La/cns0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, La/hhn0;

    .line 10
    .line 11
    iget-object v0, v0, La/hhn0;->a:La/dyw;

    .line 12
    .line 13
    invoke-interface {p0, v0}, La/uto0;->onSuccess(La/dyw;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v1, v0, La/r1o;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast v0, La/r1o;

    .line 22
    .line 23
    iget-object v0, v0, La/r1o;->a:La/dyw;

    .line 24
    .line 25
    invoke-interface {p0, v0}, La/uto0;->onError(La/dyw;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
