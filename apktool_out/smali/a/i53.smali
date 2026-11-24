.class public final La/i53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/c53;


# instance fields
.field public final a:La/oms0;

.field public b:La/u12;

.field public final c:La/pz40;

.field public final d:La/hz40;


# direct methods
.method public constructor <init>(La/oms0;La/u12;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/i53;->a:La/oms0;

    .line 5
    .line 6
    iput-object p2, p0, La/i53;->b:La/u12;

    .line 7
    .line 8
    new-instance p1, La/qkx;

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, La/qkx;-><init>(J)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, La/i53;->c:La/pz40;

    .line 20
    .line 21
    sget-object p1, La/u1h0;->a:[J

    .line 22
    .line 23
    new-instance p1, La/hz40;

    .line 24
    .line 25
    invoke-direct {p1}, La/hz40;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/i53;->d:La/hz40;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(La/lie;La/u7k0;)La/lie;
    .locals 0

    .line 1
    iput-object p2, p1, La/lie;->d:La/u7k0;

    .line 2
    .line 3
    return-object p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/i53;->a:La/oms0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/oms0;->f()La/ams0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, La/ams0;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final d()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/i53;->a:La/oms0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/oms0;->f()La/ams0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, La/ams0;->d()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
