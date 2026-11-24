.class public final La/x7x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/l7m0;


# instance fields
.field public a:Ljava/lang/Float;

.field public b:Ljava/lang/Float;

.field public final c:La/pz40;

.field public d:La/wto0;

.field public e:Z

.field public f:Z

.field public g:J

.field public final synthetic h:La/z7x;


# direct methods
.method public constructor <init>(La/z7x;Ljava/lang/Float;Ljava/lang/Float;La/w7x;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/x7x;->h:La/z7x;

    .line 5
    .line 6
    iput-object p2, p0, La/x7x;->a:Ljava/lang/Float;

    .line 7
    .line 8
    iput-object p3, p0, La/x7x;->b:Ljava/lang/Float;

    .line 9
    .line 10
    invoke-static {p2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/x7x;->c:La/pz40;

    .line 15
    .line 16
    new-instance v0, La/wto0;

    .line 17
    .line 18
    iget-object v3, p0, La/x7x;->a:Ljava/lang/Float;

    .line 19
    .line 20
    iget-object v4, p0, La/x7x;->b:Ljava/lang/Float;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    sget-object v2, La/hp4;->j:La/lxs0;

    .line 24
    .line 25
    move-object v1, p4

    .line 26
    invoke-direct/range {v0 .. v5}, La/wto0;-><init>(La/j73;La/lxs0;Ljava/lang/Object;Ljava/lang/Object;La/t73;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/x7x;->d:La/wto0;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/x7x;->c:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
